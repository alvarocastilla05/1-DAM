/*Selecciona los datos del inmueble sobre el que se ha realizado una operación un lunes de
febrero o un viernes de marzo, que tenga más de 200 metros cuadrados y donde el nombre del 
vendedor contenga una A mayúscula o minúscula.*/


SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
	JOIN vendedor USING (id_vendedor)
WHERE TO_CHAR(fecha_operacion, 'DAY/MM/YYYY ') 
	AND nombre ILIKE ('%a%')
	AND superficie > 200;
	
--Corregido.(FORMA LARGA)
SELECT inmueble.*
FROM inmueble JOIN operacion USING (id_inmueble)
	JOIN vendedor USING (id_vendedor)
WHERE (TO_CHAR(fecha_operacion, 'ID') = '1'
	   AND 
	   TO_CHAR (fecha_operacion, 'MM') = '02')
	   OR
	   (TO_CHAR(fecha_operacion, 'ID') = '5'
	   AND 
	   TO_CHAR (fecha_operacion, 'MM') = '03') 
	AND nombre ILIKE '%a%'
	AND superficie > 200;
--Corregido(FORMA CORTA)
SELECT inmueble.*
FROM inmueble JOIN operacion USING (id_inmueble)
	JOIN vendedor USING (id_vendedor)
WHERE TO_CHAR(fecha_operacion, 'ID-MM') IN ('1-02', '5-03')
	AND nombre ILIKE '%a%'
	AND superficie > 200;

/*2. Selecciona el precio medio por metro cuadrado de los alquileres de viviendas 
en los meses de marzo y abril de cualquier año para las provincias costeras de Andalucía.*/

SELECT avg(precio/superficie) AS mediaM2
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia IN ('Cádiz', 'Huelva', 'Málaga', 'Almería', 'Granada')
	AND  TO_CHAR(fecha_operacion, 'MM') = '03' 
	OR TO_CHAR(fecha_operacion, 'MM') = '04'
	AND tipo_operacion = 'Alquiler';
	
--Corregido.
SELECT ROUND(avg(precio/superficie),2) AS mediaM2
FROM inmueble JOIN tipo ON (tipo_inmueble = id_tipo)
WHERE EXTRACT( MONTH from fecha_alta) IN (3,4)	
	AND provincia IN ('Huelva', 'Cádiz', 'Málaga','Almería', 'Granada')
	AND nombre IN ('Casa','Piso')
	AND tipo_operacion = 'Alquiler';

/*3. ¿Cuál es la media del porcentaje de diferencia entre el precio inicial 
(en la tabla inmueble) y el precio final (en la tabla operación)
para aquellas operaciones de alquiler realizadas en enero de cualquier año, 
donde el tipo del inmueble es Oficina, Local o Suelo?*/

SELECT ROUND(avg(precio/precio_final*100),2)
FROM inmueble i JOIN operacion USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE  TO_CHAR(fecha_operacion, 'MM') = '01'
	AND nombre IN ('Oficina', 'Local', 'Suelo');
 
--Corregido.
SELECT ROUND(AVG((ABS(precio-precio_final)/precio)*100),2)  --Valor absoluto (ABS)
FROM inmueble JOIN operacion USING (id_inmueble)
			JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE nombre IN ('Oficina', 'Local', 'Suelo')
	AND TO_CHAR(fecha_operacion, 'MM') = '01'
	AND tipo_operacion = 'Alquiler';

 
/*4. Seleccionar el nombre de aquellos compradores de Casa o Piso en las provincias de Jaén o 
Córdoba, donde el precio final de inmueble esté entre 150.000 y 200.000€, para aquellos 
inmuebles que han tardado entre 3 y 4 meses en venderse.*/

SELECT c.nombre
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
<<<<<<< HEAD
	JOIN tipo t ON(tipo_inmueble = id_inmueble)
=======
	JOIN tipo t ON (tipo_inmueble=id_tipo)
>>>>>>> b114030eb025b5686a7d91384e41688bb52856e6
WHERE t.nombre IN ('Casa', 'Piso')
	AND provincia IN ('Jaén', 'Córdoba')
	AND precio BETWEEN 150000 AND 200000
	AND (fecha_operacion-fecha_alta) BETWEEN 90 AND 120; --Esta línea está MAL.
	
--Corregido.
SELECT c.nombre 
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE t.nombre IN ('Casa', 'Piso')
	AND provincia IN ('Jaén','Córdoba')
	AND tipo_operacion = 'Venta'
	AND precio_final BETWEEN 150000 AND 200000
	--AND AGE(fecha_operacion, fecha_alta) BETWEEN '3 mon'::interval AND '4 mon'::interval; --AGE(mayor,menor).
	AND fecha_operacion BETWEEN 
		fecha_alta + '3 mons'::interval AND 
		fecha_alta + '4 mons'::interval;--Otra opción para la fecha.
		
/*5. Selecciona la media del precio inicial (en la tabla inmueble), del precio final
(en la tabla operación) y de la diferencia en porcentaje entre ellas de aquellas viviendas 
(Casa o Piso) en alquiler que tengan menos de 100 metros cuadrados y que hayan tardado un año o
más en alquilarse.*/

SELECT ROUND(avg (precio),2) , 
    ROUND(avg (precio_final),2) ,
    ROUND(avg ((precio / precio_final)*100),2) AS "porcentaje_precio"
FROM inmueble  JOIN operacion  USING (id_inmueble)
        JOIN tipo  ON (tipo_inmueble = id_tipo)
WHERE  nombre IN ('Casa','Piso')
	AND superficie > 100
	AND fecha_operacion-fecha_alta >= 365;
  
--Corregido.
SELECT AVG(precio), AVG(precio_final)
FROM inmueble JOIN tipo ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (id_inmueble)
WHERE nombre IN ('Casa','Piso')
	AND superficie < 100 
	AND tipo_operacion = 'Alquiler'
	AND fecha_operacion >=
	fecha_alta + '1 year'::interval;



/*6. Selecciona el alquiler de vivienda (Casa o Piso) más caro realizado en Julio o 
Agosto de cualquier año en la provincia de Huelva.*/

SELECT MAX(precio) 
FROM inmueble CROSS JOIN tipo
	JOIN operacion USING (id_inmueble)
WHERE nombre IN ('Casa', 'Piso')
	AND provincia = 'Huelva'
	AND TO_CHAR(fecha_operacion, 'MM') IN ('07', '08');


/*Selecciona el precio inicial en el mes de agosto en la provincia de Jaén tipo Industrial, 
ordenalo de forma descendente*/

SELECT precio 
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE provincia = 'Jaén'
	AND TO_CHAR(fecha_operacion, 'MM') = '08'
	AND nombre = 'Industrial'
ORDER BY precio DESC;


	



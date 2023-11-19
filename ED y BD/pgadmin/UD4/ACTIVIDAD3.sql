/*Selecciona los datos del inmueble sobre el que se ha realizado una operación un lunes de
febrero o un viernes de marzo, que tenga más de 200 metros cuadrados y donde el nombre del 
vendedor contenga una A mayúscula o minúscula.*/


SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
	JOIN vendedor USING (id_vendedor)
WHERE TO_CHAR(fecha_operacion, 'DAY/MM/YYYY ')
	AND nombre ILIKE ('%a%')
	AND superficie > 200;

/*2. Selecciona el precio medio por metro cuadrado de los alquileres de viviendas 
en los meses de marzo y abril de cualquier año para las provincias costeras de Andalucía.*/

SELECT avg(precio)
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia IN ('Cádiz', 'Huelva', 'Málaga', 'Almería', 'Granada')
	AND  TO_CHAR(fecha_operacion, 'MM') = '03' 
	OR TO_CHAR(fecha_operacion, 'MM') = '04';
	
/*3. ¿Cuál es la media del porcentaje de diferencia entre el precio inicial 
(en la tabla inmueble) y el precio final (en la tabla operación)
para aquellas operaciones de alquiler realizadas en enero de cualquier año, 
donde el tipo del inmueble es Oficina, Local o Suelo?*/

SELECT *
FROM inmueble i JOIN tipo ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (operacion_id)
WHERE fecha_operacion TO_CHAR(fecha_operacion, 'MM') = '03'
 AND tipo_inmueble IN ('Oficina', 'Local', 'Suelo');
 
 
/*4. Seleccionar el nombre de aquellos compradores de Casa o Piso en las provincias de Jaén o 
Córdoba, donde el precio final de inmueble esté entre 150.000 y 200.000€, para aquellos 
inmuebles que han tardado entre 3 y 4 meses en venderse.*/

SELECT c.nombre
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t USING (id_tipo)
WHERE t.nombre IN ('Casa', 'Piso')
	AND provincia IN ('Jaén', 'Córdoba')
	AND precio BETWEEN 150000 AND 200000
	AND 
	
/*5. Selecciona la media del precio inicial (en la tabla inmueble), del precio final
(en la tabla operación) y de la diferencia en porcentaje entre ellas de aquellas viviendas 
(Casa o Piso) en alquiler que tengan menos de 100 metros cuadrados y que hayan tardado un año o
más en alquilarse.*/

SELECT avg(precio+precio_final)



/*6. Selecciona el alquiler de vivienda (Casa o Piso) más caro realizado en Julio o 
Agosto de cualquier año en la provincia de Huelva.*/

SELECT precio 
FROM inmueble CROSS JOIN tipo
	JOIN operacion USING (id_inmueble)
WHERE nombre IN ('Casa', 'Piso')
	AND provincia = 'Huelva'
	AND (fecha_operacion::text LIKE '%07%'
	OR fecha_operacion::text LIKE '%08%');
	
	




	



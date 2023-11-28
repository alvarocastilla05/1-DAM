/* 1. Selecciona el top 3 de pisos vendidos más caros en Sevilla a lo largo del 
año 2019 (puedes investigar el uso de LIMIT para hacerlo)
*/

SELECT *
FROM tipo JOIN inmueble ON (id_tipo=tipo_inmueble) 
	JOIN operacion USING (id_inmueble)
WHERE nombre = 'Piso'
	AND TO_CHAR(fecha_operacion, 'YYYY') = '2019'
	AND tipo_operacion = 'Venta'
	AND provincia = 'Sevilla'
ORDER BY precio DESC
LIMIT 3;

--Corregido (Hemos puesto otra fecha para comprobar que está bien, ya que en 2019 no hay nada)
SELECT *
FROM tipo JOIN inmueble ON (id_tipo=tipo_inmueble) 
	JOIN operacion USING (id_inmueble)
WHERE nombre = 'Piso'
	AND TO_CHAR(fecha_operacion, 'YYYY') = '2021'
	AND tipo_operacion = 'Venta'
	AND provincia = 'Sevilla'
ORDER BY precio DESC
LIMIT 3;

/*2. Selecciona el precio medio de los alquileres en Málaga en los meses de Julio y 
Agosto (da igual de qué año).*/

SELECT avg(precio_final)
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia = 'Málaga'
	AND TO_CHAR(fecha_operacion, 'MM') IN ('07', '08')
	AND tipo_operacion = 'Alquiler';
	
--Corregido (Cambiamos fecha_operacion por fecha_alta ya que no especifica si está alquilada ya o no)
SELECT avg(precio_final)
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia = 'Málaga'
	AND TO_CHAR(fecha_alta, 'MM') IN ('07', '08')
	AND tipo_operacion = 'Alquiler';	

--Realizamos la misma ACT pero indicando los inmuebles que aún no se hayan alquilado

SELECT *
FROM inmueble LEFT JOIN operacion o USING (id_inmueble)
WHERE provincia = 'Málaga'
	AND TO_CHAR(fecha_alta, 'MM') IN ('07', '08')
	AND tipo_operacion = 'Alquiler'
	AND o.id_inmueble IS NULL;

/*3. Selecciona los inmuebles que se han vendido en Jaén y Córdoba en los últimos 3 meses 
del año 2019 o 2020.*/

--(Cambié Q por 4 porque dice los últimos 3 meses, es decir, el 4º trimestre del año).
SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia IN ('Jaén', 'Córdoba')
	AND tipo_operacion = 'Venta'
	AND TO_CHAR(fecha_operacion, 'Q') = '4'
	AND TO_CHAR(fecha_operacion, 'YYYY') IN ('2021', '2022');

--Corregido(Está bien)

--Hacer lo mismo pero que se haya vendido del 15 de enero al 15 de marzo*/
SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia IN ('Jaén', 'Córdoba')
	AND tipo_operacion = 'Venta'
	AND TO_CHAR(fecha_operacion, 'MM-DD') BETWEEN '01-15' AND '03-15';
	
--Corregido por Luismi en classroom.
	

	
/*4. Selecciona el precio medio de las ventas de Parking en la provincia de Huelva para 
aquellas operaciones que se realizaran entre semana (de Lunes a Viernes).*/

SELECT avg(precio_final)
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE nombre = 'Parking'
	AND provincia = 'Huelva'
	AND tipo_operacion = 'Venta'
	AND TO_CHAR(fecha_operacion, 'ID') BETWEEN '1' AND '5';

/*5. Selecciona aquellos pisos que han tardado en venderse entre 3 y 6 meses en la provincia
de Granada.*/

SELECT *
FROM tipo JOIN inmueble ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (id_inmueble)
WHERE provincia = 'Granada'
	AND tipo_operacion = 'Venta'
	AND nombre = 'Piso'
	AND AGE(fecha_operacion, fecha_alta) BETWEEN '3 month'::interval
											AND '6 month'::interval;


/* Selecciona alquiler más caro de las oficinas de Sevilla que hayan tardado entre 1 y 5 meses en alquilarse*/

SELECT MAX(precio_final)
FROM tipo JOIN inmueble ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (id_inmueble)
WHERE provincia = 'Sevilla'
	AND nombre = 'Oficina'
	AND tipo_operacion = 'Alquiler'
	AND AGE(fecha_operacion, fecha_alta) BETWEEN '1 month' AND '5 month';



















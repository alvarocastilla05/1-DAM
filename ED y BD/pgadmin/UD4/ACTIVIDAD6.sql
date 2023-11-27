/* 1. Selecciona el top 3 de pisos vendidos más caros en Sevilla a lo largo del 
año 2019 (puedes investigar el uso de LIMIT para hacerlo)
*/

SELECT *
FROM tipo JOIN inmueble ON (id_tipo=tipo_inmueble) 
	JOIN operacion USING (id_inmueble)
WHERE nombre = 'Piso'
	AND TO_CHAR(fecha_operacion, 'YYYY') = '2019'
ORDER BY precio DESC
LIMIT 3;

/*2. Selecciona el precio medio de los alquileres en Málaga en los meses de Julio y 
Agosto (da igual de qué año).*/

SELECT avg(precio_final)
FROM inmueble JOIN tipo ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (id_inmueble)
WHERE provincia = 'Málaga'
	AND TO_CHAR(fecha_operacion, 'MM') IN ('07', '08');
	
/*3. Selecciona los inmuebles que se han vendido en Jaén y Córdoba en los últimos 3 meses 
del año 2019 o 2020.*/


SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia IN ('Jaén', 'Córdoba')
	AND tipo_operacion = 'Venta'
	AND TO_CHAR(fecha_operacion, 'Q') = '3'
	AND TO_CHAR(fecha_operacion, 'YYYY') IN ('2019', '2020');
	
/*4. Selecciona el precio medio de las ventas de Parking en la provincia de Huelva para 
aquellas operaciones que se realizaran entre semana (de Lunes a Viernes).*/

SELECT avg(precio_final)
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE nombre = 'Parking'
	AND provincia = 'Huelva'
	AND tipo_operacion = 'Venta'
	AND TO_CHAR(fecha_operacion, 'ID') BETWEEN '1' AND '5'

/*5. Selecciona aquellos pisos que han tardado en venderse entre 3 y 6 meses en la provincia
de Granada.*/

SELECT *
FROM tipo JOIN inmueble ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (id_inmueble)
WHERE provincia = 'Granada'
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



















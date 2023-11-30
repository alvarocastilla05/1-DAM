/*1*/
SELECT sum(precio_final)
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE provincia IN ('Córdoba', 'Sevilla')
	AND AGE(fecha_operacion, fecha_alta) BETWEEN '3 month'::interval AND '4 month'::interval
	AND tipo_operacion = 'Alquiler';
	
	
/*2*/

SELECT AVG(precio_final)
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE tipo_operacion = 'Venta'
	AND TO_CHAR(fecha_operacion, 'ID') IN ('5', '6', '7')
	AND ((EXTRACT(day from fecha_operacion) BETWEEN 21 AND 30
		 AND 
		 EXTRACT(month from fecha_operacion) = 06)
		 OR
		 (EXTRACT(day from fecha_operacion) BETWEEN 1 AND 31
		 AND 
		 EXTRACT(month from fecha_operacion) = 07)
		 OR
		 (EXTRACT(day from fecha_operacion) BETWEEN 1 AND 30
		 AND 
		 EXTRACT(month from fecha_operacion) = 08)
		 OR
		 (EXTRACT(day from fecha_operacion) BETWEEN 1 AND 20
		 AND 
		 EXTRACT(month from fecha_operacion) = 09));
		 
/*3*/

SELECT v.nombre
FROM vendedor v JOIN operacion USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE t.nombre = 'Local'
	AND provincia IN ('Sevilla', 'Huelva', 'Cádiz')
	AND superficie > 100
	AND TO_CHAR(fecha_operacion, 'ID') IN ('3', '4')
	AND EXTRACT(month from fecha_operacion) = 05;
	
/*4*/

SELECT *
FROM comprador c JOIN operacion o USING (id_cliente)
	JOIN vendedor v USING (id_vendedor)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE t.nombre NOT IN ('Local', 'Oficina')
	AND tipo_operacion IN ('Alquiler', 'Compra')
	AND (fecha_operacion-fecha_alta) < 120
	
	
	
/*5*/

SELECT *
FROM inmueble LEFT JOIN operacion USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble = id_tipo)
WHERE AGE(CURRENT_DATE, fecha_alta) < '8 month'
	AND fecha_operacion IS NULL
	AND tipo_operacion = 'Venta'

	

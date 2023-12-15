/*3. Seleccionar el piso que se ha vendido más caro de cada provincia. Debe aparecer la provincia, el nombre del comprador, 
la fecha de la operación y la cuantía.*/

SELECT provincia, comprador.nombre, fecha_operacion, precio_final
FROM comprador JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE tipo.nombre = 'Piso'
	AND tipo_operacion = 'Venta'
	AND precio_final >= ALL(
		SELECT MAX(precio_final)
		FROM comprador JOIN operacion USING (id_cliente)
			JOIN inmueble USING (id_inmueble)
			JOIN tipo ON (tipo_inmueble=id_tipo)
		WHERE tipo.nombre = 'Piso'
			AND tipo_operacion = 'Venta'
	);
	
--Corregido.

SELECT provincia, comprador.nombre, fecha_operacion, precio_final
FROM operacion JOIN inmueble i1 USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
	JOIN comprador USING (id_cliente)
WHERE tipo.nombre = 'Piso'
	AND tipo_operacion = 'Venta'
	AND precio_final >= ALL (
		SELECT precio_final
		FROM operacion JOIN inmueble i2 USING (id_inmueble)
			JOIN tipo ON (tipo_inmueble=id_tipo)
			JOIN comprador USING (id_cliente)
		WHERE tipo.nombre = 'Piso'
			AND tipo_operacion = 'Venta'
			AND i1.provincia = i2.provincia
);
	
/*4.Seleccionar los alquileres más baratos de cada provincia y mes (da igual el día y el año). 
Debe aparecer el nombre de la provincia, el nombre del mes, el resto de atributos de la tabla inmueble y el 
precio final del alquiler.*/

SELECT provincia, TO_CHAR(fecha_operacion, 'Month'), 
FROM operacion JOIN inmueble i USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)


--Corregido.

SELECT provincia, TO_CHAR(fecha_operacion, 'Month'), id_inmueble,
	fecha_alta, tipo_inmueble, tipo_operacion, superficie, precio
FROM inmueble i1 JOIN operacion o1 USING (id_inmueble)
WHERE tipo_operacion = 'Alquiler'
	AND precio_final >= ALL (
			SELECT precio_final
			FROM inmueble i2 JOIN operacion o2 USING (id_inmueble)
			WHERE tipo_operacion = 'Alquiler'
				AND i1.provincia = i2.provincia
				AND EXTRACT(month from o1.fecha_operacion) =
					EXTRACT(month from o2.fecha_operacion)
	)
ORDER BY provincia, EXTRACT(month from o1.fecha_operacion);
	
	


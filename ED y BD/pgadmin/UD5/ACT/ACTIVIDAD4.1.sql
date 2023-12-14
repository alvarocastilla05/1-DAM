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
	)

/*4.Seleccionar los alquileres más baratos de cada provincia y mes (da igual el día y el año). 
Debe aparecer el nombre de la provincia, el nombre del mes, el resto de atributos de la tabla inmueble y el 
precio final del alquiler.*/

SELECT provincia, TO_CHAR(fecha_operacion, 'Month'), 
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)

	
	


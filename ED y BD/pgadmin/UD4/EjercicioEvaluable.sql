/*Seleciona los vuelos que salgan desde Berlín en los 6 primeros meses del año, cuya reserva se hayan hecho al menos 1 mes antes.
Muestra las fechas de salida y llegada, la fecha de reserva, desde dónde salen y a dónde llegaron.
Ordénalos por fecha de reserva.*/

SELECT salida, llegada, fecha_reserva, desde, hasta
FROM vuelo JOIN reserva USING (id_vuelo)
	JOIN aeropuerto ON (id_aeropuerto=desde)
WHERE ciudad = 'Berlín'
	AND TO_CHAR(salida, 'MM') BETWEEN '01' AND '06'
	AND AGE(salida, fecha_reserva) > '1'
ORDER BY fecha_reserva;

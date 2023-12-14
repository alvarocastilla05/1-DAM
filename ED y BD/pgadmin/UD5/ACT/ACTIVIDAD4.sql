/*1. Seleccionar el vuelo más largo (con mayor duración) de cada día de la semana. Debe aparecer el nombre del aeropuerto de salida,
el de llegada, la fecha y hora de salida y llegada y la duración.*/

SELECT aeropuerto.nombre, salida,llegada, duracion
FROM vuelo JOIN aeropuerto ON (desde=id_aeropuerto)
WHERE AGE(llegada, salida) >= (
	SELECT TO_CHAR(salida, 'Day') as "dia", 
		AGE(llegada, salida) as "duracion"
	FROM vuelo
	GROUP BY dia, duracion
)



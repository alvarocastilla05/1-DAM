/*1. Seleccionar el vuelo más largo (con mayor duración) de cada día de la semana. Debe aparecer el nombre del aeropuerto de salida,
el de llegada, la fecha y hora de salida y llegada y la duración.*/

SELECT aeropuerto.nombre, salida,llegada, duracion
FROM vuelo JOIN aeropuerto ON (desde=id_aeropuerto)
WHERE AGE(llegada, salida) >= ALL(
	SELECT TO_CHAR(salida, 'Day') as "dia", 
		AGE(llegada, salida) as "duracion"
	FROM vuelo
	GROUP BY dia, duracion
)

/*2. Seleccionar el cliente que más ha gastado en vuelos que salen del mismo aeropuerto. Debe aparecer el nombre del cliente, 
el nombre y la ciudad del aeropuerto y la cuantía de dinero que ha gastado.*/


SELECT  c.nombre AS NombreCliente, SUM(v.precio) AS DineroGastado,
    a.nombre AS NombreAeropuerto,  a.ciudad AS CiudadAeropuerto   
FROM cliente c JOIN reserva r ON c.id_cliente = r.id_cliente
	JOIN vuelo v ON r.id_vuelo = v.id_vuelo
	JOIN aeropuerto a ON v.desde = a.id_aeropuerto
GROUP BY c.nombre, a.nombre, a.ciudad
ORDER BY DineroGastado DESC
LIMIT 1;



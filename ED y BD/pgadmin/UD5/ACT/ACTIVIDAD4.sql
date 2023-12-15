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

--Corregido.

SELECT o.ciudad, salida, TO_CHAR(salida, 'dy'), d.ciudad, llegada,
	AGE(llegada, salida)
FROM vuelo v1 JOIN aeropuerto o ON (desde=o.id_aeropuerto)
	JOIN aeropuerto d ON (hasta=d.id_aeropuerto)
WHERE age(llegada, salida) >= ALL (
			SELECT age(llegada, salida)
			FROM vuelo v2
			WHERE EXTRACT(isodow from v1.salida)
				= EXTRACT(isodow from v2.salida)
)
ORDER BY EXTRACT(isodow from v1.salida);

--Seleccionar la duracion max por dia de la semana de los vuelos.

SELECT TO_CHAR(salida, 'dy'), MAX(age(llegada, salida))
FROM vuelo
GROUP BY TO_CHAR(salida, 'dy');

--Si hay que mostrar algun dato que se muestra en las filas individuales, no podemos hacer GROUP BY.


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

--Corregido.

SELECT c.nombre, c.apellido1, c.apellido2, a.nombre, a.ciudad,
	SUM(precio * (1-(COALESCE(descuento,0)/100)))
FROM vuelo v1 JOIN reserva USING (id_vuelo)
	JOIN cliente c USING (id_cliente)
	JOIN aeropuerto a ON (desde=id_aeropuerto)
GROUP BY c.nombre, c.apellido1, c.apellido2, a.nombre, a.ciudad, v1.desde
HAVING SUM(
	precio * (1-(COALESCE(descuento,0)/100)))
	>= ALL (
		SELECT SUM(precio * (1-(COALESCE(descuento,0)/100)))
		FROM vuelo v2 JOIN reserva USING (id_vuelo)
		WHERE v1.desde = v2.desde
		GROUP BY id_cliente
	)

/*Seleccionar el nombre, apellidos y número de vuelos por aeropuerto de salida, para el cliente que
más vuelos de salida ha usado en cada aeropuerto.*/



WITH num_vuelo_salida AS (
	SELECT s.nombre, COUNT(desde) "contado"
	FROM vuelo JOIN aeropuerto s ON (desde=s.id_aeropuerto)
	GROUP BY s.nombre
)
SELECT c.nombre, apellido1, apellido2, (SELECT contado
									   FROM num_vuelo_salida),
									   	s.nombre
FROM cliente c JOIN reserva USING (id_cliente)
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto s ON (desde=s.id_aeropuerto)
GROUP BY c.nombre, apellido1, apellido2, (SELECT contado
									   FROM num_vuelo_salida),
									   	s.nombre


--Corregido.


SELECT c.nombre, apellido1, apellido2, a.ciudad,
        count(*) as "cantidad"
FROM cliente c JOIN reserva USING (id_cliente)
        JOIN vuelo v1 USING (id_vuelo)
        JOIN aeropuerto a ON (desde = id_aeropuerto)
GROUP BY c.nombre, apellido1, apellido2, a.ciudad,
            desde
HAVING COUNT(*) >= ALL (
                        SELECT COUNT(*)
                        FROM vuelo v2 JOIN
                         reserva USING (id_vuelo)
                        WHERE v1.desde = v2.desde
                        GROUP BY id_cliente
                    );
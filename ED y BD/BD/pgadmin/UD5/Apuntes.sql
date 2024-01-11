SELECT *
FROM reserva
ORDER BY fecha_reserva DESC
LIMIT 50 OFFSET 50; --OFFSET descarta los 50 primeros.

SELECT *
FROM reserva
WHERE EXTRACT(year from fecha_reserva) = 2024
ORDER BY fecha_reserva DESC
LIMIT 50 OFFSET 50*4;--Decarta los 200 primeros.


SELECT count(COALESCE(descuento,0))
FROM vuelo;

SELECT AVG(descuento), AVG(COALESCE(descuento, 0)) --No es lo mismo ignorar los null, que tomarlos como 0.
FROM vuelo;

SELECT COUNT(descuento)-COUNT(DISTINCT descuento) --24 descuentos son repetidos (aunque no sabemos cuales son los repetidos ni cuantas veces lo estan)
FROM vuelo;

SELECT COALESCE(descuento,0), COUNT(*)
FROM vuelo
GROUP BY COALESCE(descuento,0)
ORDER BY COUNT(*) DESC; --Cuenta cuantas veces se hace ese descuento. EL group by debe de estar igual que el SELECT, excepto las funciones de agregacion.

SELECT ciudad, COUNT(*)
FROM vuelo JOIN aeropuerto ON (desde=id_aeropuerto)
	GROUP BY ciudad;
	

SELECT origen.ciudad, destino.ciudad, COUNT(*)
FROM vuelo 
	JOIN aeropuerto origen  
		ON (desde=origen.id_aeropuerto)
	JOIN aeropuerto destino 
		ON (hasta=destino.id_aeropuerto)
WHERE origen.ciudad = 'Sevilla'  --El WHERE siempre va antes del agrupamiento(GROUP BY)
GROUP BY origen.ciudad, destino.ciudad
ORDER BY origen.ciudad;
	
/*Mostrar cuantas personas han viajado en cada uno de los trayectos*/

SELECT origen.ciudad, destino.ciudad, COUNT(*)
FROM vuelo 
	JOIN aeropuerto origen  
		ON (desde=origen.id_aeropuerto)
	JOIN aeropuerto destino 
		ON (hasta=destino.id_aeropuerto)
	JOIN reserva r USING (id_vuelo)
GROUP BY origen.ciudad, destino.ciudad
ORDER BY origen.ciudad;
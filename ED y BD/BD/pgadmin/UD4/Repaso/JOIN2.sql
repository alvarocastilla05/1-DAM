--JOIN ON (Otra de las más utilizadas, para cuando la clave externa no se llama igual a la tabla que hace referencia).

SELECT *
FROM aeropuerto JOIN vuelo ON (id_aeropuerto=desde);

--Consulta que muestre los vuelos que salen desde Madrid hasta Sevilla.

SELECT *
FROM aeropuerto a1 JOIN vuelo ON (a1.id_aeropuerto=desde)
	JOIN aeropuerto a2 ON (a2.id_aeropuerto=hasta)
WHERE a1.ciudad = 'Madrid'
	AND a2.ciudad = 'Sevilla';
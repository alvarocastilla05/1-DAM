/*6. (VUELOS) ¿Cuál es el descuento medio obtenido en vuelos donde el origen sea España y el destino fuera de España, 
siempre que estos vuelos no se hayan realizado en fin de semana (contaremos como fin de semana los Viernes a partir 
de las 15:00)?*/

SELECT AVG(descuento)
FROM vuelo JOIN aeropuerto ON (id_aeropuerto = desde)
WHERE ciudad IN ('Madrid', 'Málaga', 'Barcelona', 'Bilbao', 'Sevilla')
	AND TO_CHAR(salida, 'ID') BETWEEN '1' AND '5';

/*Seleccionar la media de vuelos que sale cada día, independientemente del aeropuerto que salga el vuelo*/

SELECT AVG(vuelos)
FROM(
		SELECT TO_CHAR(salida, 'YYYY-MM-DD'), COUNT(*) AS "vuelos"
		FROM vuelo JOIN aeropuerto d ON (desde=d.id_aeropuerto)
			JOIN aeropuerto h ON (hasta=h.id_aeropuerto)
		GROUP BY TO_CHAR(salida, 'YYYY-MM-DD')
	);

--Corregido.

SELECT dia, AVG(cant)
FROM (
    SELECT TO_CHAR(salida, 'Day') as "dia",
           salida::date,
        EXTRACT(isodow from salida) as "ndia",
        COUNT(*) as "cant"
    FROM vuelo
    GROUP BY TO_CHAR(salida, 'Day'),
           salida::date,
        EXTRACT(isodow from salida)
    )
GROUP BY dia, ndia
ORDER BY ndia;
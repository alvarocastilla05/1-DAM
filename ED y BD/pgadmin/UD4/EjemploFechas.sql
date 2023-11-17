SELECT '1982-09-18'::date,
		'2015-05-02 12:00:00'::timestamp;
		
SELECT 'today'::date,
		'now'::timestamp;
		
SELECT CURRENT_DATE, CURRENT_TIMESTAMP;

SELECT '1 year 1 month'::interval;

--Agrega o resta dias.
SELECT CURRENT_DATE + 1;
SELECT CURRENT_DATE+'1 year 1 month'::interval;
SELECT '1 year'::interval + '2 year'::interval;

SELECT CURRENT_DATE - '2005-11-06'::date;

SELECT '1 year'::interval * 3;

SELECT TO_CHAR(salida, 'DD/FMMonth/YYYY HH24:MI:SS')  --FM sirve para quitar los espacios de más.
FROM vuelos;

--Seleccionar vuelos mes de abril.
SELECT *
FROM vuelos
WHERE TO_CHAR(salida, 'MM') = '04';

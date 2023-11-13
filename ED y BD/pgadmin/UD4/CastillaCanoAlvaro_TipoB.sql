SELECT *
FROM climatologia;

--Ejercicio 1
SELECT round((avg(racha_viento)),2)
FROM climatologia
WHERE estacion IN ('A Coruña', 'Pontevedra', 'Ourense', 'Lugo')
	AND fecha::text LIKE '2019-05%'
	AND racha_viento > 50;
	
--Ejercicio 2
SELECT *, ((temperatura_maxima+temperatura_minima)/2) AS "promedio"
FROM climatologia
WHERE (estacion ILIKE '%á%' OR estacion ILIKE '%é%'
	OR estacion ILIKE '%í%' OR estacion ILIKE '%ó%'
	OR estacion ILIKE '%ú%')
	AND fecha::text LIKE '2019-01%';
	
--Ejercicio 3.
SELECT *
FROM climatologia
WHERE right(estacion,2) = 'ón'
	AND precipitacion_total BETWEEN 10 AND 20
	AND temperatura_minima < 10 
	AND (fecha::text LIKE '2019-02%' 
		 OR fecha::text LIKE '2019-03%');
		 
--Ejercicio 4.
SELECT estacion, provincia, fecha, temperatura_maxima,
CASE 
	WHEN temperatura_maxima > 30 AND temperatura_maxima < 35 THEN 'Caluroso'
	WHEN temperatura_maxima >= 35 AND temperatura_maxima < 38 THEN 'Muy caluroso'
	WHEN temperatura_maxima >= 38 THEN 'Extremadamente Caluroso'
END	
FROM climatologia
WHERE temperatura_maxima > 30 
	AND hora_temperatura_maxima = '17:00'
	AND fecha BETWEEN '2019-06-01' AND '2019-08-31'
ORDER BY temperatura_maxima DESC;


--Ejercicio 5.
SELECT provincia, fecha, velocidad_maxima_viento, racha_viento,
CASE 
	WHEN racha_viento < velocidad_maxima_viento THEN '0'
	ELSE 100-((velocidad_maxima_viento/racha_viento)*100)
END AS "porcentaje_superior"
FROM climatologia
WHERE velocidad_maxima_viento >= 60
ORDER BY provincia, estacion, fecha DESC;
	 







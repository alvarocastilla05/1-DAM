SELECT temperatura_maxima, fecha
FROM climatologia;

SELECT *
FROM climatologia;

SELECT *
FROM climatologia
ORDER BY estacion, temperatura_maxima DESC;

SELECT *
FROM climatologia
WHERE temperatura_media< 20;

SELECT *
FROM climatologia
WHERE estacion='A Coruña';	

SELECT *
FROM climatologia
WHERE estacion= 'Écija'

--Seleccionar aquellas estaciones donde el nombre de la estacion contenga Sevilla
SELECT *
FROM climatologia
WHERE estacion ILIKE '%sevilla%';
--Al ILIKE no ignora las mayúsculas y las minúsculas.

--Seleccionar aquellas filas donde el nombre de la estación tenga exactamente 5 letras.
SELECT *
FROM climatologia
WHERE estacion LIKE '_____';


--Seleccionar aquellas filas dónde el nombre de la estación termine en ja

SELECT *
FROM climatologia
WHERE estacion ILIKE '%ja'
ORDER BY provincia ;

--Seleccionar aquellas filas dónde el nombre de la estación termine en ja
-- y la provincia sea granada.

SELECT *
FROM climatologia
WHERE estacion ILIKE '%ja' 
	AND provincia='Sevilla';
	
--Seleccionar filas dónde la temperatura media este entre 30 y 40º

SELECT *
FROM climatologia
WHERE temperatura_media BETWEEN 30 AND 40 
	AND provincia IN ('Jaén', 'Córdoba', 'Sevilla', 'Huelva', 'Almería', 'Cádiz', 'Málaga', 'Granada');



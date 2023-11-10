/*Selecciona la media de la temperatura media de todas las estaciones meteorológicas de
Andalucía que comiencen por AL para el mes de mayo de 2019. Ojo, no se puede utilizar LIKE ni ILIKE.*/


SELECT avg(temperatura_media)
FROM climatologia
WHERE provincia IN ('Sevilla', 'Huelva', 'Cádiz', 'Jaén', 'Granada', 'Córdoba', 'Almería', 'Málaga')
	--AND LEFT (fecha::text,7)='2019-05';
	AND fecha BETWEEN '2019-05-01'::date
				AND '2019-05-31'::date
	AND starts_with(estacion,'Al');


/*2. Selecciona los datos meteorológicos de la provincia de Jaén para el mes de Noviembre de 2019. 
Debe aparecer la fecha, estación, temperatura_media y la precipitacion_total. La precipitación total 
no debe aparecer como un número, sino que debe aparecer como un texto, con las siguientes equivalencias*/

SELECT fecha, estacion, temperatura_media,
	precipitacion_total,
	CASE 
		WHEN precipitacion_total >=50 THEN 'CHUZOS DE PUNTA'
		WHEN precipitacion_total >=40 AND precipitacion_total <50 THEN 'A CÁNTAROS'
		WHEN precipitacion_total >=25 AND precipitacion_total <40 THEN 'MUCHA LLUVIA'
		WHEN precipitacion_total >=10 AND precipitacion_total <25 THEN 'FALTA LE HACÍA AL CAMPO'
		WHEN precipitacion_total < 10 THEN 'HA LLOVIDO POCO'
		ELSE 'NO HA LLOVIDO'	
	END
FROM climatologia
WHERE provincia = 'Jaén'
	AND fecha BETWEEN '2019-11-01'::date
				AND '2019-11-30'::date
ORDER BY fecha, estacion;
--AND fecha::text ILIKE 2019-11%;				


/*3. Selecciona, mostrando todos los datos en mayúsculas, aquellos datos de climatología donde la hora 
de máxima temperatura fueran las 14:00 para un día cualquiera de Marzo de 2019 de Asturias o Cantabria*/

SELECT fecha,upper(estacion), upper(provincia)
FROM climatologia
WHERE hora_temperatura_maxima::text LIKE '14:00'
	AND fecha::text LIKE '2019-03%'
	AND (provincia ='Asturias' OR  provincia = 'Cantabria');



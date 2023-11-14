SELECT *
FROM climatologia;

SELECT *
FROM climatologia
WHERE precipitacion_total IS NULL;


/* Cómo unir dos columnas en una*/


SELECT fecha, estacion || ' (' ||provincia || ')' as "Estacion (Provincia)",
temperatura_media 
FROM climatologia;
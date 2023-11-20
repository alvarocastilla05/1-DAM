--Ejercico 5 examen corregido.
SELECT provincia, estacion, fecha, velocidad_maxima_viento, racha_viento,
	ROUND(((racha_viento-velocidad_maxima_viento)/velocidad_maxima_viento)*100,2)
FROM climatologia
WHERE velocidad_maxima_viento >= 60
	AND racha_viento BETWEEN 
	velocidad_maxima_viento * 1.2
		AND velocidad_maxima_viento *1.4
ORDER BY provincia, estacion, fecha DESC;
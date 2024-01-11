/*Funciones Condicionales*/

SELECT estacion, temperatura_maxima,
		CASE
			WHEN temperatura_maxima > 38 then 'Mucha Calor'
			WHEN temperatura_maxima BETWEEN 30 AND 38 then 'Calor'
			ELSE 'No mucha calor'
		END 
FROM climatologia
WHERE provincia = 'Sevilla'
ORDER BY temperatura_maxima DESC;
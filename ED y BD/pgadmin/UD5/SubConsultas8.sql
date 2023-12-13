/*Seleccionar, para cada estación meteorologíca, la fecha en la que ha tenido una temperatura_maxima menor.
Deben de aparecer la provincia, el nombre de la estacion, la fecha y la temperatura_maxima.*/

SELECT provincia, estacion, fecha, temperatura_maxima
FROM climatologia c1
WHERE temperatura_maxima <= ALL (
			SELECT temperatura_maxima
			FROM climatologia c2
			WHERE c1.estacion = c2.estacion
			 
);

/*EJERCICIOS CORREGIDOS*/

/*1. Selecciona el total de hombres de las provincias de Extremadura en el año 2002 y 2003 (demografia_basica)*/

/*Poner parentesis para que se haga con el orden de preferencia que queramos y no se sobreponga el AND sobre el OR*/
SELECT SUM(hombres) AS "total"
FROM demografia_basica
WHERE (anio = 2002 OR anio = 2003)
	AND (provincia = 'Cáceres'
		OR provincia = 'Badajoz');

/*2. Selecciona, ordenando de mayor a menor aquellas provincias y años en los que hubo una población superior 
o igual a 600.000 personas o de hombres o de mujeres (demografia_basica). Como resultado se deben mostrar
todas las columnas de cada fila.*/

SELECT *
FROM demografia_basica
WHERE (hombres >= 600000) OR
	  (mujeres >= 600000)
ORDER BY (hombres+mujeres) DESC;

/*3.Acota la búsqueda anterior para que sea solamente de los últimos 5 años*/

SELECT *
FROM demografia_basica
WHERE (hombres >= 600000) OR
	  (mujeres >= 600000)
	 AND anio >=2018
ORDER BY (hombres+mujeres) DESC;

/*4. Selecciona cuántas mujeres de entre 20 y 29 años vivían en Andalucía en el año 2018 (demografia_avanzada). 
Ordena la salida por número de habitantes (menor a mayor) 
NOTA: No debe aparecer el total, sino el desglose por provincia y rango de edad*/

/*Como son dos columnas distintas se usa AND en vez de OR. Además no es necesario parentesis porque no mezclamos AND y OR.*/

SELECT *
FROM demografia_avanzada
WHERE edad_menor >= 20 
	AND edad_mayor <= 29
	AND anio = 2018
	AND sexo = 'M'
	AND provincia IN ('Sevilla', 'Almería', 'Huelva', 'Cádiz', 'Málaga', 'Jaén', 'Córdoba', 'Granada')
ORDER BY numero_habitantes;


/*5. Selecciona el número de hombres que vivían en la comunidad de Madrid entre los años 2010 y 2015 (ambos inclusive), 
donde el rango de edad sea menores de 20 años o mayores de 65 (demografia_avanzada). 
La salida se debe ordenar por anio (menor a mayor), número de habitantes (mayor a menor) y edad (menor a mayor)*/

SELECT *
FROM demografia_avanzada
WHERE provincia = 'Madrid'
	AND anio BETWEEN 2010 AND 2015
	AND (edad_mayor < 20 OR edad_menor > 65)
	AND sexo = 'H'
ORDER BY anio, numero_habitantes DESC, edad_menor;





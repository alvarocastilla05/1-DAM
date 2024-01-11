/*Seleccionar, para cada provincia, el año en el que han tenido más habitantes (hombre + mujeres)*/

SELECT *, hombres + mujeres as "num_habitantes"
FROM demografia_basica db1
WHERE hombres + mujeres >= ALL(
	SELECT hombres + mujeres
	FROM demografia_basica db2
	WHERE db1.provincia = db2.provincia
	)
ORDER BY provincia ;

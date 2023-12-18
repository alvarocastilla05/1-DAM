/*1. Selecciona, agrupando por vendedor, el precio final medio de pisos y casas que se han vendido en cada provincia. Debe aparecer
el nombre del vendedor, la provincia y el precio medio.*/

WITH precio_medio_casas AS (
	SELECT AVG(precio_final) AS "media_casa"
	FROM operacion JOIN inmueble USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)
	WHERE tipo.nombre = 'Casa'
), precio_medio_pisos AS (
	SELECT AVG(precio_final) AS "media_piso"
	FROM operacion JOIN inmueble USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)
	WHERE tipo.nombre = 'Piso'
)
SELECT vendedor.nombre, (SELECT media_casa
						FROM precio_medio_casas),
						(SELECT media_piso 
						FROM precio_medio_pisos)
FROM vendedor; 

/*2. Seleccionar la suma del precio final, agrupado por provincia, de aquellos locales donde su precio sea superior
al producto del número de metros cuadrados de ese local por el precio medio del metro cuadrado 
de los locales de esa provincia.*/

WITH suma_precio_final AS (
	SELECT SUM(precio_final) as "suma_precio"
	FROM operacion 
), precio_medio_m2 AS (
	SELECT AVG(precio*superficie) AS "precio_medio"
	FROM inmueble
)
SELECT provincia, (SELECT suma_precio
	   FROM suma_precio_final), 
			(SELECT precio_medio
			FROM precio_medio_m2)
FROM inmueble JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE tipo.nombre='Local'
	AND precio > (SELECT suma_precio
	   FROM suma_precio_final)*
			(SELECT precio_medio
			FROM precio_medio_m2)
GROUP BY provincia

/*3. Selecciona la media de pisos vendidos al día que se han vendido en cada provincia. Es decir, debes calcular primero el número 
de pisos que se han vendido cada día de la semana en cada provincia, y después, sobre eso, calcular la media por provincia.*/

WITH num_vendidos AS (
	SELECT tipo.nombre, provincia, TO_CHAR(fecha_operacion, 'Day'), AVG(COUNT(*)) as "media"
	FROM operacion JOIN inmueble USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)
	WHERE tipo.nombre= 'Piso'
		AND tipo_operacion = 'Venta'
	GROUP BY nombre, provincia, TO_CHAR(fecha_operacion, 'Day')
)




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
	SELECT tipo.nombre, provincia, TO_CHAR(fecha_operacion, 'Day'), COUNT(*) as "numero_venta"
	FROM operacion JOIN inmueble USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)
	WHERE tipo.nombre= 'Piso'
		AND tipo_operacion = 'Venta'
	GROUP BY nombre, provincia, TO_CHAR(fecha_operacion, 'Day')
), media_pisos_vendidos (
	SELECT AVG(numero_venta) AS "media"
	FROM num_vendidos
)
SELECT tipo.nombre, provincia, TO_CHAR(fecha_operacion, 'Day'), (SELECT media
																FROM media_pisos_vendidos)
FROM operacion JOIN inmueble USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)


/*4. Selecciona el cliente que ha comprado más barato cada tipo de inmueble (casa, piso, local, …). 
Debe aparecer el nombre del cliente, la provincia del inmueble, la fecha de operación, el precio final y 
el nombre del tipo de inmueble. ¿Te ves capaz de modificar la consulta para que en lugar de que salga el más barato, salgan los 3 más baratos?*/

WITH PreciosMinimos AS (
    SELECT
        tipo_inmueble,
        MIN(precio_final) AS precio_minimo
    FROM
        operacion JOIN inmueble USING (id_inmueble)
    GROUP BY
        tipo_inmueble
)
SELECT comprador.nombre, provincia, fecha_operacion, precio_final, tipo_inmueble
FROM comprador JOIN operacion USING (id_cliente) 
	JOIN PreciosMinimos pm ON (precio_final = pm.precio_minimo)
	JOIN inmueble USING (id_inmueble);
	
/*5. De entre todos los clientes que han comprado un piso en Sevilla, selecciona a los que no han realizado
ninguna compra en fin de semana.*/

WITH ComprasEnFinDeSemana AS (
    SELECT DISTINCT
        id_cliente
    FROM comprador JOIN operacion USING (id_cliente)
		JOIN inmueble USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)
    WHERE tipo.nombre = 'Piso'
        AND fecha_operacion::timestamp::date IN (SELECT fecha_operacion::timestamp::date 
												 FROM operacion 
												 WHERE EXTRACT(DOW FROM fecha_operacion) IN (0, 6))
)
SELECT c.nombre, (SELECT id_cliente
				 FROM ComprasEnFinDeSemana)
FROM comprador c JOIN operacion o USING (id_cliente)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE i.provincia = 'Sevilla' 
    AND t.nombre = 'Piso'
	
/*6. El responsable de la inmobiliaria quiere saber el rendimiento de operaciones de alquiler que realiza cada vendedor durante los
días de la semana (de lunes a sábado). Se debe mostrar el nombre del vendedor, el % del número de operaciones de alquiler que ha realizado 
en ese día de la semana ese vendedor y el precio medio por metro cuadrado de las operaciones de alquiler que ha realizado ese vendedor en
ese día de la semana.*/

WITH OperacionesAlquiler AS (
    -- Subconsulta para filtrar las operaciones de alquiler
    SELECT o.id_vendedor,
        EXTRACT(DOW FROM o.fecha_operacion) AS dia_semana,
        COUNT(*) AS total_operaciones,
        AVG(precio*superficie) AS precio_medio_metro_cuadrado
    FROM operacion o JOIN inmueble i USING (id_inmueble)
		JOIN tipo ON (tipo_inmueble=id_tipo)
    WHERE
        tipo.nombre = 'Alquiler' -- Asegúrate de ajustar el tipo de operación según tu esquema
    GROUP BY
        o.id_vendedor, dia_semana
)



	




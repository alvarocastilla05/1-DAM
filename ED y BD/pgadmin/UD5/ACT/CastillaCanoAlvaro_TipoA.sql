/*1*/

SELECT *
FROM inmueble i1 LEFT JOIN operacion USING (id_inmueble)
WHERE (precio*superficie) > ALL (
	SELECT AVG(precio*superficie)
	FROM inmueble i2
	WHERE i1.precio = i2.precio
)
AND fecha_operacion IS NULL
AND tipo_operacion = 'Alquiler';

/*2*/

SELECT 	EXTRACT(year from fecha_operacion), EXTRACT(month from fecha_operacion), ROUND(AVG(precio_final),2), ROUND(AVG(precio*superficie),2)
FROM operacion JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE tipo_operacion = 'Venta'
GROUP BY EXTRACT(year from fecha_operacion), EXTRACT(month from fecha_operacion);

/*3*/

SELECT v.nombre, tipo_operacion
FROM vendedor v JOIN operacion USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE tipo_operacion = 'Venta'
	AND provincia IN ('Sevilla', 'Málaga')
GROUP BY v.nombre, tipo_operacion;

/*4*/

SELECT v.nombre, COUNT(tipo_operacion), SUM(precio_final) AS "cuantia"
FROM vendedor v JOIN operacion USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
WHERE tipo_operacion = 'Venta'
GROUP BY v.nombre
ORDER BY cuantia
LIMIT 3;

/*5*/

SELECT provincia, comprador.nombre, SUM(precio_final) as "suma", COUNT(fecha_operacion)
FROM comprador JOIN operacion o1 USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
WHERE suma > ALL (SELECT SUM(precio_final)
							   FROM comprador JOIN operacion o2 USING (id_cliente)
							   		JOIN inmueble USING (id_inmueble)
							   WHERE o1.precio_final=o2.precio_final
							  )
GROUP BY provincia, comprador.nombre


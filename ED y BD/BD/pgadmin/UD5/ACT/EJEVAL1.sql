/*Seleccionar el nombre, apellidos y gasto total de aquellos clientes que gastaron menos que la media de gasto por cliente*/

SELECT nombre, apellido1, apellido2, (precio*(1-COALESCE(descuento,0)/100) AS "gasto_total"
FROM cliente JOIN reserva USING (id_cliente)
	JOIN vuelo V1 USING (id_vuelo)
WHERE (precio*(1-COALESCE(descuento,0)/100) < ALL(
		SELECT AVG(gasto_total)
		FROM cliente JOIN reserva USING (id_cliente)
			JOIN vuelo V2 USING (id_vuelo)	
	WHERE v1.gasto_total = v2.gasto_total
)
	   
	  
--Corregido.
	   
SELECT nombre, apellido1, apellido2,
        SUM(precio * 1 -
                       (COALESCE(descuento,0)
                            / 100.0)) as "gasto"
FROM vuelo JOIN reserva USING (id_vuelo)
        JOIN cliente USING (id_cliente)
GROUP BY nombre, apellido1, apellido2
HAVING SUM(precio * 1 -
               (COALESCE(descuento,0)
                    / 100.0)) < (
            SELECT AVG(gasto)
            FROM (
                SELECT SUM(precio * 1 -
                           (COALESCE(descuento,0)
                                / 100.0)) as "gasto"
                FROM vuelo JOIN reserva USING (id_vuelo)
                GROUP BY id_cliente
            )
        )
   
	   
--Corregido con WITH 	   
WITH gasto_por_cliente AS (
    SELECT nombre, apellido1, apellido2,
            SUM(precio * 1 -
                           (COALESCE(descuento,0)
                                / 100.0)) as "gasto"
    FROM vuelo JOIN reserva USING (id_vuelo)
            JOIN cliente USING (id_cliente)
    GROUP BY nombre, apellido1, apellido2
), media_gasto_por_cliente AS (
    SELECT AVG(gasto) as "media"
    FROM gasto_por_cliente
)
SELECT *
FROM gasto_por_cliente
WHERE gasto < (
        SELECT media
        FROM media_gasto_por_cliente
    );
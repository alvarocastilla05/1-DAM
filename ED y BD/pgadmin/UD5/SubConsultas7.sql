/*Seleccionar el porducto de cada categoría del que más unidades se han vendido.
Nombre categoria, nombre porducto, nº total de unidades*/

SELECT category_name, product_name, sum(quantity)
FROM order_details JOIN products USING (product_id)
	JOIN categories c USING (category_id)
GROUP BY category_name, product_name
HAVING SUM(quantity) >= ALL(
		SELECT sum(quantity)
		FROM order_details JOIN products USING (product_id)
			JOIN categories c2 USING (category_id)
		WHERE c.category_name = c2.category_name
		GROUP BY category_name, product_name
	)

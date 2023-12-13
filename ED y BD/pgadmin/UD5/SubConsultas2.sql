/*Subconsulta en el FROM para anidar una función de agregación.*/

SELECT category_name,
        COUNT(DISTINCT product_id) as "cantidad"
FROM categories JOIN products USING (category_id)
        JOIN order_details USING (product_id)
GROUP BY category_name
HAVING COUNT(DISTINCT product_id) =
  (SELECT MAX(cantidad)
  FROM (
    SELECT
            COUNT(DISTINCT product_id) as "cantidad"
    FROM categories JOIN products USING (category_id)
            JOIN order_details USING (product_id)
    GROUP BY category_name
  ) datos);
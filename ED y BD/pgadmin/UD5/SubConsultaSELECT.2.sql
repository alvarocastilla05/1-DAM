/*Dinero gastado por cada empresa*/

SELECT company_name,
	SUM(unit_price * quantity * (1-discount))
FROM customers JOIN orders USING (customer_id)
	JOIN order_details USING (order_id)
GROUP BY company_name;


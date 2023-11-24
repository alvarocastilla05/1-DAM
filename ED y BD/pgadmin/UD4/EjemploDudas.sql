/*Seleccionar el nombre de los clientes que no han realizado nigún pedido*/

SELECT DISTINCT company_name
FROM customers LEFT JOIN orders USING (customer_id)
WHERE order_id IS NULL;
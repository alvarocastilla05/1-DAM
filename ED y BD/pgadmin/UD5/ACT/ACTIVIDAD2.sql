/*1. Seleccionar el número de pedidos atendidos por cada empleado, sí y sólo si dicho
número está entre 100 y 150.*/

SELECT  first_name, COUNT(*) AS "num_pedidos"
FROM orders JOIN employees USING (employee_id)
GROUP BY  first_name
HAVING COUNT(*) BETWEEN 100 AND 150;

/*2. Seleccionar el nombre de las empresas que no han realizado ningún pedido.*/

SELECT company_name
FROM customers LEFT JOIN orders USING (customer_id)
WHERE order_id IS NULL
GROUP BY company_name;

/*3. Seleccionar la categoría que tiene más productos diferentes solicitados en pedidos. 
Mostrar el nombre de la categoría y dicho número.*/

SELECT category_name, category_id, COUNT(*)
FROM categories JOIN products USING (category_id)
	JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
GROUP BY category_name, category_id
ORDER BY COUNT(*) DESC
LIMIT 1;

/*4. Si suponemos que nuestro margen de beneficio con los productos es de un 25% (es decir, el 25% de su precio, 
son beneficios, y el 75% son costes), calcular la cantidad de beneficio que hemos obtenido, agrupado por categoría y
producto. Las cantidades deben redondearse a dos decimales.*/

SELECT (unit_price*units_on_order*0.25) as "beneficios"
FROM products JOIN order_details USING (product_id)
	JOIN orders USING (order_id)




/*5. Selecciona aquellos clientes (CUSTOMERS) para los que todos los envíos que ha recibido (sí, todos)
los haya transportado (SHIPPERS) la empresa United Package.*/




/*1. Seleccionar el número de pedidos atendidos por cada empleado, sí y sólo si dicho
número está entre 100 y 150.*/

SELECT  first_name, COUNT(*) AS "num_pedidos"
FROM orders JOIN employees USING (employee_id)
GROUP BY  first_name
HAVING COUNT(*) BETWEEN 100 AND 150;

--Corregido.

SELECT first_name, last_name, COUNT(*)
FROM orders JOIN employees USING (employee_id)
GROUP BY first_name, last_name
HAVING COUNT(*) BETWEEN 100 AND 150;

/*2. Seleccionar el nombre de las empresas que no han realizado ningún pedido.*/

SELECT company_name
FROM customers LEFT JOIN orders USING (customer_id)
WHERE order_id IS NULL
GROUP BY company_name;

--Corregido.

SELECT *
FROM customers LEFT JOIN orders USING (customer_id)
WHERE order_id IS NULL;

--Hecho igual pero con subconsulta. 

SELECT company_name
FROM customers
WHERE customer_id NOT IN (
				SELECT DISTINCT customer_id
				FROM orders
			);

/*3. Seleccionar la categoría que tiene más productos diferentes solicitados en pedidos. 
Mostrar el nombre de la categoría y dicho número.*/

SELECT category_name, category_id, COUNT(*)
FROM categories JOIN products USING (category_id)
	JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
GROUP BY category_name, category_id
ORDER BY COUNT(*) DESC
LIMIT 1;

--Corregido

SELECT category_name, COUNT(DISTINCT product_id) AS "cantidad"
FROM categories JOIN products USING (category_id)
	JOIN order_details USING (product_id)
GROUP BY category_name
ORDER BY cantidad DESC
LIMIT 1;

--Queda pendiente hacear la subconsulta en el HAVING por si hay más de una categoria
--con el mismo num. de productos diferentes.
	
	
/*4. Si suponemos que nuestro margen de beneficio con los productos es de un 25% (es decir, el 25% de su precio, 
son beneficios, y el 75% son costes), calcular la cantidad de beneficio que hemos obtenido, agrupado por categoría y
producto. Las cantidades deben redondearse a dos decimales.*/

SELECT category_name, product_name, unit_price,
ROUND((unit_price*25/100)::numeric, 2) as "beneficios"
FROM categories JOIN products USING (category_id)
GROUP BY category_name, product_name, unit_price;

--Corregido.

SELECT category_name, product_name, 
	ROUND(SUM(
		(od.unit_price*quantity*(1-discount))::numeric*0.25
		),2) as "beneficio"
FROM order_details od JOIN products USING (product_id)
	JOIN categories USING (category_id)
GROUP BY category_name, product_name;


/*5. Selecciona aquellos clientes (CUSTOMERS) para los que todos los envíos que ha recibido (sí, todos)
los haya transportado (SHIPPERS) la empresa United Package.*/


SELECT c.contact_name, s.company_name, COUNT (s.company_name) as "contador"
FROM customers c LEFT JOIN orders USING (customer_id)
	LEFT JOIN shippers s ON (ship_via=shipper_id)
WHERE s.company_name = ALL (
							SELECT company_name
							FROM shippers
							WHERE company_name = 'United Package'
							)
GROUP BY c.contact_name, s.company_name
ORDER BY c.contact_name;


--Corregido

SELECT *
FROM customers JOIN orders USING (customer_id)
	JOIN shippers ON (ship_via=shipper_id)
WHERE shippers.company_name = 'United Package'


SELECT customer_id
FROM orders JOIN shippers ON (ship_via=shipper_id)
WHERE company_name != 'United Package';


SELECT DISTINCT c.company_name
FROM customers c JOIN orders USING (customer_id)
	JOIN shippers ON (ship_via=shipper_id)
WHERE customer_id NOT IN (
				SELECT customer_id
				FROM orders JOIN shippers 
					ON (shipper_id=ship_via)
				WHERE company_name != 'United Package'
	);
	
--IMPORTANTE posible ejercicio de EXAMEN
/*1. Seleccionar el COMPANY_NAME y CONTACT_NAME de aquellos CUSTOMERS que hayan hecho 
pedidos (ORDERS).
*/
SELECT company_name, contact_name
FROM suppliers JOIN orders ON (supplier_id=order_id);

--Corregido
SELECT DISTINCT company_name, contact_name
FROM orders JOIN customers USING (customer_id);

/*2. Seleccionar el número de pedidos que hemos enviado en la década de los 90 con
las empresas Federal Shipping o United Package.*/

SELECT count(quantity)
FROM order_details JOIN orders USING (order_id)
	JOIN shippers ON (ship_via = shipper_id)
WHERE TO_CHAR(shipped_date, 'YYYY') BETWEEN '1990' AND '1999'
	AND company_name IN ('Federa Shipping','United Package');
	
--Corregido
SELECT count(*) AS "Pedidos"
FROM orders JOIN shippers s ON (ship_via = s.shipper_id)
WHERE company_name IN ('Federa Shipping','United Package')
	AND TO_CHAR(shipped_date, 'YYYY') BETWEEN '1990' AND '1999';
	--EXTRACT(year from shipped_date) BETWEEN 1990 AND 1999


/*3. Seleccionar el nombre de aquellos productos que han sido solicitados en algún pedido.*/

SELECT product_name
FROM products
WHERE units_on_order > 0;

--Corregido
SELECT DISTINCT product_name
FROM products JOIN order_details USING (product_id);

/*4. Seleccionar la suma de los importes "cobrados" en todos los pedidos realizados en el año 96.*/

SELECT sum((unit_price*quantity)-(unit_price*quantity*discount)) AS suma
FROM order_details JOIN orders USING (order_id)
WHERE TO_CHAR(shipped_date, 'YYYY') = '1996';

--Corregido.

--SELECT *, (unit_price - unit_price * discount) * quantity

SELECT sum(unit_price * quantity * (1-discount))
FROM order_details  JOIN orders USING (order_id)
WHERE TO_CHAR(shipped_date, 'YYYY') = '1996';

/*5. Seleccionar el nombre de contacto del cliente y el del empleado para aquellos clientes 
y empleados que han participado en pedidos donde la diferencia entre la fecha de envío y la
fecha de requisito sea menos de 20 días*/

SELECT *
FROM customers JOIN orders USING (customer_id)
	JOIN employees USING (employee_id)
WHERE AGE(required_date, shipped_date) < '20 day'::interval;

--Corregido

SELECT DISTINCT contact_name, first_name, last_name 
FROM orders JOIN customers USING (customer_id)
	JOIN employees USING (employee_id)
WHERE AGE(required_date, shipped_date) BETWEEN  -('19 day'::interval)
	AND ('19 day'::interval);


/*6. Selecciona homepage y la ciudad dónde homepage no sea nulo, el mes de pedido sea febrero y
donde la diferencia entre la fecha de envío y la fecha de requisito sea menos de 20 días en Frankfurt
o New Orleans*/


SELECT homepage, city
FROM suppliers s JOIN products USING (supplier_id)
	JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
	JOIN shippers sh ON (ship_via = shipper_id)
WHERE homepage IS NOT NULL
	AND TO_CHAR(order_date, 'MM') = '02'
	AND AGE(required_date, shipped_date) < '20 day'::interval
	AND city IN ('Frankfurt', 'New Orleans')
ORDER BY city;
	
	
select *
from suppliers







	















/*1. Seleccionar los nombres de los productos que hayan sido solicitados en pedidos que hayan
sido enviados por la empresa United Package.*/

SELECT product_name
FROM products JOIN suppliers USING (supplier_id)
WHERE company_name = 'United Package';

--Pareja y Grupo
SELECT DISTINCT product_name
FROM products JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
	JOIN shippers ON (shipper_id = ship_via)
WHERE  company_name = 'United Package';

--Corregido por Luimi.

SELECT DISTINCT p.product_name
FROM products p JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
	JOIN shippers s ON (shipper_id = ship_via)
WHERE s.company_name = 'United Package';

/*2. Seleccionar el nombre del producto y el de su categoría que se hayan incluido en 
algún pedido, para todos aquellos pedidos solicitados en un día de Agosto*/

SELECT product_name, category_name
FROM categories JOIN products USING (category_id) 
	JOIN order_details USING (product_id)
	JOIN orders USING (order_id) 
WHERE TO_CHAR(required_date, 'MM') = '08'; 

--Pareja y Grupo (Hay que poner el DISTINCT para quitar los repetidos.)
SELECT DISTINCT product_name, category_name
FROM categories JOIN products USING (category_id) 
	JOIN order_details USING (product_id)
	JOIN orders USING (order_id) 
WHERE TO_CHAR(order_date, 'MM') = '08'; 

--Corregido por Luismi.

SELECT DISTINCT product_name, category_name
FROM products p JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
	JOIN categories USING (category_id)
WHERE DATE_PART('month', order_date)= 8;

/*3. Seleccionar el nombre de todas las empresas que sean clientes, hayan realizado pedidos o no.*/

SELECT company_name
FROM customers JOIN orders USING (customer_id)
	JOIN order_details USING (order_id)
	 JOIN products USING (product_id);
	 --Todos los que están en la tabla customers son clientes por eso está mal.
	
--Pareja y grupo

SELECT company_name
FROM customers;

--Corregido por Luismi.

SELECT company_name
FROM customers;

/*4. Seleccionar el nombre de los empleados que han atendido pedidos realizados por clientes de Brasil (Brazil).*/

SELECT DISTINCT first_name, last_name
FROM customers c JOIN orders USING (customer_id)
	JOIN employees USING (employee_id)
WHERE c.country = 'Brazil';

--Corregido por Luismi.

SELECT DISTINCT first_name, last_name
FROM employees e JOIN orders USING (employee_id)
	JOIN customers c USING (customer_id)
WHERE C.country = 'Brazil';


/*5. Seleccionar el nombre de la categoría y los productos que se han pedido en 
aquellos pedidos que han sido atendidos por Janet Leverling (EMPLOYEE).*/

SELECT DISTINCT category_name, product_name
FROM categories JOIN products USING (category_id)
	JOIN order_details USING (product_id)
	JOIN orders USING (order_id)
	JOIN employees USING (employee_id)
WHERE first_name = 'Janet'
	AND last_name = 'Leverling';


/*6. Selecciona el nombre de la empresa cliente cuyo pais sea USA o Canada, la fecha de entrega 
no sea nula y cantidad de pedidos sea mayor de 10. Ordenalo alfabeticamente*/

SELECT C.company_name
FROM customers C JOIN orders O ON (C.customer_id = O.customer_id)
	JOIN order_details OD ON (O.order_id = OD.order_id)
WHERE
    (C.country = 'USA' OR C.country = 'Canada') AND
    O.shipped_date IS NOT NULL AND
    OD.quantity > 10
ORDER BY C.company_name ;























 

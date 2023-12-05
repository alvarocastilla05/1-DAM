/*1. Seleccionar el número de pedidos atendidos por cada empleado, sí y sólo si dicho
número está entre 100 y 150.*/

SELECT  first_name, COUNT(*) AS "num_pedidos"
FROM orders JOIN employees USING (employee_id)
GROUP BY  first_name
HAVING COUNT(*) BETWEEN 100 AND 150;

/*2. Seleccionar el nombre de las empresas que no han realizado ningún pedido.*/

SELECT company_name, COUNT(*)
FROM shippers LEFT JOIN orders ON (ship_via = shipper_id)
GROUP BY company_name


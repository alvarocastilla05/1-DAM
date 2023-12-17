SELECT department_name,
  (
    SELECT COUNT(*)
    FROM employees
    WHERE department_id = d.department_id
  )
FROM departments d;

SELECT employee_id, first_name, last_name,
    (
      SELECT COUNT(*)
      FROM employees
      WHERE manager_id = e.employee_id
    )
FROM employees e
WHERE employee_id IN (
                    SELECT manager_id
                    FROM employees
                    );

SELECT company_name,
    SUM(unit_price * quantity * (1 - discount)),
    (
        SELECT AVG(importe)
        FROM (
                SELECT SUM(unit_price * quantity * (1 - discount)) as "importe"
                FROM orders JOIN order_details USING (order_id)
                GROUP BY customer_id
             )
    )
FROM customers JOIN orders USING (customer_id)
        JOIN order_details USING (order_id)
GROUP BY company_name;


WITH por_cliente AS (
    SELECT customer_id, SUM(unit_price * quantity * (1 - discount)) as "importe"
    FROM orders JOIN order_details USING (order_id)
    GROUP BY customer_id
), media_ventas AS (
    SELECT AVG(importe) as "media"
    FROM por_cliente
)
SELECT company_name, importe,
    (select media from media_ventas)
FROM customers JOIN por_cliente USING (customer_id);
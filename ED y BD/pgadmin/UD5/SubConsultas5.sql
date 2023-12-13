/*Selecciona aquellos empleados cuyos empleados tengan un salario mayor que cualquier empleado de compra*/

SELECT *
FROM employees 
WHERE salary > ALL(
	SELECT salary
	FROM employees JOIN departments USING (department_id)
	WHERE department_name = 'Purchasing'
	)
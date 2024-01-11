-- Empleados que cobran más que John Chen

SELECT *
FROM employees
WHERE salary > (
				SELECT salary
				FROM employees
				WHERE first_name = 'John'
				AND last_name = 'Chen'
				);
				
-- Empleados que cobran más que John Chen y menos que Nancy Greenberg.

SELECT *
FROM employees
WHERE salary > (
				SELECT salary
				FROM employees
				WHERE first_name = 'John'
					AND last_name = 'Chen'
				)
		AND salary < (SELECT salary
			 FROM employees 
			 WHERE first_name = 'Nancy'
				AND last_name = 'Greenberg');
				
--Seleccionar aquellos empleados que cobran mas que los del departamento 3.

SELECT *
FROM employees 
WHERE salary > (SELECT salary
			   FROM employees 
			   WHERE department_id = 3)

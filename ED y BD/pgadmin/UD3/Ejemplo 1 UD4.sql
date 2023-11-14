SELECT *
FROM employees;

SELECT *
FROM departments;

SELECT *
FROM employees, departments
WHERE employees.department_id
		= departments.department_id;
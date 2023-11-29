--Para poner un alia en los cartesianos no hace falta poner ni AS ni comillas.

SELECT *
FROM employees e, departments d
WHERE e.department_id = d.department_id;   --Esto es un join.


SELECT *
FROM dependents;

SELECT e.first_name, e.last_name, d.department_name
	dd.first_name, dd.last_name, relationship
FROM employees e, departments d, dependents dd
WHERE e.department_id = d.department_id
	AND dd.employee_id = e.employee_id;
	

SELECT employees.employee_id, dependents.employee_id
FROM employees, dependents
ORDER BY employees.employee_id, dependents.employee_id DESC;

SELECT *
FROM employees e, departments d,
	locations l, countries c
WHERE e.department_id = d.department_id
	AND d.location_id = l.location_id
	AND l.country_id = c.country_id
	AND c.country_name = 'United States of America';  --Mo se puede hacer el join de dos tablas wuer no tengan una referencia. FK<->PK.
	
	
--Tipos de Join

--CROSS JOIN
SELECT *
FROM employees CROSS JOIN departments;

--NATURAL JOIN (no recomendada)
SELECT *
FROM employees NATURAL JOIN departments;

--JOIN USING (Una de las más utilizadas)
SELECT *
FROM employees JOIN departments USING (department_id) ;










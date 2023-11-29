SELECT *
FROM employees;

SELECT *
FROM departments;

--te MUESTRA LOS EMPLEADOS TENGAN DEPARTAMENTOS O NO
SELECT employee_id, first_name, last_name,
	department_id, department_name
FROM employees LEFT JOIN departments USING (department_id);

--TE MUESTRA LOS DEPARTAMENTOS TENGAN EMPLEADOS O NO
SELECT employee_id, first_name, last_name,
	department_id, department_name
FROM employees RIGHT JOIN departments USING (department_id);

--PARA QUE MUESTRE LAS DOS COSAS SERÍA CON FULL EN VEZ DE LEFT/RIGHT
SELECT employee_id, first_name, last_name,
	department_id, department_name
FROM employees FULL JOIN departments USING (department_id);

SELECT DISTINCT department_name
FROM employees LEFT JOIN departments USING (department_id);

--Seleccionar los aquellos empleados que no tienen ningún hijo.

SELECT e.*
FROM employees e LEFT JOIN dependents  
	USING (employee_id)
WHERE dependent_id IS NULL;

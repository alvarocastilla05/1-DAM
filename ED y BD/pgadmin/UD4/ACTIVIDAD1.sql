/*1. Seleccionar el nombre, apellidos y email de los empleados que pertenecen a un departamento 
que tenga sede en United Kingdom.*/

SELECT first_name, last_name, email, country_name 
FROM employees e JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
	JOIN countries c USING (country_id)
WHERE country_name LIKE 'United Kingdom';
	

/*2. Seleccionar el nombre de aquellos departamentos en los que trabaja un 
empleado que fue contratado a lo largo del año 1993.*/

SELECT department_name
FROM employees e JOIN departments d USING (department_id)
WHERE hire_date::text LIKE '1993%';

--Para que no salgan repetidos 

SELECT DISTINCT department_name
FROM employees e JOIN departments d USING (department_id)
WHERE hire_date::text LIKE '1997%';

/*3. Seleccionar la región de los empleados con un salario inferior a 10000$*/

--mio
SELECT region_name
FROM regions JOIN countries USING (region_id)
	JOIN locations USING (country_id)
	JOIN departments USING (location_id)
	JOIN employees USING (department_id)
WHERE salary < 10000;

--corregido
SELECT DISTINCT region_name 
FROM employees e JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
	JOIN countries c USING (country_id)
	JOIN regions r USING (region_id)
WHERE salary < 10000;

/*4. Seleccionar el nombre de aquellos empleados cuyo jefe directo tenga un apellido que empiece 
por D, H o S.*/

--Corregido
-- Empleados (e) jefes (j)
SELECT e.first_name, e.last_name
FROM employees e JOIN employees j 
	ON (e.manager_id=j.employee_id)
WHERE LEFT(j.last_name,1) IN ('D', 'H', 'S');


/*5. Seleccionar el número de familiares (dependents) que son hijos de algún miembro de los 
departamentos de Marketing, Administration e IT.*/

--Corregido.
SELECT COUNT(*)
FROM dependents JOIN employees USING (employee_id)
	JOIN departments USING (department_id)
WHERE relationship = 'Child'
	AND department_name IN ('Marketing', 'Administration', 'IT');


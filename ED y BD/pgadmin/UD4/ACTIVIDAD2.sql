/*1. Seleccionar el FIRST_NAME y LAST_NAME de los empleados del departamento de IT o 
Finance cuya fecha de alta (HIRE_DATE) fuera un día cualquiera de Abril o Junio.*/

SELECT first_name, last_name
FROM employees e JOIN departments USING (department_id)
WHERE (department_name = 'IT' OR department_name = 'Finance')
	AND hire_date::text LIKE '%04%'
	OR hire_date::text LIKE '%06%';
	
--Corregido
SELECT first_name, last_name
FROM employees e JOIN departments USING (department_id)
WHERE (department_name = 'IT' OR department_name = 'Finance')
	AND SUBSTR(hire_date::text,6,2)::int IN (4,6);

/*2. Seleccionar el FIRST_NAME y LAST_NAME de los managers de los empleados del departamento
de Administration.*/

SELECT first_name, last_name
FROM employees JOIN departments USING (department_id)
WHERE department_name = 'Administration';

--Corregido forma 1

SELECT DISTINCT m.first_name, m.last_name
FROM employees m JOIN employees e
		ON (m.employee_id = e.manager_id)
		JOIN departments d ON (e.department_id =  d.department_id)
WHERE department_name = 'Administration';

--Corregido forma 2.
SELECT DISTINCT m.first_name, m.last_name
FROM employees e JOIN departments d
		USING (department_id)
	JOIN employees m
		ON (e.manager_id = m.employee_id)	
WHERE department_name = 'Administration';

/*3. Seleccionar el COUNTRY_NAME donde tiene localización el departamento de Public Relations*/

SELECT country_name
FROM countries JOIN locations USING (country_id)
	JOIN departments USING (location_id)
WHERE department_name = 'Public Relations';

--Corregido.(Está bien)

/*4. Seleccionar aquellos empleados que trabajen en oficinas de América.*/

SELECT  e.*
FROM employees e JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE region_name = 'Americas';

--Corregido. (Está bien)

/*5. Seleccionar el nombre y apellidos de los hijos, así como el nombre y apellidos de sus 
padres, para aquellos empleados que trabajen en oficinas de América. Ordena la salida por
orden alfabético del país :)*/

SELECT d.first_name, d.last_name, e.first_name, e.last_name
FROM dependents d JOIN employees e USING (employee_id)
	JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE region_name = 'Americas'
ORDER BY d.first_name ASC;

--Corregido.
SELECT d.first_name, d.last_name, e.first_name, e.last_name
FROM dependents d JOIN employees e USING (employee_id)
	JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE region_name = 'Americas'
	AND d.relationship = 'Child'
ORDER BY country_name ASC;

/*6. Selecciona la media de salario mínimo de los trabajdadores de Administration en América.*/

SELECT round(avg(min_salary),2)
FROM jobs JOIN departments ON (job_id=department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE department_name = 'Administration'
	AND region_name = 'Americas';
	







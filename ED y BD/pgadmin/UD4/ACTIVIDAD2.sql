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

/*3. Seleccionar el COUNTRY_NAME donde tiene localización el departamento de Public Relations*/

SELECT country_name
FROM countries JOIN locations USING (country_id)
	JOIN departments USING (location_id)
WHERE department_name = 'Public Relations';

/*4. Seleccionar aquellos empleados que trabajen en oficinas de América.*/

SELECT first_name last_name
FROM employees JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE region_name = 'Americas';

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

/*6. Selecciona la media de salario mínimo de los trabajdadores de Administration en América.*/

SELECT round(avg(min_salary),2)
FROM jobs JOIN departments ON (job_id=department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE department_name = 'Administration'
	AND region_name = 'Americas';
	







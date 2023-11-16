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

/*2. Seleccionar el FIRST_NAME y LAST_NAME de los managers de los empleados del departamento de Administration.*/

SELECT first_name, last_name
FROM 

/*(HR) 1.Selecciona el número de empleados que fueron contratados en el año 1997 en la que trabajen
en una oficina situada en Bélgica.*/

SELECT count(e.*)
FROM employees e JOIN jobs USING (job_id)
	JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
WHERE TO_CHAR(hire_date, 'YYYY') = '1997'
	AND country_name = 'Belgium';

/*2. (HR) Selecciona la media de salario máximo de los trabajadores de Administration en Asia.*/

SELECT AVG(max_salary)
FROM jobs JOIN employees USING (job_id)
	JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
	JOIN regions USING (region_id)
WHERE department_name = 'Administration'
	AND region_name = 'Asia';


	
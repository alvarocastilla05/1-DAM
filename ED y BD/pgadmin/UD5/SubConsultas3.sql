SELECT department_name, MAX(salary)
FROM departments JOIN employees USING (department_id)
GROUP BY department_name;

--Si queremos hacer la media de los maximos de los distintos departamentos debemos de hacer los siguiente.

SELECT ROUND(AVG(maximo),2)
FROM (
		SELECT  MAX(salary) as "maximo"
		FROM departments JOIN employees USING (department_id)
		GROUP BY department_name

	);
	
--Seleccionar el nº medio de empleados que tiene cada departamento.

SELECT ROUND(AVG(num_empleados),2) AS "media_empleados"
FROM (
	SELECT department_name, COUNT(*) AS "num_empleados"
	FROM employees LEFT JOIN departments USING (department_id)
	GROUP BY department_name
	)
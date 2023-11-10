/*
3. Seleccionar el nombre y apellidos de los empleados cuyo salario bruto anual 
sea mayor o igual que 100000$, y que no sean contables (job_id = 6).
*/

SELECT *, salary*14 AS "salario anual"
FROM employees
WHERE salary*14 >= 10000 
	AND job_id !=6;
	

/*
5. Seleccionar las localizaciones que estén en las ciudades de 
Toronto u Oxford, o bien en el estado de California.
*/

SELECT *
FROM locations
WHERE city IN ('Toronto', 'Oxford')
	OR state_province = 'California';
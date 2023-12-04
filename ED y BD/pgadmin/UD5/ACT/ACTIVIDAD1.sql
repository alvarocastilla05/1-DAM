/*1. Seleccionar el salario máximo de cada departamento, mostrando el nombre del departamento y dicha cantidad.*/

SELECT MAX(salary), department_name, COUNT(*)
FROM employees JOIN departments USING (department_id)
GROUP BY  department_name;

--Mostrar tambien el que no tiene departamento
SELECT COALESCE(department_name, 'Sin departamento'), MAX(salary)
FROM departments RIGHT JOIN employees 
	USING (department_id)
GROUP BY department_name;

/*2. Seleccionar el salario mínimo de cada departamento, para aquellos departamentos cuyo salario mínimo 
sea menor que 5000$.*/

SELECT MIN(salary), department_name, COUNT(*)
FROM employees JOIN departments USING (department_id)
WHERE salary < 5000
GROUP BY  department_name;


/*3. Seleccionar el número de empleados que trabajan en cada oficina, mostrando el STREET_ADDRESS y 
dicho número; hay que ordenar la salida de mayor a menor.*/

SELECT  street_address, COUNT(*)
FROM employees JOIN departments USING (department_id)
	JOIN locations USING (location_id)
GROUP BY  street_address;

/*4.Modificar la consulta anterior para que muestre las localizaciones que no tienen
ningún empleado.*/

SELECT  COALESCE(street_address, 'Sin empleado'), COUNT(*)
FROM employees JOIN departments USING (department_id)
	JOIN locations USING (location_id)
GROUP BY  street_address;

/*5. Seleccionar el salario que es cobrado a la vez por más personas. Mostrar
dicho salario y el número de personas.*/

SELECT salary, COUNT(*) AS numero_personas
FROM employees
GROUP BY salary
HAVING COUNT(*) > 1
ORDER BY numero_personas DESC;

/*6. Seleccionar el número de empleados que empezaron a trabajar cada año, 
ordenando la salida por el año.*/

SELECT EXTRACT(year from hire_date) AS año, COUNT(*) AS empleados_nuevos
FROM employees
GROUP BY año
ORDER BY año;






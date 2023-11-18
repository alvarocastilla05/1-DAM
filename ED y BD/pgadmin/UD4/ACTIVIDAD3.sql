/*Selecciona los datos del inmueble sobre el que se ha realizado una operación un lunes de
febrero o un viernes de marzo, que tenga más de 200 metros cuadrados y donde el nombre del 
vendedor contenga una A mayúscula o minúscula.*/


SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
	JOIN vendedor USING (id_vendedor)
WHERE TO_CHAR(fecha_operacion, 'Day/MM/YYYY ')
	AND nombre ILIKE ('%a%')

/*2. Selecciona el precio medio por metro cuadrado de los alquileres de viviendas 
en los meses de marzo y abril de cualquier año para las provincias costeras de Andalucía.*/

SELECT avg(precio)
FROM inmueble JOIN operacion USING (id_inmueble)
WHERE provincia IN ('Cádiz', 'Huelva', 'Málaga', 'Almería', 'Granada')
	AND  TO_CHAR(fecha_operacion, 'MM') = '03' 
	OR TO_CHAR(fecha_operacion, 'MM') = '04';
	
/*3. ¿Cuál es la media del porcentaje de diferencia entre el precio inicial 
(en la tabla inmueble) y el precio final (en la tabla operación)
para aquellas operaciones de alquiler realizadas en enero de cualquier año, 
donde el tipo del inmueble es Oficina, Local o Suelo?*/

SELECT *
FROM inmueble i JOIN tipo ON (tipo_inmueble=id_tipo)
	JOIN operacion USING (operacion_id)
	


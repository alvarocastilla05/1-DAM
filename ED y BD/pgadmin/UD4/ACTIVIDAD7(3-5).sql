/*3. (INMO) Selecciona el nombre del comprador, el nombre del vendedor, la provincia y la fecha de operación de 
las viviendas (casa y piso) alquiladas en el tercer trimestre de año en las provincias de Huelva, Sevilla 
y Almería. Ordena la salida por fecha de operación descendentemente.*/

SELECT  *
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN vendedor v USING (id_vendedor)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (id_tipo=tipo_inmueble)
WHERE t.nombre IN ('Casa','Piso')
	AND TO_CHAR(fecha_operacion, 'MM') BETWEEN '08' AND '10'
	AND provincia IN ('Huelva', 'Sevilla', 'Almería')
ORDER BY fecha_operacion DESC;

/*4. (INMO) Modifica la consulta anterior para que las viviendas que fueran vendidas en un plazo de 
entre 35 y 45 días desde que se dieron de alta en la inmobiliaria.*/

SELECT *
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN vendedor v USING (id_vendedor)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (id_tipo=tipo_inmueble)
WHERE t.nombre IN ('Casa','Piso')
	AND TO_CHAR(fecha_operacion, 'MM') BETWEEN '08' AND '10'
	AND provincia IN ('Huelva', 'Sevilla', 'Almería')
	AND AGE(CURRENT_DATE, fecha_alta)
			BETWEEN '35 day'::interval
			AND '45 day'::interval
ORDER BY fecha_operacion DESC;


/*5. (INMO) Calcula el precio máximo y precio mínimo por metro cuadrado de venta de inmuebles que no sean 
viviendas (no sean Piso o Casa) en provincias que contengan una n (mayúscula o minúscula), siempre que los
inmuebles se hayan vendido en un mes que escrito de forma completa en inglés tenga entre 5 y 7 caracteres.*/

SELECT *
FROM 
 



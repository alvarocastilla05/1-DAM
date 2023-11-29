/*Seleccionar el nombre y los dos apellidos de aquellos clientes que reservaron un vuelo que salió en el mes de Septiembre de 2022 
con exactamente un mes de antelación (despreciando la hora), y que tengan nombre compuesto. La salida del nombre no debe ser
totalmente en mayúsculas, sino con la primera letra de cada palabra en mayúsculas, y el resto en minúsculas. Por ejemplo: 
Luis Miguel López Magaña (puede que las Ñ aparezcan en mayúsculas).*/

SELECT nombre, apellido1, apellido2
FROM cliente JOIN reserva USING (id_cliente)
	JOIN vuelo USING (id_vuelo)
WHERE TO_CHAR(salida, 'MM') = '10'
	AND TO_CHAR(salida, 'YYYY') = '2023'
	AND AGE(salida, fecha_reserva) = '30 day'
	
--Corregido.

SELECT INITCAP(c.nombre), INITCAP(c.apellido1), INITCAP(c.apellido2)
FROM vuelo JOIN reserva USING (id_vuelo)
	JOIN cliente c USING (id_cliente)
WHERE TO_CHAR(salida, 'MM/YYYY') = '09/2023'
	AND age(salida::date, fecha_reserva::date) = '1 month'
	AND c.nombre ILIKE '% %';


--Corregido tipo B
/*Seleccionar el nombre y los dos apellidos de aquellos clientes  que reservaron
un vuelo que salió en un miércoles con una antelación de 35 días (despreciando la hora),
y que su segundo apellido tenga exactamente 4 letras. La salida del nombre no debe ser totalmente 
en mayúsculas, 
sino con la primera letra de cada palabra en mayúsculas, y el resto en minúsculas*/
SELECT INITCAP(c.nombre), INITCAP(c.apellido1), INITCAP(c.apellido2)
FROM vuelo JOIN reserva USING (id_vuelo)
	JOIN cliente c USING (id_cliente)
WHERE TO_CHAR(salida, 'ID') = '3'
	AND age(salida::date, fecha_reserva::date) = '35 day'
	AND c.apellido2 ILIKE '____'
ORDER BY salida;

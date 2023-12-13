/*1. Seleccionar los 3 aeropuertos que menos tráfico de llegada (menos personas llegando a ellos en un vuelo) han registrado 
en un mes de Enero, Febrero o Marzo*/

SELECT a.nombre, COUNT(*) AS "num_llegadas"
FROM cliente JOIN reserva USING (id_cliente) 
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto a ON (hasta=id_aeropuerto)
WHERE EXTRACT(month from salida) IN ('01','02','03')
GROUP BY a.nombre
ORDER BY num_llegadas
LIMIT 3;

/*4. Selecciona el origen y el destino de los 10 vuelos con una duración menor. Debes realizarlo usando subconsultas.*/
SELECT a1.nombre, a2.nombre
FROM aeropuerto a1 JOIN vuelo ON (a1.id_aeropuerto=desde)
	JOIN aeropuerto a2 ON (a2.id_aeropuerto=hasta)
WHERE llegada-salida IN (SELECT llegada-salida
						FROM vuelo
						ORDER BY llegada-salida
						LIMIT 10)
LIMIT 10;

/*5. Selecciona el importe que la aerolínea de la base de datos de vuelos ha ingresado por cada uno de los vuelos 
que se han realizado en fin de semana (es decir, que han salido entre viernes y domingo) en los meses de Julio y 
Agosto (da igual el año).*/
SELECT SUM(precio*COALESCE(descuento,1)) AS "Importe de la aerolínea"
FROM vuelo JOIN reserva USING (id_vuelo)
	JOIN cliente USING (id_cliente)
WHERE EXTRACT(ISODOW from salida) IN (5,6,7)
	AND EXTRACT(MON from salida) IN (7,8)




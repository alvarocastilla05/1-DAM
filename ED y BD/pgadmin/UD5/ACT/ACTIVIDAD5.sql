/*1. Selecciona la media, agrupada por nombre de aeropuerto de salida, del % de ocupación de los vuelos. PISTA: tendrás que incluir
una subconsulta dentro de otra y, en la interior, usar una subconsulta en el select :S (o bien usar WITH)*/

WITH OcupacionAeropuerto AS (
    SELECT
        nombre, AVG(porcentaje_ocupacion) AS media_ocupacion
    FROM vuelo JOIN aeropuerto ON (desde=id_aeropuerto)
    GROUP BY nombre
),porcentaje_ocupacion AS (
	SELECT ((max_pasajeros*COUNT(id_cliente))/100)
	FROM cliente JOIN reserva USING (id_cliente)
		JOIN vuelo USING (id_vuelo)
		JOIN avion USING (id_avion)
	GROUP BY ((max_pasajeros*COUNT(id_cliente))/100)
)

SELECT
    OA.nombre,
    OA.media_ocupacion
FROM
    porcentaje_ocupacion;
	
--Corregido.

--Contar cuanta personas vuelan por avion
SELECT id_vuelo, max_pasajeros, COUNT(*)
FROM vuelo JOIN avion USING (id_avion)
	JOIN aeropuerto ON (desde=id_aeropuerto)
	JOIN reserva USING (id_vuelo)
GROUP BY id_vuelo, max_pasajeros

--Calculo de porcentaje de ocupacion
SELECT id_vuelo, max_pasajeros, COUNT(*),
	(COUNT(*)/max_pasajeros::numeric)*100
FROM vuelo JOIN avion USING (id_avion)
	JOIN aeropuerto ON (desde=id_aeropuerto)
	JOIN reserva USING (id_vuelo)
GROUP BY id_vuelo, max_pasajeros


SELECT ciudad, AVG(prc) as "media_ocupacion"
FROM (
	SELECT a.ciudad as "ciudad", id_vuelo, max_pasajeros, COUNT(*),
		(COUNT(*)/max_pasajeros::numeric)*100 as "prc"
	FROM vuelo JOIN avion USING (id_avion)
		JOIN aeropuerto a ON (desde=id_aeropuerto)
		JOIN reserva USING (id_vuelo)
	GROUP BY ciudad, id_vuelo, max_pasajeros
)
GROUP BY ciudad

--Resuelto con WITH.

WITH personas_por_vuelo AS (
    SELECT id_vuelo, id_avion, desde,
        COUNT(*) as "ocupacion"
    FROM vuelo JOIN reserva USING (id_vuelo)
    GROUP BY id_vuelo, id_avion
), porcentaje_ocupacion AS (
    SELECT id_vuelo, desde,
        (ocupacion / max_pasajeros::numeric)*100
             AS "porcentaje"
    FROM personas_por_vuelo JOIN avion
            USING (id_avion)
)
SELECT ciudad, ROUND(AVG(porcentaje),2)
FROM porcentaje_ocupacion JOIN aeropuerto
        ON (desde = id_aeropuerto)
GROUP BY ciudad;

	
/*2. Selecciona el tráfico de pasajeros (es decir, personas que han llegado en un vuelo o personas que han salido en un vuelo) 
agrupado por mes (independiente del año) y aeropuerto. */

SELECT id_cliente, SUM(COUNT(*)) AS "trafico", TO_CHAR(salida, 'Month'), TO_CHAR(llegada, 'Month'), d.nombre, l.nombre
FROM cliente JOIN reserva USING (id_cliente)
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto d ON (desde=d.id_aeropuerto)
	JOIN aeropuerto l ON (hasta=l.id_aeropuerto)
GROUP BY id_cliente,  TO_CHAR(salida, 'Month'), TO_CHAR(llegada, 'Month'), d.nombre, l.nombre

--Corregido

SELECT ciudad, SUM(trafico)
FROM (
    SELECT ciudad, EXTRACT(month FROM llegada),
            COUNT(*) as "trafico"
    FROM reserva JOIN vuelo USING (id_vuelo)
            JOIN aeropuerto ON (hasta = id_aeropuerto)
    GROUP BY ciudad, EXTRACT(month FROM llegada)
    UNION
    SELECT ciudad, EXTRACT(month FROM salida),
            COUNT(*) as "trafico"
    FROM reserva JOIN vuelo USING (id_vuelo)
            JOIN aeropuerto ON (desde = id_aeropuerto)
    GROUP BY ciudad, EXTRACT(month FROM salida)
)
GROUP BY ciudad;

/*3. Suponiendo que el 30% del precio de cada billete son beneficios (y el 70% son gastos), 
¿cuál es el trayecto que más rendimiento económico da? Es decir, ¿en qué trayecto estamos ganando más dinero? 
¿Y con el que menos? Lo puedes hacer en consultas diferentes usando WITH*/

WITH por_beneficios AS (
		SELECT (precio*(1-COALESCE(descuento,0)/100)) as "beneficios", o.nombre, l.nombre
		FROM vuelo JOIN aeropuerto o ON (desde=o.id_aeropuerto)
			JOIN aeropuerto l ON (hasta=l.id_aeropuerto)
)
SELECT beneficios, o.nombre, l.nombre
FROM por_beneficios
WHERE beneficios = (SELECT MAX(beneficios) FROM por_beneficios)
   OR beneficios = (SELECT MIN(beneficios) FROM por_beneficios);
   
/*4. Seleccionar el nombre y apellidos de los clientes que no han hecho ninguna reserva para un vuelo que salga
en el tercer trimestre desde Sevilla.*/

SELECT c.nombre, apellido1, apellido2
FROM cliente c LEFT JOIN reserva USING (id_cliente)
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto o ON (desde=o.id_aeropuerto)
	JOIN aeropuerto l ON (hasta=l.id_aeropuerto)
WHERE TO_CHAR(salida, 'Q')= '3'
	AND o.ciudad = 'Sevilla'
	AND fecha_reserva IS NULL;

/*5. Selecciona el nombre y apellidos de aquellos clientes cuyo gasto en reservas de vuelos
con origen en España (Sevilla, Málaga, Madrid, Bilbao y Barcelona) ha sido superior
a la media total de gasto de vuelos con origen fuera de España.*/

SELECT c.nombre, apellido1, apellido2
FROM cliente c JOIN reserva USING (id_cliente) JOIN vuelo USING (id_vuelo) JOIN aeropuerto ON (desde = id_aeropuerto)
WHERE ciudad IN ('Sevilla', 'Málaga', 'Madrid', 'Bilbao', 'Barcelona')
AND (precio - (precio * descuento/100)) > (
                                        SELECT AVG ((precio - (precio * descuento/100)))
                                        FROM vuelo JOIN aeropuerto ON (desde = id_aeropuerto)
                                        WHERE ciudad NOT IN ('Sevilla', 'Málaga', 'Madrid', 'Bilbao', 'Barcelona')
                                        );
	











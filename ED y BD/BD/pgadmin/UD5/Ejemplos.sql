/*Contar el número de vuelos por el mes de fecha de salida.*/

SELECT id_vuelo, salida, COUNT(*)
FROM vuelo
GROUP BY id_vuelo, salida;

--Corregido.

SELECT EXTRACT(month from salida) as "mes", COUNT(*)
FROM vuelo
GROUP BY mes
ORDER BY mes;

/*Agrupar por mes y dia del mes*/

SELECT EXTRACT(month from salida) as "mes", EXTRACT(day from salida) as "dia", COUNT(*)
FROM vuelo
GROUP BY mes, dia
ORDER BY mes, dia;

--otra forma para hacer un unico group by

SELECT TO_CHAR(salida, 'MM-DD') as "fecha", COUNT(*)
FROM vuelo
GROUP BY fecha
ORDER BY fecha;

/*Contar el número de vuelos según el dia de la semana*/

SELECT TO_CHAR(salida, 'ID') as "dia_semana", COUNT(*)
FROM vuelo
GROUP BY dia_semana
ORDER BY dia_semana;

/*Contar numero de vuelos por dia de la semana en los primeros 6 meses del año*/

SELECT TO_CHAR(salida, 'ID') as "dia", COUNT(*)
FROM vuelo
WHERE EXTRACT(month from salida) BETWEEN 1 AND 6
GROUP BY dia
ORDER BY dia;

--Corregido.

SELECT TO_CHAR(salida, 'dy'), COUNT(*)
FROM vuelo
WHERE TO_CHAR(salida, 'Q') IN ('1', '2')
GROUP BY TO_CHAR(salida, 'dy')

/*Realizar lo mismo pero indicando cuando los números de vuelos sea mayor de 10*/*

SELECT TO_CHAR(salida, 'dy'), COUNT(*)
FROM vuelo
WHERE TO_CHAR(salida, 'Q') IN ('1', '2')
GROUP BY TO_CHAR(salida, 'dy')
HAVING count(*) >= 10	--Para poner una condicion una vez creado el grupo, en vez de usar WHERE debemos de usar HAVING.



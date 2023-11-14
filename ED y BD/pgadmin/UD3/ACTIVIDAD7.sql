SELECT *
FROM vuelos;


/*1. Seleccionar el número de vuelos que salen desde Berlín y llegan a 
Londres en el último trimestre de 2020.*/

--MIO
SELECT count (*)
FROM vuelos
WHERE desde LIKE 'Berlín' 
	AND hasta LIKE 'Londres'
	AND llegada BETWEEN '2020-09-01%'::date
		AND '2020-12-31%'::date;
		
--CORREGIDO
SELECT count (*)
FROM vuelos
WHERE desde LIKE 'Berlín' 
	AND hasta LIKE 'Londres'
	AND llegada::text ILIKE '2020-1%';
		
		
/*2. El precio final de un vuelo se obtiene aplicando el descuento al precio.
Selecciona, mostrando todos los datos del vuelo, incluido el precio con 
descuento, redondeado a dos decimales, aquellos vuelos que salen en el
mes de Diciembre de 2020 desde Sevilla o Málaga y llegan a Madrid o
Barcelona.*/

--mio
SELECT *,
CASE
	WHEN descuento = 0 THEN precio
	ELSE round(((descuento/100)*precio),2)
END AS "Precio_Descuento"
FROM vuelos
WHERE salida LIKE '2020-12%'::date
	AND (desde = 'Sevilla' OR desde = 'Málaga');
	
--corregido
SELECT id, salida, desde, llegada, hasta,
	ROUND(COALESCE(precio - precio * (descuento/100),
			 precio),2)
FROM vuelos
WHERE salida::text LIKE '2020-12%'
	AND desde IN ('Sevilla', 'Málaga')
	AND hasta IN ('Madrid', 'Barcelona');
	
/*3. Seleccionar, de entre los vuelos que no tienen descuento, 
aquellos que la fecha de llegada esté en la primera quincena de
Octubre, y hayan llegado al aeropuerto de Nueva York.*/

--corregido
SELECT *
FROM vuelos
WHERE descuento IS  NULL
	AND substr(llegada::text,6,2) = '10'
	AND substr(llegada::text,9,2)::integer <= 15
	AND hasta = 'Nueva York';
	
/*4. Selecciona los vuelos que saldrán  salieron en el mes de Enero de 2021 desde Ámsterdam y 
llegarán llegaron entre las 09:00 y 09:59 de la mañana. PISTA: puedes comparar la fecha de llegada como texto.*/

--corregido-
SELECT *
FROM vuelos
WHERE desde = 'Ámsterdam'
	AND salida::text ILIKE '2021-01%'
	AND substr(llegada::text,12,2) = '09';

/*5. Selecciona, mostrando todos los datos del vuelo, mostrando el precio final, 
todos los vuelos que saldrán  salieron de Sevilla en 2021.*/







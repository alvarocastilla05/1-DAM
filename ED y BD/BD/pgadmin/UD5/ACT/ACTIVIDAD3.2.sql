/*2. Selecciona los clientes que han comprado casas en Almería, siendo el precio final mayor que el precio medio de las casas 
vendidas en Almería.*/

SELECT c.nombre
FROM comprador c JOIN operacion o USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE provincia = 'Almería'
	AND tipo_operacion = 'Venta'
	AND t.nombre = 'Casa'
	AND precio_final >= ALL (
			SELECT AVG(precio_final)
			FROM comprador JOIN operacion o2 USING (id_cliente)
				JOIN inmueble USING (id_inmueble)
				JOIN tipo t ON (tipo_inmueble=id_tipo)
			WHERE o.precio_final = o2.precio_final
				AND tipo_operacion = 'Venta'
				AND t.nombre = 'Casa'
				AND provincia = 'Almería'
	);

--Corregido

SELECT DISTINCT c.*
FROM comprador c JOIN operacion USING (id_cliente)
        JOIN inmueble USING (id_inmueble)
        JOIN tipo ON (tipo_inmueble = id_tipo)
WHERE provincia = 'Almería'
  AND tipo.nombre = 'Casa'
  AND tipo_operacion = 'Venta'
  AND precio_final > (SELECT AVG(precio_final)
                      FROM operacion JOIN inmueble
                              USING (id_inmueble)
                        JOIN tipo ON
                              (tipo_inmueble = id_tipo)
                    WHERE provincia = 'Almería'
                        AND tipo.nombre = 'Casa'
                        AND tipo_operacion = 'Venta'
                        );
	
/*3. Selecciona de todos los vendedores a aquellos que solo vendieron inmuebles de tipo Parking*/

--Corregido directamente

SELECT DISTINCT v.*
FROM vendedor v JOIN operacion USING (id_vendedor)
WHERE id_vendedor NOT IN (
    SELECT id_vendedor
    FROM operacion JOIN inmueble USING(id_inmueble)
        JOIN tipo ON (tipo_inmueble = id_tipo)
    WHERE tipo.nombre != 'Parking'
);

































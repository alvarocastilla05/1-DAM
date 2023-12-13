/*2. Selecciona los clientes que han comprado casas en Almería, siendo el precio final mayor que el precio medio de las casas 
vendidas en Almería.*/

SELECT c.nombre
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble=id_tipo)
WHERE provincia = 'Almeria'
	AND tipo_operacion = 'Venta'
	AND precio_final >ALL (
			SELECT AVG(precio_final)
			FROM comprador JOIN operacion USING (id_cliente)
				JOIN inmueble USING (id_inmueble)
				JOIN tipo t ON (tipo_inmueble=id_tipo)
			WHERE provincia = 'Almeria'
				AND t.nombre = 'Casa'
				AND tipo_operacion = 'Venta' 
	);
	
/*3. Selecciona de todos los vendedores a aquellos que solo vendieron inmuebles de tipo Parking*/

SELECT v.nombre
FROM vendedor v JOIN operacion USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE t.nombre = 'Parking'




































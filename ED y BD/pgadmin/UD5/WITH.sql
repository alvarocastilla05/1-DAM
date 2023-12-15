
--Seleccionar aquellas operaciones de alquiler cuyo precio este por encima de la media del precio de los alquileres

WITH precio_medio_alquiler AS (
	SELECT AVG(precio_final)
	FROM inmueble JOIN operacion USING (id_inmueble)
	WHERE precio_final > (
		SELECT media
	)
)
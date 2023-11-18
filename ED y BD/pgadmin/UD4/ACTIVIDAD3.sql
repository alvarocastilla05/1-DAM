SELECT *
FROM inmueble JOIN operacion USING (id_inmueble)
	JOIN vendedor USING (id_vendedor)
WHERE TO_CHAR(fecha_operacion, 'Day/MM/YYYY HH24:MI:SS')
	AND nombre ILIKE ('%a%')



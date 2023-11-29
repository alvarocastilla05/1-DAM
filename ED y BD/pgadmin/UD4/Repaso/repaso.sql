/*Seleccionar el nombre de los compradores de casa o piso en cualquier dia 15 de 2020 y ordenar la salida de mayor a menor superficie*/

SELECT C.nombre
FROM comprador c JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (tipo_inmueble=id_tipo)
WHERE t.nombre IN ('Casa', 'Piso')
	AND TO_CHAR(fecha_operacion, 'DD') = '15'
	AND TO_CHAR(fecha_operacion, 'YYYY') = '2020'
ORDER BY superficie DESC;



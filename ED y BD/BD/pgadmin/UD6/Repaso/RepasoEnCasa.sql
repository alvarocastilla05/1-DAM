CREATE TABLE productos (
	id_producto		SERIAL,
	nombre			VARCHAR(150),
	precio 			NUMERIC,
	fecha_compra	DATE
);

INSERT INTO productos (nombre, precio, fecha_compra)
VALUES ('pan', 1.50, '10/05/2024');

SELECT *
FROM productos
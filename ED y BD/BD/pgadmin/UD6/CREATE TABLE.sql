CREATE TABLE mi_primera_tabla (
	first_column text,
	second_column integer
);


SELECT *
FROM mi_primera_tabla;

INSERT INTO mi_primera_tabla 
VALUES ('Hola', 1);


CREATE TABLE productos (
	num_producto integer,
	nombre text,
	precio numeric
);


INSERT INTO productos 
VALUES (1, 'Queso', 20.5)

SELECT *
FROM productos

DROP TABLE productos




CREATE TABLE productos (
	num_producto 	integer,
	nombre 			text,
	precio 			numeric DEFAULT 9.99  --El valor por defecto solo funciona sino indicamos nosotros el valor.
);

INSERT INTO productos
VALUES (1, 'MiniGolf');

SELECT *
FROM productos

INSERT INTO productos
VALUES (2, 'Dardos para niños', 5.99);
INSERT INTO producto VALUES (3, 'Queso', 9.99);

INSERT INTO producto (nombre, precio, num_producto) VALUES ('Salchicha', 9.99, 5);
/*Esto no modifica de forma permanente el orden de las columnas, sino que nos permite indicar otro
orden para los valores a insertar.*/

SELECT *
FROM producto
ORDER BY num_producto;

INSERT INTO producto (num_producto, nombre) VALUES (6, 'Xiaomi');
INSERT INTO producto VALUES (4, 'iPad');

--Sino lo damos valores a todas las columnas de la tabla como anteriormente, se pondrá automaticamente el valor por defecto.

INSERT INTO producto (num_producto, nombre, precio) VALUES
 (7, 'Berenjena', 9.99),
 (8, 'Pan', 0.99),
 (9, 'Leche', 1.25);	--Ademas podemos añadir varias filas a la vez.
 
 
ALTER TABLE producto
ALTER COLUMN num_producto TYPE SERIAL;

DROP TABLE producto;

CREATE TABLE producto (
 num_producto SERIAL,
 nombre TEXT,
 precio NUMERIC,
 CONSTRAINT pk_producto PRIMARY KEY (num_producto)
);


INSERT INTO producto (nombre, precio) VALUES
 ('Queso', 9.99),
 ('Pan', 0.99),
 ('Leche', 1.25);
 
ALTER SEQUENCE producto_num_producto_seq
RESTART WITH 1000; --Hace que el serial comience desde 1000 la proxima vez que añadamos un producto.
--INCREMENT BY 10

INSERT INTO producto (nombre, precio)
VALUES ('carne', 10);


INSERT INTO productos (num_producto, nombre, precio)
 SELECT num_producto, nombre, precio FROM nuevos_productos
 WHERE fecha_publicacion = 'today'; --Tambien podremos añadir los datos de otra columna con un consulta indicando que datos queremos. 


INSERT INTO producto (nombre, precio, disponible)
VALUES ('Patatas Pringles', 800, true);

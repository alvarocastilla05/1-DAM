CREATE TABLE producto (
 num_producto INTEGER,
 nombre TEXT,
 precio NUMERIC,
 CONSTRAINT pk_producto PRIMARY KEY (num_producto)
);
CREATE TABLE pedido (
 id_pedido INTEGER,
 direccion_envio TEXT,
 CONSTRAINT pk_pedido PRIMARY KEY (id_pedido)
);
CREATE TABLE items_pedido (
 num_producto INTEGER,
 id_pedido INTEGER,
 cantidad INTEGER,
 CONSTRAINT pk_items_pedido PRIMARY KEY (num_producto, id_pedido),
 CONSTRAINT fk_items_pedido_producto FOREIGN KEY (num_producto)
REFERENCES producto ON DELETE RESTRICT,
 CONSTRAINT fk_items_pedido_pedido FOREIGN KEY (id_pedido) REFERENCES
pedido ON DELETE CASCADE
);


INSERT INTO producto
VALUES (1, 'iPhone', 999.9),
	(2, 'MacBook Pro M3', 2099.9);
	
INSERT INTO pedido
VALUES (1, 'C/Antonio Guerra Gonzalez 7');

INSERT INTO items_pedido 
VALUES (2,1,1)

INSERT INTO pedido
VALUES (2, 'C/Condes del Bustillo 7');

INSERT INTO items_pedido 
VALUES (1,2,100);

SELECT *
FROM pedido JOIN items_pedido USING (id_pedido);

DELETE FROM producto WHERE num_producto = 2;


/*Me falta un ejemplo*/



/*Modificaciones de una tabla*/

ALTER TABLE pedido
ADD COLUMN cliente VARCHAR(200),
ADD COLUMN dni_cliente VARCHAR(10);

ALTER TABLE pedido
DROP COLUMN cliente;

ALTER TABLE pedido 
ALTER COLUMN 

CREATE TABLE pedido (
	num_pedido SERIAL,
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	cliente VARCHAR(150),
	CONSTRAINT pk_pedido PRIMARY KEY (num_pedido)
);


CREATE TABLE detalle_pedido (
	num_producto INTEGER,
	num_pedido INTEGER,
	precio NUMERIC,
	cantidad INTEGER,
	CONSTRAINT pk_detalle_pedido 
		PRIMARY KEY (num_producto, num_pedido)
);

ALTER TABLE detalle_pedido
ADD CONSTRAINT fk_detalle_pedido_pedido FOREIGN KEY (num_pedido) REFERENCES pedido,
ADD CONSTRAINT fk_detalle_pedido_producto FOREIGN KEY (num_producto) REFERENCES producto;


INSERT INTO pedido (cliente)
VALUES ('Luismi el Hacker')
RETURNING num_pedido;

INSERT INTO detalle_pedido
VALUES (1001, 1, 79.9, 10);

DELETE FROM detalle_pedido
WHERE num_pedido = 1
RETURNING *;
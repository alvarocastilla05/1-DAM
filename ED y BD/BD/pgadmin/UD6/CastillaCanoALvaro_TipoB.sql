DROP TABLE IF EXISTS producto;

CREATE TABLE producto (
	cod_producto	INTEGER,
	nombre			VARCHAR(150),
	descripcion		TEXT,
	pvp				NUMERIC,
	categoria 		INTEGER,
	CONSTRAINT pk_producto PRIMARY KEY (cod_producto)
);

DROP TABLE IF EXISTS categoria;

CREATE TABLE categoria (
	id_categoria	INTEGER,
	nombre			VARCHAR(150) NOT NULL,
	descripcion		TEXT,
	CONSTRAINT pk_categoria PRIMARY KEY (id_categoria)
);

DROP TABLE IF EXISTS trabajador;

CREATE TABLE trabajador (
	num_trabajador		INTEGER,
	nombre_completo		VARCHAR(500),
	email				VARCHAR(320),
	cuenta_corriente	VARCHAR(24),
	pass				VARCHAR(12),
	CONSTRAINT pk_trabajador PRIMARY KEY (num_trabajador),
	CONSTRAINT ck_email_condicion CHECK (email LIKE '%@%'),
	CONSTRAINT ck_cuenta_corriente_ES CHECK (cuenta_corriente LIKE 'ES%'),
	CONSTRAINT ck_pass_sinGuion CHECK (pass NOT LIKE '%_%')
);

DROP TABLE IF EXISTS pedido;

CREATE TABLE pedido (
	cod_pedido 		INTEGER,
	fecha_pedido 	DATE NOT NULL,
	num_trabajador	INTEGER NOT NULL,
	dni_comprador	VARCHAR(10) NOT NULL,
	CONSTRAINT pk_pedido PRIMARY KEY (cod_pedido)
);

DROP TABLE IF EXISTS detalle_pedido;

CREATE TABLE detalle_pedido (
	cod_pedido 		INTEGER,
	num_detalle		INTEGER,
	cantidad		INTEGER,
	cod_producto	INTEGER,
	precio			NUMERIC(6,2) NOT NULL,
	descuento		NUMERIC DEFAULT 0,
	CONSTRAINT pk_detalle_pedido PRIMARY KEY (cod_pedido, num_detalle),
	CONSTRAINT ck_cantidad_mayor_0 CHECK (cantidad > 0)
);

DROP TABLE IF EXISTS comprador;

CREATE TABLE comprador (
	dni					VARCHAR(10),
	nombre_completo 	VARCHAR(500),
	email				VARCHAR(320),
	direccion 			VARCHAR(100),
	fecha_alta			DATE,
	CONSTRAINT pk_comprador PRIMARY KEY (dni),
	CONSTRAINT ck_email_condicion CHECK (email LIKE '%@%')
);

ALTER TABLE producto
ADD CONSTRAINT fk_producto_categoria FOREIGN KEY (categoria) REFERENCES categoria(id_categoria);

ALTER TABLE pedido
ADD CONSTRAINT fk_pedido_trabajador FOREIGN KEY (num_trabajador) REFERENCES trabajador(num_trabajador) ON DELETE CASCADE,
ADD CONSTRAINT fk_pedido_comprador FOREIGN KEY (dni_comprador) REFERENCES comprador(dni) ON DELETE CASCADE;


ALTER TABLE detalle_pedido 
ADD CONSTRAINT fk_detalle_pedido_producto FOREIGN KEY (cod_producto) REFERENCES producto(cod_producto) ON DELETE RESTRICT,
ADD CONSTRAINT fk_detalle_pedido_pedido FOREIGN KEY (cod_pedido) REFERENCES pedido(cod_pedido) ON DELETE CASCADE;

INSERT INTO categoria (id_categoria, nombre, descripcion)
VALUES (1, 'Electrónica', 'Productos que dependen de la electricidad');

INSERT INTO comprador (dni, nombre_completo, email)
VALUES ('12345678K', 'Fernando Fanegas', 'fernando.fanegas@yahoo.com');

INSERT INTO trabajador (num_trabajador, nombre_completo, email, cuenta_corriente)
VALUES (1, 'Miguel de la Cuadra', 'mcuadra@mitienda.com', 'ES1200000000000012345678');

INSERT INTO pedido (cod_pedido, fecha_pedido, num_trabajador, dni_comprador)
VALUES (1, '20/11/2023', 1, '12345678K');

INSERT INTO producto (cod_producto, nombre, descripcion, pvp, categoria)
VALUES (1, 'TV LG 55"', 'Televisión 4k', '799.00', 1);

INSERT INTO detalle_pedido (cod_pedido, num_detalle, cantidad, cod_producto, precio)
VALUES (1, 1, 1, 1, 799.00);

INSERT INTO comprador (dni, nombre_completo, email, direccion, fecha_alta)
VALUES ('65465395L', 'Javier Bernal', 'javier.bernal@correo.com', 'Calle Condes del Bustillo 18', '24/01/2024');

INSERT INTO trabajador (num_trabajador, nombre_completo, email, cuenta_corriente)
VALUES (2, 'José Pérez', 'jperez@mitienda.com', 'ES1200000000000087654321');

INSERT INTO pedido (cod_pedido, fecha_pedido, num_trabajador, dni_comprador)
VALUES (2, '21/11/2023', 2, '65465395L');

INSERT INTO producto (cod_producto, nombre, descripcion, pvp, categoria)
VALUES (2, 'Robot de Limpieza', 'Robot que limpia casas', '399.00', 1);

INSERT INTO detalle_pedido (cod_pedido, num_detalle, cantidad, cod_producto, precio)
VALUES (2, 2, 1, 2, 399.00);

DELETE FROM comprador WHERE dni = '65465395L';

UPDATE  detalle_pedido SET precio = precio*0.15 WHERE cod_pedido = 1;







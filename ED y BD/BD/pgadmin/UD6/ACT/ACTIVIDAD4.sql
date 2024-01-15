DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
	dni 				VARCHAR(10),
	nombre 				VARCHAR(150) NOT NULL,
	apellidos 			VARCHAR(500) NOT NULL,
	direccion 			VARCHAR(500),
	telefono 			VARCHAR(20) NOT NULL,
	email 				VARCHAR(150) NOT NULL,
	passw				VARCHAR(8) DEFAULT 0,
	saldo_disponible 	NUMERIC NOT NULL,
	CONSTRAINT pk_usuarios PRIMARY KEY (dni),
	CONSTRAINT longitud_cadena CHECK (passw LIKE '^[^ ]{4,8}$')
);

DROP TABLE IF EXISTS estaciones;

CREATE TABLE estaciones (
	cod_estacion 	VARCHAR(250),
	num_estacion	SERIAL NOT NULL,
	direccion 		VARCHAR(500) NOT NULL,
	latitud 		NUMERIC NOT NULL,
	longitud 		NUMERIC NOT NULL,
	CONSTRAINT pk_estaciones PRIMARY KEY (cod_estacion),
	CONSTRAINT comience_por_e CHECK (cod_estacion ILIKE 'e%')
);

DROP TABLE IF EXISTS bicicletas;

CREATE TABLE bicicletas (
	cod_bicicleta		SERIAL,
	marca 				VARCHAR(100) NOT NULL,
	modelo 				VARCHAR(150) NOT NULL,
	fecha_alta			DATE NOT NULL,
	CONSTRAINT pk_bicicletas PRIMARY KEY (cod_bicicleta)
);

DROP TABLE IF EXISTS uso;

CREATE TABLE uso (
	estacion_salida		VARCHAR(200),
	fecha_salida		TIMESTAMP,
	dni_usuario			VARCHAR(10),
	cod_bicicleta		INTEGER,
	estacion_llegada	VARCHAR(200),
	fecha_llegada		TIMESTAMP NOT NULL,
	CONSTRAINT pk_uso PRIMARY KEY (estacion_salida, fecha_salida, dni_usuario, cod_bicicleta, estacion_llegada)
);

ALTER TABLE uso
ADD CONSTRAINT fk_uso_estaciones FOREIGN KEY (estacion_salida) REFERENCES estaciones(cod_estacion),
ADD CONSTRAINT fk_uso_usuarios FOREIGN KEY (dni_usuario) REFERENCES usuarios(dni),
ADD CONSTRAINT fk_uso_bicicletas FOREIGN KEY (cod_bicicleta) REFERENCES bicicletas(cod_bicicleta),
ADD CONSTRAINT fk_uso_estaciones1 FOREIGN KEY (estacion_llegada) REFERENCES estaciones(cod_estacion);

ALTER TABLE usuarios 
ADD COLUMN fecha_baja DATE;

--No se hacer el apartado C.
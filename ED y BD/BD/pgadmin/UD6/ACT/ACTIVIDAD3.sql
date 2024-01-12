DROP TABLE IF EXISTS invitado;

CREATE TABLE invitado (
	NroInvitado SERIAL,
	nombre VARCHAR(150),
	categoria VARCHAR(150),
	origen VARCHAR(150),
	CONSTRAINT pk_invitador PRIMARY KEY (NroInvitado)
);

DROP TABLE IF EXISTS teatro;

CREATE TABLE teatro (
	codTeat SERIAL,
	nombre VARCHAR(150),
	direccion VARCHAR(500),
	cantAsientos INTEGER,
	CONSTRAINT pk_teatro PRIMARY KEY (codTeat)
);

DROP TABLE IF EXISTS obra;

CREATE TABLE obra (
	codObra SERIAL,
	nombreObra VARCHAR(300),
	autor VARCHAR(150),
	CONSTRAINT pk_obra PRIMARY KEY (codObra)
);

DROP TABLE IF EXISTS exhibe;

CREATE TABLE exhibe (
	codTeat SERIAL,
	fecha DATE,
	codObra SERIAL,
	CONSTRAINT pk_exhibe PRIMARY KEY (codTeat, codObra)
);

DROP TABLE IF EXISTS tipo_asiento;

CREATE TABLE tipo_asiento (
	tipo VARCHAR(150),
	nombre VARCHAR(150),
	descripcion TEXT,
	CONSTRAINT pk_tipo_asiento PRIMARY KEY (tipo)
);

DROP TABLE IF EXISTS asiento_tipo;

CREATE TABLE asiento_tipo (
	nroAsiento INTEGER,
	tipo VARCHAR(150),
	CONSTRAINT pk_asiento_tipo PRIMARY KEY (nroAsiento)
);

DROP TABLE IF EXISTS precio;

CREATE TABLE precio (
	codTeat SERIAL,
	fecha DATE,
	tipo VARCHAR(150),
	precio NUMERIC,
	CONSTRAINT pk_precio PRIMARY KEY (codTeat, fecha, tipo)
);

DROP TABLE IF EXISTS entrada;

CREATE TABLE entrada (
	codTeat SERIAL,
	fecha DATE,
	nroAsiento INTEGER,
	nroInvit SERIAL,
	CONSTRAINT pk_entrada PRIMARY KEY (codTeat, fecha, nroAsiento)
);

ALTER TABLE exhibe 
ADD CONSTRAINT fk_exhibe_teatro FOREIGN KEY (codTeat) REFERENCES teatro(codTeat),
ADD CONSTRAINT fk_exhibe_obra FOREIGN KEY (codObra) REFERENCES obra(codObra);

ALTER TABLE asiento_tipo
ADD CONSTRAINT fk_asiento_tipo_tipo_asiento FOREIGN KEY (tipo) REFERENCES tipo_asiento(tipo);

ALTER TABLE precio
ADD CONSTRAINT fk_precio_exhibe FOREIGN KEY (codTeat, fecha) REFERENCES exhibe(codTeat, fecha);


ALTER TABLE entrada
ADD CONSTRAINT fk_entrada_exhibe FOREIGN KEY (codTeat, fecha) REFERENCES exhibe(codTeat, fecha),
ADD CONSTRAINT fk_entrada_asiento_tipo FOREIGN KEY (nroAsiento) REFERENCES asiento_tipo(nroAsiento),
ADD CONSTRAINT fk_entrada_tipo FOREIGN KEY (nroInvit) REFERENCES invitado(NroInvitado);








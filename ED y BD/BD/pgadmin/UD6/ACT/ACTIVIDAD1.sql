DROP TABLE IF EXISTS libro;

CREATE TABLE libro (
	ISBN VARCHAR(50),
	titulo VARCHAR(150) NOT NULL,
	dni_autor VARCHAR(10) NOT NULL,
	cod_genero INTEGER NOT NULL,
	cod_editorial INTEGER NOT NULL,
	CONSTRAINT pk_libro PRIMARY KEY (ISBN)
);

DROP TABLE IF EXISTS autor;

CREATE TABLE autor (
	dni VARCHAR(10),
	nombre VARCHAR(150) NOT NULL,
	nacionalidad VARCHAR(100), 
	CONSTRAINT pk_autor PRIMARY KEY (dni)
);

DROP TABLE IF EXISTS editorial;

CREATE TABLE editorial (
	cod_editorial SERIAL,
	nombre VARCHAR(150) NOT NULL,
	direccion VARCHAR(500),
	poblacion VARCHAR(200),
	CONSTRAINT pk_editorial PRIMARY KEY (cod_editorial)
);

DROP TABLE IF EXISTS genero;

CREATE TABLE genero (
	id_genero SERIAL,
	nombre VARCHAR(150) NOT NULL,
	descripcion TEXT
	CONSTRAINT pk_genero PRIMARY KEY (id_genero)
);

DROP TABLE IF EXISTS edicion;

CREATE TABLE edicion (
	ISBN VARCHAR(150),
	fecha_publicacion DATE,
	cantidad INTEGER,
	CONSTRAINT pk_edicion PRIMARY KEY (ISBN, fecha_publicacion)
);


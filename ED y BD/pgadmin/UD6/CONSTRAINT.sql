CREATE TABLE productov3 (
	num_producto INTEGER,
	nombre TEXT,
	precio NUMERIC,
	CONSTRAINT precio_positivo CHECK (precio>0)
);

INSERT INTO productov3 (precio)
VALUES (-5); --Da error ya que anteriormente pusimos una restricción de solo números positivos.

DROP TABLE productos;


CREATE TABLE productoV4 (
	num_producto		INTEGER,
	nombre 				TEXT,
	precio 				NUMERIC,
	precio_descontado	NUMERIC,
	CONSTRAINT precio_positivo CHECK (precio > 0),
	CONSTRAINT precio_descontado_positivo CHECK (precio_descontado > 0),
	CONSTRAINT descuento_valido CHECK (precio_descontado < precio)
);

--Restriccion de Obligatoriedad o not-null
--Nos impide que esa fila tenga valores nulos.

CREATE TABLE tienda (
	num_producto 	INTEGER NOT NULL,
	nombre			TEXT NOT NULL,
	precio 			NUMERIC
);


CREATE TABLE productoV6 (
	num_producto 	INTEGER, 
	nombre			TEXT,
	precio			NUMERIC,
	CONSTRAINT pk_productos PRIMARY KEY (num_producto)
);

INSERT INTO productoV6
VALUES (1, 'coche', 10000);

SELECT *
FROM productoV6


CREATE TABLE productoV7 (
	 num_producto INTEGER,
	 nombre TEXT,
	 precio NUMERIC,
	 CONSTRAINT pk_producto PRIMARY KEY (num_producto)
);


CREATE TABLE pedido (
	 id_pedido INTEGER,
	 num_producto INTEGER, 
	 cantidad INTEGER,
	 CONSTRAINT pk_pedido PRIMARY KEY (id_pedido),
	CONSTRAINT fk_pedido_producto
		FOREIGN KEY num_producto
			REFERENCES producto
);

DROP TABLE alumnos

/*Otro ejemplo*/
CREATE TABLE alumno (
	id_alumno SERIAL,
	nombre TEXT,
	CONSTRAINT pk_alumno PRIMARY KEY (id_alumno)
);

CREATE TABLE asignatura (
	id_asignatura	SERIAL,
	nombre			VARCHAR(100),
	profesor 		VARCHAR(200),
	CONSTRAINT pk_asignatura PRIMARY KEY (id_asignatura)
);

CREATE TABLE matricula (
	id_alumno 	INTEGER,
	id_asignatura INTEGER,
	anio_escolar VARCHAR(10),
	CONSTRAINT pk_matricula PRIMARY KEY (id_alumno, id_asignatura, anio_escolar)
);

CREATE TABLE nota (
	id_alumno INTEGER,
	id_asignatura INTEGER,
	anio_escolar VARCHAR(10),
	tipo_evaluacion VARCHAR(1),
	nota NUMERIC(4,2),
	CONSTRAINT pk_nota PRIMARY KEY (id_alumno, id_asignatura, anio_escolar, tipo_evaluacion),
	CONSTRAINT ck_nota_tipo_evaluacion CHECK (tipo_evaluacion IN ('1', '2', '3', 'F')),
	CONSTRAINT fk_nota_matricula FOREIGN KEY (id_alumno, id_asignatura, anio_escolar)
	REFERENCES matricula (id_alumno, id_asignatura, anio_escolar)
);

DROP TABLE IF EXISTS alumnosv2

/*Las claves externas deben de tener el mismo tipo de dato que las claves primarias de donde aputan. 
Salvo cuando la clave primaria es SERIAL*/
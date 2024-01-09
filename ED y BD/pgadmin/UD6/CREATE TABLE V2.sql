DROP TABLE mi_primera_tabla;

DROP TABLE IF EXISTS mi_primera_tabla; --Mejor tener un aviso que un error. 


SELECT (1/2.0)::real, (1/3.0)::real

CREATE TABLE producto_serial(
	id_producto SERIAL,
	nombre TEXT
);

INSERT INTO producto_serial (nombre)
VALUES('Maabook Pro'), ('Dell XPS');

SELECT *
FROM producto_serial;

/*Si hubieramos puesto el id tipo integer, se habría puesto nulo. 
Sin embargo, si lo ponemos como tipo serial, se crea una serie y se va autocompletando.*/
/*SERIAL es muy util si queremos autogenerar un id.*/

/*Ejemplo de practica*/

CREATE TABLE productosV2 (
	id_producto		SERIAL,
	nombre			TEXT,
	precio 			NUMERIC,
	fecha_compra	DATE
);

INSERT INTO productosV2 (nombre, precio, fecha_compra)
VALUES ('carne', 5.50, '06/11/2024')

SELECT *
FROM productosV2;

/*Continuación de apuntes*/

CREATE TABLE alumnos (
	cod_alumno SERIAL,
	nombre VARCHAR(150), --El parentesis de varchar es para indicar el limite de caracteres. 
	apellido1 VARCHAR(150),
	apellido2 VARCHAR(150),
	fecha_nacimiento DATE,
	edad_31_diciembre INT2, --INT2 es el alias de smallint, este nos permite que el valor sea unicamente de 2 bytes.
	email VARCHAR(320)
);

/*Como añadir una tabla en la que se suman varias filas*/

CREATE TABLE alumnosV2 (
	cod_alumno SERIAL,
	nombre VARCHAR(150), --El parentesis de varchar es para indicar el limite de caracteres. 
	apellido1 VARCHAR(150),
	apellido2 VARCHAR(150),
	nombre_completo VARCHAR (450) GENERATED ALWAYS AS (nombre || ' ' || apellido1 || ' ' || apellido2) STORED, 
	fecha_nacimiento DATE,
	edad_31_diciembre INT2, --INT2 es el alias de smallint, este nos permite que el valor sea unicamente de 2 bytes.
	email VARCHAR(320)
);

INSERT INTO alumnosV2 (nombre, apellido1, apellido2)
VALUES ('Álvaro', 'Castilla', 'Cano')

SELECT *
FROM alumnosV2

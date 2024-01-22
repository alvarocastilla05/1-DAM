DROP TABLE IF EXISTS alumnos;

CREATE TABLE alumnos (
	dni 		VARCHAR(10),
	direccion 	VARCHAR(500) NOT NULL,
	nombre 		VARCHAR(150) NOT NULL,
	telefono	VARCHAR(50),
	edad		INTEGER,
	empresa 	VARCHAR(200), --Deberia de ser 10, igual que el cif ya que al ser clave externa, deben de tener el mismo número de caracteres.
	CONSTRAINT pk_alumnos PRIMARY KEY (dni)
);

DROP TABLE IF EXISTS alumnos_asisten;

CREATE TABLE alumnos_asisten (
	dni 		VARCHAR(10),
	n_concreto 	INTEGER,
	CONSTRAINT pk_alumnos_asisten PRIMARY KEY (dni, n_concreto)
);


DROP TABLE IF EXISTS empresas;

CREATE TABLE empresas (
	cif 		VARCHAR(10),
	nombre 		VARCHAR(200) NOT NULL,
	telefono	VARCHAR(50),
	direccion	VARCHAR(500) NOT NULL,
	CONSTRAINT pk_empresas PRIMARY KEY (cif)
);

DROP TABLE IF EXISTS cursos;

CREATE TABLE cursos (
	n_concreto		INTEGER,
	fecha_inicio	DATE NOT NULL,
	fecha_fin		DATE ,
	dni_profesor	VARCHAR(10) NOT NULL,
	tipo_curso		INTEGER,
	CONSTRAINT pk_cursos PRIMARY KEY (n_concreto)
);

DROP TABLE IF EXISTS tipos_curso;

CREATE TABLE tipos_curso (
	cod_curso	INTEGER,
	duracion 	INTEGER NOT NULL,
	programa	VARCHAR(150),
	titulo 		VARCHAR(150) NOT NULL,
	CONSTRAINT pk_tipos_curso PRIMARY KEY (cod_curso)
);

DROP TABLE IF EXISTS profesores;

CREATE TABLE profesores (
	dni 		VARCHAR(10),
	nombre 		VARCHAR(150) NOT NULL,
	apellido	VARCHAR(200) NOT NULL,
	telefono	VARCHAR(50),
	direccion 	VARCHAR(500),
	CONSTRAINT pk_profesores PRIMARY KEY (dni)
);

ALTER TABLE alumnos 
ADD CONSTRAINT fk_alumnos_empresas FOREIGN KEY (empresa) REFERENCES empresas(cif);

ALTER TABLE alumnos_asisten
ADD CONSTRAINT fk_alumnos_asisten_alumnos FOREIGN KEY (dni) REFERENCES alumnos(dni),
ADD CONSTRAINT fk_alumnos_asisten_cursos FOREIGN KEY (n_concreto) REFERENCES cursos(n_concreto);

ALTER TABLE cursos
ADD CONSTRAINT fk_cursos_profesores FOREIGN KEY (dni_profesor) REFERENCES profesores(dni),
ADD CONSTRAINT fk_cursos_tipos_cursos FOREIGN KEY (tipo_curso) REFERENCES tipos_curso(cod_curso);

INSERT INTO empresas (cif, nombre, direccion, telefono)
VALUES ('B14507610', 'Salesianos', 'c/Condes del Bustillo', '954331488'),
('C12345678', 'Persianas Jose Luis', 'c/Antonio Guerra Gonzalez 7', '675314070'),
('D87456123', 'Bar Paco', 'c/Merinos 8', '659883212');

INSERT INTO alumnos (dni, nombre, direccion, telefono, edad, empresa)
VALUES ('12345678k', 'Alvaro', 'c/Antonio 6', '123456789', 15, 'B14507610'),
	('54789632K', 'Carlos', 'c/Paco 6', '456789123', 20, 'B14507610'),
	('98765412F', 'Jose', 'c/Nueva 6', '369852741', 18, 'B14507610'),
	('74185296H', 'Paco', 'c/Fede 6', '95135746', 21, 'B14507610'),
	('56435751J', 'Alvaro', 'c/Bustillo 7', '456936879', 50, 'B14507610');
	
INSERT INTO alumnos (dni, nombre, direccion, telefono, edad, empresa)
VALUES ('45687921H', 'Alvaro', 'c/Antonio 6', '123456789', 15, 'C12345678'),
	('59187962J', 'Carlos', 'c/Paco 6', '456789123', 20, 'C12345678'),
	('75354698M', 'Jose', 'c/Nueva 6', '369852741', 18, 'C12345678'),
	('39658247I', 'Paco', 'c/Fede 6', '95135746', 21, 'C12345678'),
	('549251Y', 'Alvaro', 'c/Bustillo 7', '456936879', 50, 'C12345678');
	
INSERT INTO alumnos (dni, nombre, direccion, telefono, edad, empresa)
VALUES ('489152P', 'Alvaro', 'c/Antonio 6', '123456789', 15, 'D87456123'),
	('16587325K', 'Carlos', 'c/Paco 6', '456789123', 20, 'D87456123'),
	('56435759Y', 'Jose', 'c/Nueva 6', '369852741', 18, 'D87456123'),
	('54689732T', 'Paco', 'c/Fede 6', '95135746', 21, 'D87456123'),
	('21354687F', 'Alvaro', 'c/Bustillo 7', '456936879', 50, 'D87456123');


	

DROP TABLE IF EXISTS docentes;

CREATE TABLE docentes (
	dni			VARCHAR(10),
	nombre		VARCHAR(150) NOT NULL,
	telefono	VARCHAR(20) NOT NULL,
	anioIngreso DATE NOT NULL,
	CONSTRAINT pk_docentes PRIMARY KEY (dni)
);

DROP TABLE IF EXISTS actividades;

CREATE TABLE actividades (
	idAct		VARCHAR(100),
	nombre 		VARCHAR(150) NOT NULL,
	duracion	NUMERIC,
	CONSTRAINT pk_actividades PRIMARY KEY (idAct)
);

DROP TABLE IF EXISTS alumnos;

CREATE TABLE alumnos (
	cod_alumno		INTEGER,
	nombre 			VARCHAR(150) NOT NULL,
	telefono		VARCHAR(20),
	nivel			VARCHAR(50) NOT NULL,
	CONSTRAINT pk_alumnos PRIMARY KEY (cod_alumno)
);

DROP TABLE IF EXISTS asignacion_act;

CREATE TABLE asignacion_act (
	idDoc		INTEGER,
	idAct		VARCHAR(100),
	diaSemana	VARCHAR(100),
	hora		VARCHAR(10),
	CONSTRAINT pk_asignacion_act PRIMARY KEY (idDoc, idAct, diaSemana, hora)
);

DROP TABLE IF EXISTS asistencia_act;

CREATE TABLE asistencia_act (
	idAlum		INTEGER,
	idAct		VARCHAR(100) NOT NULL,
	idDoc		INTEGER,
	CONSTRAINT pk_asistencia_act PRIMARY KEY (idAlum, idAct)
);


ALTER TABLE asignacion_act 
ADD CONSTRAINT fk_asignacion_act_actividades FOREIGN KEY (idAct) REFERENCES actividades(idAct);

ALTER TABLE asistencia_act
ADD CONSTRAINT fk_asistencia_act_alumnos FOREIGN KEY (idAlum) REFERENCES alumnos(cod_alumno),
ADD CONSTRAINT fk_asistencia_act_actividades FOREIGN KEY (idAct) REFERENCES actividades(idAct);





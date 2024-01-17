CREATE TABLE emp (
	id_emp SERIAL,
	nombre VARCHAR(150),
	cod_dep INTEGER,
	id_jefe INTEGER,
	CONSTRAINT pk_emp PRIMARY KEY (id_emp)
	/*CONSTRAINT fk_emp_emp FOREIGN KEY (id_jefe) REFERENCES emp(id_emp),
	CONSTRAINT fk_emp_dep FOREIGN KEY (cod_dep) REFERENCES dep(cod_dep)*/
);


CREATE TABLE dep (
	cod_dep SERIAL,
	nombre VARCHAR(150),
	id_jefe_dep INTEGER,
	CONSTRAINT pk_dep PRIMARY KEY (cod_dep)
	/*CONSTRAINT fk_dep_emp FOREIGN KEY (id_jefe_dep) REFERENCES emp(id_jefe)*/
);

ALTER TABLE emp
ADD CONSTRAINT fk_emp_emp FOREIGN KEY (id_jefe) REFERENCES emp(id_emp),
ADD	CONSTRAINT fk_emp_dep FOREIGN KEY (cod_dep) REFERENCES dep(cod_dep);

ALTER TABLE dep 
ADD CONSTRAINT fk_dep_emp FOREIGN KEY (id_jefe_dep) REFERENCES emp(id_jefe);
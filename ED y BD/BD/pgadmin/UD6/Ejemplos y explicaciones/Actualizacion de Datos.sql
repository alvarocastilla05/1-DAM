SELECT *
FROM producto
ORDER BY num_producto;

UPDATE producto
SET precio = 79.9
WHERE num_producto = 1;

ALTER TABLE producto
ADD COLUMN diposnible BOOLEAN;

UPDATE producto
SET diposnible = true; --CUIDADO, sino ponemos WHERE altera TODAS las filas.

ALTER TABLE producto RENAME COLUMN diposnible TO disponible;


UPDATE producto
SET nombre = 'Leche sin lactosa', precio = 10
WHERE num_producto = 3;

/*Actualizar el precio de los productos que valgan mas de 8 € para descontarles un 10%*/

UPDATE producto 
SET precio = precio - (precio * (10.0/100))
WHERE precio > 8

/*Actualizar un 20% al producto mas caro*/

UPDATE producto 
SET precio = precio - (precio * (20.0/100))
WHERE precio = (
				SELECT MAX(precio)
				FROM producto
);

UPDATE producto 
SET disponible = false 
WHERE num_producto = 1001;
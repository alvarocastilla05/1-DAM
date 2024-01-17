SELECT *
FROM producto
ORDER BY num_producto;

--DELETE FROM producto; PELIGRO!! ESTO BORRA TODAS LAS FILAS.

DELETE FROM producto 
WHERE num_producto = 1;
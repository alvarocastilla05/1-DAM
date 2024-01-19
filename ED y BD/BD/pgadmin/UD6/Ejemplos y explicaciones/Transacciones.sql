--Una transaccion es un lote de operaciones con respecto de la Base de Datos.

SELECT *
FROM producto;

SELECT *
FROM pedido;

SELECT *
FROM pedido JOIN detalle_pedido USING (num_pedido);




/*Funciones de cadenas de caracteres.*/

SELECT 'Valor: ' || 42

SELECT concat('abcd', 2, NULL, 22)

SELECT concat_ws(',', 'abcde', 2, NULL, 22)

SELECT char_length('jose')

SELECT lower('HOLA')

SELECT upper('hola')

SELECT initcap('hola TOMÁS')

SELECT left('abcde', 2)

SELECT right('abcde', 2)

SELECT replace('abcdefabcdef', 'cd', 'XX')

SELECT overlay('Txxxás' placing 'om' from 2 for 3)

SELECT translate('12345', '143', 'ax')

SELECT ltrim('zzzytest', 'xyz')

SELECT rtrim('testxxzx', 'xyz')

SELECT repeat('Pg', 4)

SELECT reverse('abc')

SELECT substr('alfabeto', 3, 2)

SELECT strpos('alto','lt')

SELECT starts_with('alfabeto', 'alfa')


/*split_part nos permite seleccionar una de las opciones indicando la posición al final (1=abc, 2=def, 3=ghi).*/
SELECT split_part('abc~@~def~@~ghi', '~@~', 2)


let laborables = ['lunes', 'martes', 'miercoles', 'jueves', 'viernes'];
let finde = ['sabado', 'domingo'];

let semana = laborables.concat(finde); //Concatena los elementos de varios arrays.
/*
alert('En semana '+semana);
alert('En laborales '+ laborables);
alert('En finde '+finde);

let semana2 = laborables.join(' ');  //Une todos los elementos para formar un String, dentro de los parentesis debemos 
alert(semana2);                     //de poner lo que queremos que aparezca entre los distintos elementos
*/


let ultimoDia = semana.pop(); //Elimina el ultimo elemento del Array.
semana.unshift(ultimoDia); //Añade un elemento en la primera posición del array.

alert('La semana es '+semana);

/*
semana.reverse();
alert(semana); //Reverse invierte el orden de una array.
*/

//Con el metodo splice podemos hacer todas las funciones anteriores.


alert('El domingo es el elemento '+ semana.indexOf('domingo')); //Devuelve el indice de la primera (o última) ocurrecia de un elemento.


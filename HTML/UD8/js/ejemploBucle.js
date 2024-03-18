let unaLista = leerArrayPorTeclado();
alert('El array tiene ' + unaLista.length + ' elementos y es ' + unaLista);


function leerArrayPorTeclado() {
    let continuar;
    let lista = new Array();
    //Con do while.
    /*do{

        let dato = prompt('Diga algo para guardar en el array:');
        continuar = dato!=='';
        if(continuar){
            lista.push(dato)
        }

    }while(continuar);*/

    //Con while.
    let dato = prompt('Diga algo para guardar en el array:');
    while (dato!== '') {

        lista.push(dato);
        dato = prompt('Diga algo para guardar en el array:');

    }

    //Con bucle for
   /* let dato = prompt('Diga algo para guardar en el array:');
    for (;dato !== '';) {

        lista.push(dato);
        dato = prompt('Diga algo para guardar en el array:');

    }*/

    return lista
}
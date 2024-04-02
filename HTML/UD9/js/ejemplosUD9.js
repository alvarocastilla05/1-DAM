//let p1 = document.getElementById("parrafo1");
/*alert(p1.innerHTML);*/ //Muestra tambien la etiqueta strong del parrafo 1.
//alert(p1.innerText);


/*
let elementos = document.querySelectorAll("li"); //Busca todo los que son párrafos

for (let elem of elementos) {
    alert(elem.innerText);
    elem.innerText += ' leido';
}*/
//Si ponemos unicamente querySelector, únicamente nos muestra el primer elementos que cumpla la condición.

/*----------------------------------------------------------------------------------------------------------*/
let boton = document.getElementById('boton');

boton.addEventListener('click', botonPulsado);

function botonPulsado(){
    /*let ultimoLi = document.querySelector('li:last-child');
    alert(ultimoLi.innerText)*/
    let texto = prompt("Diga el texto del nuevo elemento: ");

    //obtengo la lista.
    let lista = document.querySelector('ol');

    //creo el nuevo elemento.
    let nuevoLi = document.createElement('li');

    //le doy contenido.
    nuevoLi.innerText =  texto; //Si queremos podemos poner directamente el prompt.

    //añado el li al ol.
    lista.append(nuevoLi);

    
}

/* ol.before lo añade antes del ol
ol.prepend se añade el primer elemento del ol
ol.append se añade el ultimo elemento del ol.
ol.after lo añade despues del ol.
/*/

/*------------------------------------------------------------------------------*/

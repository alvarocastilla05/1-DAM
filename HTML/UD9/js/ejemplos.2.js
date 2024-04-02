let boton = document.getElementById('boton');

boton.addEventListener('click', botonPulsado);


function botonPulsado() {

    //Aumentar contador
    /*
    let zonaMensajes = document.querySelector('.zonaMensajes');

    let numMensajes = zonaMensajes.querySelector('strong');
    let numActual = parseInt(numMensajes.innerText) + 1;

    numMensajes.innerText = numActual
    */

    //Otra cosa.

    //obtengo la lista.
    let lista = document.querySelector('ol');

    let segundoLi = lista.querySelector('li:nth-child(2)');

    //añado el li al ol.
    lista.append(segundoLi);


}
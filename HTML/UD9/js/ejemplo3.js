let boton = document.getElementById('boton');

boton.addEventListener('click', botonPulsado); //Si además en el parentesis ponemos 'once:true', esto quiere decir que solo va a ocurrir la primera vez que pulsemos en el boto


function botonPulsado() {

    let zonaMensajes = document.querySelector('.zonaMensajes');
    zonaMensajes.innerText = "el boton es tipo "+boton.type;    //Indica el tipo de la etiqueta de lo que le hemos pedido.

    /*let enlace = document.createElement('a');
    enlace.setAttribute('href', '#inicio');
    document.querySelector('body').id='inicio';
    enlace.innerText = " Ir al inicio";
    zonaMensajes.append(enlace);        //Crea un enlace que nos lleva al inicio.*/

    //boton.className += ' text-warning';
    boton.classList.toggle('btn-primary');  //classList.toggle nos permite alternar entre propiedades sin necesidad de usar un IF.
    boton.classList.toggle('btn-danger');


}
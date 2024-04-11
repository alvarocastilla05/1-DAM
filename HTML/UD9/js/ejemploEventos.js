/*let elDiv = document.querySelectorAll('div');
elDiv.addEventListener('mouseover', ratonSobre);

function ratonSobre(elevento){

    let elh1 = this.querySelector('h1');*/

    /*OTRAS FORMAS
    let elh1 = this.childre[0];

    let elh1 = elevento.currenTarget.firstElementChild;

    let elh1 = this.firstElementChild; TAMBIEN SE PODRÍA HACER DE ESTA FORMA PORQUE SABEMOS QUE ES EL PRIMER ELEMENTO.

    elh1.hidden = false;
}*/


//Evento em formulario.

/*let campoNombre = document.getElementById('nombre');
campoNombre.addEventListener('input', eventoInputNombre);*/
let formulario = document.querySelector('form');
formulario.addEventListener('input', eventoInputNombre);
formulario.addEventListener('submit', enviarFormulario)

function eventoInputNombre(evento){
    campoNombre.value = campoNombre.value.toUpperCase();

}

function enviarFormulario(evento){
    evento.preventDefault();
    //hago mis cositas

    alert('He parado el envío de formulario');
    formulario.submit
}
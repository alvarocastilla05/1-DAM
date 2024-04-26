//VARIABLES GLOBALES

let numBocatas = 0;

//ELEMENTOS HTML
let ojo = document.getElementById('verPwd');
let botonActualizar = document.getElementById('actualizar');
let btnTramitar = document.getElementById('tramitar');

//ASIGNACION EVENTOS
ojo.addEventListener('pointerover', mostrarContrasena);
ojo.addEventListener('pointerout', ocultarContrasena);

botonActualizar.addEventListener('click', actualizarCarrito);

btnTramitar.addEventListener('click', tramitarPedido);


//EJERCICIO1
function mostrarContrasena(evento){
    this.previousElementSibling.type = 'text';
}

function ocultarContrasena(evento){
    this.previousElementSibling.type = 'password';
}

//EJERCICIO2
function actualizarCarrito(){
    validarFormulario();
    actualizarMensajeCarrito();
    actualizarTablaCarrito();
}

function validarFormulario(){
    let todosOK = true;
    for(let campo of document.forms.formulario.elements){
        todosOK &&= campo.value;
    }
    if(todosOK){
        let btnTramitar = document.getElementById('tramitar');
        btnTramitar.classList.remove('btn-info');
        btnTramitar.classList.add('btn-success');
        numBocatas++;
    }
}

function actualizarMensajeCarrito(){
    let divMensaje = document.getElementById('numBocatas');
    divMensaje.innerText = (numBocatas)?"Su carrito tiene "+numBocatas+" bocatas":"No ha encargado ningun bocadillo";
    
}

function actualizarTablaCarrito(){
    let tabla = document.querySelector('table');
    let nuevoTr = document.createElement('tr');
    let tdBocadillo = document.createElement('td');
    let tdTamano = document.createElement('td');
    let tdCantidad = document.createElement('td');

    let campos = document.forms.formulario.elements;
    tdBocadillo.innerText = campos.bocata.value;
    tdTamano.innerText = campos.tamano.value;
    tdCantidad.innerText = campos.cantidad.value;
    
    nuevoTr.append(tdBocadillo);
    nuevoTr.append(tdTamano);
    nuevoTr.append(tdCantidad);

    tabla.append(nuevoTr);
}

//EJERCICIO3

function tramitarPedido(){
    let modalBody = document.querySelector('.modal-body');
    if(numBocatas){
        let nuevaTabla = document.querySelector('table').cloneNode(true);
        modalBody.append(nuevaTabla);
        modalBody.firstElementChild.remove();
    }else{
        modalBody.firstElementChild.innerText="Debes de encargar algo para tramitar el pedido";
    }
}



//Cada vez que cambie algun texto, se pase a mayuscula (menos la contraseña)
let formulario = document.getElementById('formulario');

for (let campo of formulario.elements) {
    if (campo.type === "password") {
        campo.nextElementSibling.addEventListener('pointerover', verContrasenia);
        campo.nextElementSibling.addEventListener('pointerout', ocultarContrasenia);
    }
}

let botonValidar = document.getElementById("actualizar");
let botonEnviar = document.getElementById("tramitar");

botonValidar.addEventListener("click", validarFormulario);

botonValidar.addEventListener("click", anade);

botonValidar.addEventListener("click", actualizarMensajeCarrito);

botonValidar.addEventListener("click", actualizarTablaCarrito);

function anade(){

    let elemento = formulario.elements;

    let tablaCarrito = document.querySelector("#offcanvasCarrito table");
    let nuevaFila = document.createElement('tr');

    nuevaFila.innerHTML = `
        <td>Bocadillo</td>
        <td>Tamaño</td>
        <td>Cantidad</td>    
    `
        
    tablaCarrito.appendChild(nuevaFila);


}


function verContrasenia(elEvento) {
    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(elEvento) {
    this.previousElementSibling.type = "password";
}
function validarFormulario(elEvento) {
    let resultado = true;
    if (formulario.elements.nombre.value == '') {
        resultado = false;
    }
    if (formulario.elements.apellidos.value == '') {
        resultado = false;
    }
    if (!formulario.elements.bocata.checked) {
        resultado = false
    }

    if (resultado) {
        formulario.submit();
        document.botonEnviar.style.backgroundColor = `green`
    }
}


let numeroBocadillos = document.getElementById('cantidad');
function actualizarMensajeCarrito(numeroBocadillos) {
    let mensajeCarrito = document.getElementById("numBocatas");

    if (numeroBocadillos === 0) {
        mensajeCarrito.innerText = "No ha encargado aún ningún bocadillo";
    } else {
        mensajeCarrito.innerText = "Su carrito tiene " + numeroBocadillos + " bocadillos";
    }
}


// Función para actualizar la tabla del carrito
function actualizarTablaCarrito(bocadillo, tamaño, cantidad) {
    var tablaCarrito = document.querySelector("#offcanvasCarrito table");
    var nuevaFila = document.createElement("tr");
   
}




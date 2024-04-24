//Cada vez que cambie algun texto, se pase a mayuscula (menos la contraseña)
let formulario = document.forms.registro;

for (let campo of formulario.elements) {
    if (campo.type === "text") {
        campo.addEventListener('input', pasarMayusculas)
    } else if (campo.type === "password") {
        campo.nextElementSibling.addEventListener('pointerover', verContrasenia);
        campo.nextElementSibling.addEventListener('pointerout', ocultarContrasenia);
    } else if (campo.type === "submit") {
        campo.addEventListener("click", validarFormulario)
    }
}

/*let botonEnviar = document.querySelector("button");

botonEnviar.addEventListener("click", validarFormulario);*/

function pasarMayusculas(elEvento) {
    this.value = this.value.toUpperCase();
}

function verContrasenia(elEvento) {
    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(elEvento) {
    this.previousElementSibling.type = "password";
}
function comprobarContrasena(contrasena) {
    // Comprueba que la contraseña tenga al menos 8 caracteres y contenga letras y números
    return /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/.test(contrasena);
}


function validarFormulario(elEvento) {
    let resultado = true;
    if (formulario.elements.nombre.value == '') {
        resultado = false;
    }
    if (!formulario.elements.genero.checked) {
        resultado = false
    }

    if (resultado) {
        formulario.submit();
    }
}


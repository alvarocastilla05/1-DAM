//Cada vez que cambie algun texto, se pase a mayuscula (menos la contraseña)
let formulario = document.forms.registro;

for(let campo of formulario.elements){
    if(campo.type==="text"){
        campo.addEventListener('input', pasarMayusculas)
    }else if(campo.type==="password"){
        campo.nextElementSibling.addEventListener('pointerover', verContrasenia);
        campo.nextElementSibling.addEventListener('pointerout', ocultarContrasenia);
    }else if(campo.type==="submit"){
        campo.addEventListener("click", validarFormulario)
    }
}

/*let botonEnviar = document.querySelector("button");

botonEnviar.addEventListener("click", validarFormulario);*/

function pasarMayusculas(elEvento){
    this.value = this.value.toUpperCase();
}

function verContrasenia(elEvento){
    this.previousElementSibling.type="text";
}

function ocultarContrasenia(elEvento){
    this.previousElementSibling.type="password";
}

/*
function validarContrasenia() {
    let contrasena1 = document.getElementsByName("clave")[0].value;
    let contrasena2 = document.getElementById("confirm_password").value;

    // Comprobar que las contraseñas coinciden
    if (contrasena1 !== contrasena2) {
        alert("Las contraseñas no coinciden");
        return false;
    }

    // Comprobar que la contraseña tenga al menos 8 caracteres
    if (contrasena1.length < 8) {
        alert("La contraseña debe tener al menos 8 caracteres");
        return false;
    }

    // Comprobar que la contraseña contenga al menos una letra y un número
    var letras = '/[a-zA-Z]/';
    var numeros = '/\d/';
    if (!letras.test(contrasena1) || !numeros.test(contrasena1)) {
        alert("La contraseña debe contener al menos una letra y un número");
        return false;
    }

    // Si pasa todas las condiciones, el formulario se puede enviar
    return true;
}*/
function validarFormulario(elEvento){
    let resultado = true;
    if(formulario.elements.nombre.value==''){
        resultado = false;
    }
    if(!formulario.elements.genero.checked){
        resultado = false
    }

    if(resultado){
        formulario.submit();
    }
}


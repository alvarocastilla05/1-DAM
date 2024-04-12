//Cada vez que cambie algun texto, se pase a mayuscula (menos la contraseña)
let formulario = document.forms.registro;

for(let campo of formulario.elements){
    if(campo.type==="text"){
        campo.addEventListener('input', pasarMayusculas)
    }else if(campo.type==="password"){
        campo.nextElementSibling.addEventListener('pointerover', verContrasenia);
        campo.nextElementSibling.addEventListener('pointerover', ocultarContrasenia);
    }
}

function pasarMayusculas(elEvento){
    this.value = this.value.toUpperCase();
}

function verContrasenia(elEvento){
    this.previousElementsSibling.type="text";
}

function ocultarContrasenia(elEvento){
    this.previousElementsSibling.type="password";
}
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

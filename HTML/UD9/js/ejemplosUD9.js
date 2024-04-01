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


let boton = document.getElementById('boton');

boton.addEventListener('click', botonPulsado);

function botonPulsado(){
    let ultimoLi = document.querySelector('li:last-child');
    alert(ultimoLi.innerText)
}

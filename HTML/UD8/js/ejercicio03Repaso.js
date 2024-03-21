/*EJERCICIO 03*/

function sortear(arr) {
    //Math.floor(Math.random()*10); //Esto saca un número aleatorio entre 0-9

    let numAleatorio = Math.floor(Math.random() * arr.length);

    return arr[numAleatorio]
}

/*EJERCICIO 02*/

function camelize(str) {
    //border-left-radius -> borderLeftRadius --Debemos de hacer esto, que la frase sea como la segunda forma.

    //Pasos a seguir:

    //1-Quitamos los guiones y separamos por palabras.

    let palabrasSueltas = str.split(str);

    //2-Cambiar la primera letra a mayúsculas(a partir de la 2º)

    for (let i = 1; i < palabrasSueltas.length; i++) {
        let primeraEnMayuscula = palabrasSueltas[i].charAt(0).toUpperCase();
        palabrasSueltas[i] = primeraEnMayuscula + palabrasSueltas[i].substring(1);
    }

    //3-Unir las palabras.

    return palabrasSueltas.join('');
}

/*EJERCICIO 01*/

function pedirNombres() {
    let resultado = new Array();

    let texto = prompt("Introduzca un texto");

    while (isNaN(texto)) {
        resultado.push(texto);
        texto = prompt("Introduzca un texto");
    }
    return resultado;
}

/*EJERCICIO 04*/

function principal(){
    let propiedadesCSS = pedirNombres();

    for(let i = 0; i<propiedadesCSS.length; i++){
        propiedadesCSS[i] = camelize(propiedadesCSS[i]);
    }

    alert("El escogido es: "+sortear(propiedadesCSS))
}

principal()
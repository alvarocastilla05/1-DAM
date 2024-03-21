/*EJERCICIO 01*/


function redondearElementos(arr){
    for (let i = 0; i < unArray.length; i++) {
        
        if (typeof unArray[i] === 'number' && !isNaN(unArray[i])) {
           
            numerosRedondeados.push(Math.round(unArray[i]));
        }
    }
    return arr
}

redondearElementos(unArray)

/*EJERCICIO 02*/

function eliminarExtremos(arr){

    let ordenado;
    do {
        ordenado = false;
        for (let i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                let menor = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = menor;
                ordenado = true;
            }
        }
    } while (ordenado);

    let primero = arr.shift();
    let eliminado = arr.pop();

    return eliminado;
    
}

/*EJERCICIO 03*/

function parsearNotas(str) {
    let palabrasSueltas = str.split('#');

    parseInt(palabrasSueltas);

    
}

/*EJERCICIO 04*/

function principal(){
    let media;
    let total;
    let UnArray = "Jurado1:4.56#Jurado2:nulo#Jurado3:9.28#Jurado4:3.34#Jurado5:5.9#Jurado6:7.32"

    let propiedadesCSS = parsearNotas(UnArray);

    for(let i = 0; i<propiedadesCSS.length; i++){
        propiedadesCSS[i] = redondearElementos(propiedadesCSS[i]);
    }

    eliminarExtremos(propiedadesCSS);

    for(let i = 0; i<propiedadesCSS.length; i++){
        total +=propiedadesCSS[i];
    }

    media = total/propiedadesCSS.length;
    alert(propiedadesCSS);
}


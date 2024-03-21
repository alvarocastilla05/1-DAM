let numeros = [1, 10, 3, 4, 5, 6, 7, 8, 9];
alert(ordenar(numeros));

function ordenar(arr) {
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
    return arr;
}
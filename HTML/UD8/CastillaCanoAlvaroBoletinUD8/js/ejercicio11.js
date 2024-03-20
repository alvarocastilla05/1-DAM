alert(ej11());

function ej11() {

    let tamano = prompt("Diga cantidad de números")
    let arr = [];
    let num
    arr.length = tamano;
    for (let i = 1; i < (parseInt(tamano) + 1); i++) {
        num = prompt("Diga número")
        arr.push(num);
    }
    alert(arr);

    let nuevonum = prompt('Diga otro número para guardar');
    while (nuevonum !== '' || isNaN(nuevonum)) {
        arr.unshift(nuevonum);
        nuevonum = prompt('Diga otro número para guardar');
    }
    return (arr);

}
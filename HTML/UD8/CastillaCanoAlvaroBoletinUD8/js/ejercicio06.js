let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];

let numdni = prompt('Introduce tu número de DNI sin letra:');
let letradni = prompt('Introduce la letra de tu DNI (en mayúscula):');
let suma = 0;
let letra;

let dni = parseInt(numdni);


if (dni < 0 || dni > 99999999) {
    alert("El número proporcionado no es válido.");
} else {
    letra = letras[dni % 23];
    if (letra === letradni) {
        alert("El número y la letra del DNI son correctos.");
    } else {
        alert("La letra que has indicado no es correcta para este número de DNI.");
    }
}

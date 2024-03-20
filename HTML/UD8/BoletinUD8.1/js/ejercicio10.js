let ejemplo = "La ruta nos aporto otro paso natural";

function esPalindromo(str) {
    str = str.toLowerCase();
    let strfinal = str.split(' ').join('');
    let cadenaReves = strfinal.split('').reverse().join('');
    return strfinal === cadenaReves;
}

if (esPalindromo(ejemplo)) {
    alert("Es palíndromo")
} else {
    alert("No es palíndromo")
}
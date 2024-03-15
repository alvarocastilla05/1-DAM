let mensaje = "hola hola vecinito";
/*
alert(mensaje.indexOf("z"));
alert(mensaje.substring(5,9)); //El segundo valor es el primero que se queda fuera, marcas el inicio y el que está antes del final.
*/
let partes = mensaje.split(' ');
for (let parte of partes) {
    alert(parte)
}

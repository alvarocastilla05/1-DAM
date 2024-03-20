let valores = [true, 5, false, "hola", "adios", 2];

//a)
let mayor = (valores[3]>valores[4]?valores[3]:valores[4]);
alert("el mayor es "+ mayor);

//b)
alert(valores[0]||valores[2]);
alert(valores[0]&&valores[2]);

//c)
alert(valores[1]+valores[5]);
alert(valores[1]-valores[5]);
alert(valores[1]*valores[5]);
alert(valores[1]/valores[5]);
alert(valores[1]%valores[5]);
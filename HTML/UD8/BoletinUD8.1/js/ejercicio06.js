let dni = prompt("Indique su DNI")

dni = (dni<0 || dni>99999999)?"El número proporcionado no es válido":dni%23; 
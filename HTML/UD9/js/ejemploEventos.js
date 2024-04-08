let elDiv = document.querySelectorAll('div');
elDiv.addEventListener('mouseover', ratonSobre);

function ratonSobre(elevento){

    let elh1 = this.querySelector('h1');

    /*OTRAS FORMAS
    let elh1 = this.childre[0];

    let elh1 = elevento.currenTarget.firstElementChild;

    let elh1 = this.firstElementChild; TAMBIEN SE PODRÍA HACER DE ESTA FORMA PORQUE SABEMOS QUE ES EL PRIMER ELEMENTO.*/

    elh1.hidden = false;
}
package ejemploInterfaces;

public interface IDepredador {

	/*Todas las interfaces son por defecto abstractas por eso no es necesario ponerle la palabra Abstract*/
	
	/*Los atributos son de tipo final(son costantes) y publico, aunque en regla general no suelen tener atributos
	 * porque hay muy pocas cosas constantes. Las interfaces dan comportamientos*/
	
	public abstract void localizar (Animal presa); /*Como podemos ver en este ejemplo, nos permite poner public 
													y abstract pero no es necesario*/
	void cazar (Animal presa);
	
	
	
}

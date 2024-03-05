package ejercicio01;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		/*Estoy dando clases de inglés para el B2 y me gustaría que me ayudarais a crear un diccionario.
		Crearemos un programa que simule un diccionario de inglés. Para ello, se deben crear tres clases,
		una llamada Palabra, otra Diccionario y una de principal de prueba. Dependiendo de la forma que
		uséis para ordenar el diccionario, puede que haga falta otra clase más.
		
		Las palabras están caracterizadas por: id, nombre (en inglés) y significado (en español). Basta que
		cada palabra tenga además de su id, dos atributos String, nombre y significado.
		La clase Diccionario se caracteriza por una lista de palabras, siendo la colección usada para
		almacenarlos una colección tipo List instanciada como ArrayList.
		El programa debe poder hacer lo siguiente mediante un menú en la clase principal:
				• Imprimir todas las palabras de la lista, es decir, mostrar diccionario completo usando un
				iterator.
				• Buscar una palabra por nombre devolviendo la palabra encontrada o null en caso contrario.
				Por supuesto, después de buscar una palabra, el programa debe, repito el programa en el
				main y no en el método, debe mostrar por pantalla el significado de la misma.
				• Añadir una nueva palabra a la lista.
				• Modificar una palabra, modificando únicamente el significado de esta por otro nuevo, leído
				por teclado.
				• Ordenar la lista por “nombre de la palabra” usando un orden alfabético descendente, es decir,
				comenzando por Z y terminando por A. Debe hacerse creando una clase propia para el
				criterio de ordenación.
				• Borrar una palabra (ustedes decidís la forma)*/
		
		Map<Palabra, Integer> lista = new HashMap<Palabra, Integer>();

	}

}

package ejemplo1;

import java.util.Random;
import java.util.Scanner;



public class Principal {

    public static void main(String[] args) {
        int fil = 0, col = 0;
        int[][] lista;
        int desde=0;
        int hasta=0;
        int nueva;
        String aux;
        String [] asignaturas= {"Pro", "Lm", "BD"};
        int [][] lista2= {{2,5,4},{3,3,1}};
     
        Random rdm= new Random (System.nanoTime());
        Scanner sc=new Scanner(System.in);

        System.out.println("Bienvenido ");
        System.out.println("Diga el número de filas");
        aux=sc.nextLine();
        fil = Integer.parseInt(aux);
       
        System.out.println("Ahora el numero de columnas");
        aux=sc.nextLine();
        col = Integer.parseInt(aux);
        
        lista = new int[fil][col];
       
        System.out.println("Diga desde");
        aux=sc.nextLine();
        desde = Integer.parseInt(aux);
        System.out.println("Diga hasta");
        aux=sc.nextLine();
        hasta = Integer.parseInt(aux);
        
        //Rellenar
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                lista[i][j]=rdm.nextInt(hasta-desde+1)+desde;
            }
        }
       
        //Mostrar.
        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println();
            
        }
        
        //modificar fila y columna
        
        System.out.println("Diga la fila que quiere cambiar");
        aux=sc.nextLine();
        fil = Integer.parseInt(aux);
       
        System.out.println("Diga la columna que quiere cambiar");
        aux=sc.nextLine();
        col = Integer.parseInt(aux)-1;
        
        System.out.println("Diga la nueva cifra que desea añadir:");
        aux=sc.nextLine();
        nueva=Integer.parseInt(aux);
        lista[fil][col]=nueva;
        
        //Volver a mostrar.
      
        for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j]+"\t");
			}
			System.out.println();
		}
        
        
        
        
        
         
    } 
    

}
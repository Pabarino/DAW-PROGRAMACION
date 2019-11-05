import java.util.Scanner;

public class Ejercicio10 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] numA = new int[20];
    int[] aux = new int[20];
    int x = 19;
    int y = 0;
    
    System.out.println("\nNumeros aleatorios sin ordenar:\n");
    
    //Numeros sin ordenar//
    for (int i = 0; i < 20; i++) {
      
      numA[i] = (int)(Math.random()*101);
      System.out.print(numA[i] + " ");
      
    }
    
    System.out.println("\n");
    
    //ordenar los numeros pares primeros e impares al final//
    for (int i = 0; i < 20; i++) {
      
      if (numA[i] % 2 == 0) {
        
        aux[y] = numA[i];
        y++;
        
      }
      
      else {
       
        aux[x] = numA[i];
        x--;
        
      }      
    }
    
    System.out.println("Numeros aleatorios ordenados:\n");
    
    for (int i = 0; i < 20; i++) {
      
     System.out.print(aux[i] + " ");
      
    }
  }
}

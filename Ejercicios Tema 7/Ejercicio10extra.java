import java.util.Scanner;

public class Ejercicio10extra {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] numA = new int[20];
    String pares = "";
    String impares = "";
    String sPares = "";
    String sImpares = "";
    
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
        
        sPares = String.format(numA[i] + " ");
        pares += sPares;
        
      }
      
      else {
       
       sImpares = String.format(numA[i] + " ");
       impares += sImpares;
        
      }      
    }
    
    System.out.println("Numeros aleatorios ordenados:\n");
    System.out.println(pares + impares);
    
  }
}


import java.util.Scanner;

public class Ejercicio19 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] enteros = new int[12];
    int[] aux = new int[12];
    
    for (int i = 0; i < 12; i++) {
      
      enteros[i] = (int)(Math.random()*201);
      aux[i] = enteros[i];
    }
    
    //Generamos el array original//
    System.out.println("\nArray Original: ");
    System.out.println("-----------------------------------------------------------------------");
    System.out.printf("|%-10s|", "Indice");
    
    for (int i = 0; i < 12; i++) {
      
      System.out.printf("%3d| ", i);
      
    }
    
    System.out.println("\n-----------------------------------------------------------------------");
    System.out.printf("|%-10s|", "Valor");
    
    for (int i = 0; i < 12; i++) {
      
      System.out.printf("%3d| ", enteros[i]);      
      
    }
    
    System.out.println("\n-----------------------------------------------------------------------");
  
    //Pedimos que introduzcan la informacion necesaria//
    System.out.print("\nIntroduzca el numero que quiere insertar (entre 0 y 200): ");
    int numero = s.nextInt();
    System.out.print("\nIntroduzca la posicion donde lo quiere insertar (0-11): ");
    int posicion = s.nextInt();
    
    //Desplazamos los numeros//
    for (int i = 11; i > posicion; i--) {
      
      aux[i] = enteros[i - 1];
      
    }
    
    //Insertamos el valor en la posicion especificada//
    for (int i = 0; i < 12; i++) {
      
      if (i == posicion) {
        
        aux[i] = numero;   
        
      }      
    }
    
    //Generamos el array resultado//
    System.out.println("\nArray Resultado: ");
    System.out.println("-----------------------------------------------------------------------");
    System.out.printf("|%-10s|", "Indice");
    
    for (int i = 0; i < 12; i++) {
      
      System.out.printf("%3d| ", i);
      
    }
    
    System.out.println("\n-----------------------------------------------------------------------");
    System.out.printf("|%-10s|", "Valor");
    
    for (int i = 0; i < 12; i++) {
      
      System.out.printf("%3d| ", aux[i]);      
      
    }
    
    System.out.println("\n-----------------------------------------------------------------------");
 
  }
}

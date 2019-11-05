import java.util.Scanner;

public class Ejercicio18 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] enteros = new int[10];
    int[] aux = new int[10];
    boolean minimo = false;
    boolean maximo = false;
    int y = 0;
    
    for (int i = 0; i < 10; i++) {
      
      enteros[i] = (int)(Math.random()*201);
      
    }
    
    //Generamos el array original//
    System.out.println("\nArray Original: ");
    System.out.println("-------------------------------------------------------------");
    System.out.printf("|%-10s|", "Indice");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("%3d| ", i);
      
    }
    
    System.out.println("\n-------------------------------------------------------------");
    System.out.printf("|%-10s|", "Valor");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("%3d| ", enteros[i]);      
      
    }
    
    System.out.println("\n-------------------------------------------------------------");

    //diferenciamos los menores de los mayores//
    for (int i = 0; i < 5; i++) {
      
      for (int x = 0; ((x < 10) && (!minimo)); x++){
        
        if ((enteros[x] <= 100) && (enteros[x] != -1)) {
          
          aux[y] = enteros[x];
          y++;
          enteros[x] = -1;
          minimo = true;
          
        }        
      }
      
      for (int x = 0; ((x < 10) && (!maximo)); x++){
        
        if ((enteros[x] > 100) && (enteros[x] != 201)) {
          
          aux[y] = enteros[x];
          y++;
          enteros[x] = 201;
          maximo = true;
          
        }        
      }
      
      minimo = false;
      maximo = false;
      
    }
    
    //Generamos el array resultado//
    System.out.println("\nArray Resultado: ");
    System.out.println("-------------------------------------------------------------");
    System.out.printf("|%-10s|", "Indice");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("%3d| ", i);
      
    }
    
    System.out.println("\n-------------------------------------------------------------");
    System.out.printf("|%-10s|", "Valor");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("%3d| ", aux[i]);      
      
    }
    
    System.out.println("\n-------------------------------------------------------------");

    
    
    
  }
}
    
    
    

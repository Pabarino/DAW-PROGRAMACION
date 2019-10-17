import java.util.Scanner;

public class Ejercicio28 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("\nIntroduce el tamaño del array: ");
    int tamaño = s.nextInt();
    
    int size = tamaño;
    String i = "";
    String v = "";
    String v1 = "";
    String v2 = "";;
    String indice = "";
    String sumaV = "";
    String sumaV1 = "";
    String sumaV2 = "";
    
    for (int x = 0; x < tamaño; x++) {
      
      i = String.format("%5d", x);
      indice += i;
      
      int valor = (int)(Math.random()*(201));
      
      v = String.format("%5d", valor);
      sumaV += v;
      
      if ((x == 0) || (x % 2 == 0)) {
        
        v1 = String.format("%5d", valor);
        sumaV1 += v;
      }
      
      else if (x % 2 == 1) {
        
        v2 = String.format("%5d", valor);
        sumaV2 = (v2 + sumaV2);
        
      }
    }
    
    System.out.println("\nArray Original: ");
    System.out.println("Indice  "+ indice);
    System.out.printf("Valor   "+ sumaV);
    
    System.out.println("\n\nArray Resultado: ");
    System.out.println("Indice  "+ indice);
    System.out.printf("Valor   "+ sumaV1 + sumaV2);
    
  }
}
    
    

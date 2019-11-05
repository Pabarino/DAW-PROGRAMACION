import java.util.Scanner;

public class Ejercicio09 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce 8 numeros enteros:");
    
    int numero = 0;
    String[] num = new String[8];
    num[0] = "Primer";
    num[1] = "Segundo";
    num[2] = "Tercer";
    num[3] = "Cuarto";
    num[4] = "Quinto";
    num[5] = "Sexto";
    num[6] = "Septimo";
    num[7] = "Octavo";
    
    for (int i = 0; i < 8; i++) {
      
      System.out.print("\n" + num[i] + " numero:");
      numero = s.nextInt();
      
      if (numero % 2 == 1) {
        
        System.out.println("Impar");
        
      }
      
      else {
        
        System.out.println("Par");
        
      }
      
    }
  }
}

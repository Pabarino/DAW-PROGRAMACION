import Ejercicios1_14.Ejercicio1_14;
import java.util.Scanner;

public class Ejercicio17 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int poder = 0;
    int num = 0;
    
    System.out.print("\nIntroduce un numero binario: ");
    long binario = s.nextLong();
    long longitud = Ejercicios1_14.Ejercicio1_14.digitos(binario);
    
    for (int i = 0; i < longitud; i++) {
      
      if (binario % 10 == 1) {
        
        num += Ejercicios1_14.Ejercicio1_14.potencia(2, i);
        
      }
      
      binario /= 10;
      
    }
    
    System.out.println("\nDecimal: " + num);
    
  }
}


import Ejercicios1_14.Ejercicio1_14;

public class Ejercicio15 {
  
  public static void main(String[] args) {
    
    for (long i = 0; i <= 1000; i++) {
      
      if (Ejercicios1_14.Ejercicio1_14.esPrimo(i)) {
        
        System.out.print(i + " ");
      }
    }
  }
}

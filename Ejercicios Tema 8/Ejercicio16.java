import Ejercicios1_14.Ejercicio1_14;

public class Ejercicio16 {
  
  public static void main(String[] args) {
    
    for (long i = 0; i < 100000; i++) {
      
      if (Ejercicios1_14.Ejercicio1_14.esCapicua(i)) {
        
        System.out.print(i + " ");
      }
    }
  }
}

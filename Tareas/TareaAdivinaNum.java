import java.util.Scanner;

public class TareaAdivinaNum {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero.");
    
    int N = 0;
    int intentos = 0;
    int max = 0;
    int min = 0;
    int turnos = 1;
    
    do {
      
      System.out.print("Numero: ");
      int num = s.nextInt();
      
      if (num == N) {
        System.out.println("\nHas adivinado el numero.");
        turnos = 0;        
      }
      
      else {
        
        if (num < N) {
          System.out.println("\nEl numero introducido es menor que el valor N.");
          
          if (min == 0) {
            min = num;
          }
          
          else if (num > min) {
            min = num;
          }
          
        }
        
        else {
          System.out.println("\nEl numero introducido es mayor que el valor N.");
          
          if (max == 0) {
            max = num;
          }
          
          if (num < max) {
            max = num;
          }
          
        }
        
      }
      
      if (intentos == 5) {
        
        if (max == 0) {
          System.out.println("\nEl numero inferior introducido mas cercano al valor N es el "+ min +"\n");
        }
        
        else if (min == 0) {
          System.out.println("\nEl numero maximo introducido mas cercano al valor N es el "+ max +"\n");
        }
        
        else {
          
          System.out.println("\nLos numeros introducidos mas cercanos entre el que se encuentra \nel valor N serian el "+ min +" y el "+ max+ "\n");
        }
        
        intentos = 0;
        
      }
      
      intentos ++;
      
    } while (turnos != 0);
   
   
   
    
  }
}

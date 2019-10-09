import java.util.Scanner;

public class Ejercicio37 { 
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero positivo.");
    System.out.print("Numero: ");
    int num = s.nextInt();
    
    int mod;
    int numero = num;
    int numInvert = 0;
    
    while (numero != 0) {
      
      mod = numero%10;
      numInvert = (numInvert*10) + mod;
      numero = numero/10;
    }
    
    do {
      
      mod = numInvert%10;
      
      if ( mod > 0) {
        
        for ( int i = 0; i < mod; i++) {
          System.out.print ("| ");
        }
        
        if (numInvert > 9) {
          System.out.print ("- ");
        }
      }
      
      else if ( mod == 0) {
        System.out.print ("- ");
      }
       
      
       
      numInvert = numInvert/10;
      
    } while (numInvert != 0);
  }
}
        
      

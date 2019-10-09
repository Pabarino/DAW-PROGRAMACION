import java.util.Scanner;

public class Ejercicio26 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce un numero entero:");
    System.out.print("\nNumero:");
    int numeroIntroducido = s.nextInt();
    System.out.println("\nIntroduce un digito:");
    System.out.print("\nDigito:");
    int digito = s.nextInt();
    
    int numero = numeroIntroducido;
    int volteado = 0; 
    int longitud = 0; 
    int posicion = 1;
    
    if (numero == 0) { 
      longitud = 1; 
    }
      
    while (numero > 0) { 
      volteado = (volteado * 10) + (numero % 10); 
      numero /= 10; longitud++; 
    } 
        
    while (volteado > 0) { 
      if ((volteado % 10) == digito) { 
        System.out.print(posicion + " "); 
      } 
      volteado /= 10;
      posicion++; 
    } 
    
    System.out.println();
  }
}

import java.util.Scanner;

public class Ejercicio49 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca numeros enteros posivitos. Para terminar, introduzca un numero primo.");
    System.out.println("Entero: ");
    
        
    boolean primo;
    double media = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int cantidadNum = 0;
    int sumaNum = 0;
    
    do {
      
      int numero = s.nextInt();
      
      primo = true;
            
      for ( int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          primo = false;
        }
      }
    
      if (!primo) {
    
        cantidadNum ++;
        sumaNum += numero;
      
        maximo = numero > maximo ? numero : maximo;
        minimo = numero < minimo ? numero : minimo;
      }
    } while (!primo);
    
    media = (double)sumaNum / cantidadNum;    
    
    System.out.println("Se han introducido "+ cantidadNum +" numeros no primos.");
    System.out.println("Maximo: "+ maximo);
    System.out.println("Minimo: "+ minimo);
    System.out.println("Media: "+ media);
    
  }
}      
    
        
        

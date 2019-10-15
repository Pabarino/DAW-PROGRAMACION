import java.util.Scanner;

public class Ejercicio19 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int max = 200;
    int min = -100;
    int mayor = 0;
    int menor = 0;
    int suma = 0;
    double media = 0;
    int longitud = 0;
    
    System.out.println();
    
    for (int i = 0; i < 50; i++) {
      
      int num = (int)(Math.random()*(+max - +min)) + min;
      System.out.print(num + " ");
      
      //comprobamos is es par//
      if (Math.abs(num) % 2 == 0) {
        
        if (mayor == 0) {
          
        mayor = num;
        
        }
        
        //guardamos el par mas grande//
        else if (mayor < num) {
          
          mayor = num;
        
        }
      }
      
      //comprobamos si es impar//
      if (Math.abs(num) % 2 == 1) {
        
        if (menor == 0) {
           
           menor = num;
           
        }
         
        //guardamos el impar mas pequeno//
        else if (menor > num) {
          
          menor = num;
        
        }
      }
      
      suma += num;
      longitud ++;
      
    }
    
    media = (double)suma / (double)longitud;
    
    System.out.println("\n\nEl maximo impar es: "+ mayor);
    System.out.println("El minimo par es: "+ menor);
    System.out.println("La media de los numeros generados es: "+ media);
    
    
    
  }
}

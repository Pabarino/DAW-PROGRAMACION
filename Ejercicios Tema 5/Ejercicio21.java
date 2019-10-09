import java.util.Scanner;

public class Ejercicio21 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce numeros (para acabar introduce uno negativo).");
    
    int mayor = 0;
    int impares = 0;
    int i = 1;
    int cantidadNum = 0;
    int cantidadNumImp = 0;
    int suma = 0;
    int media;
    
    do {
      
      System.out.print("Numero: ");
      int num = s.nextInt();
      
      cantidadNum += 1;
      
      if (num >= 0) {
       if (num%2 == 1) {
        impares = num;
        cantidadNumImp += 1;
       }
      
       else {
        impares = 0;
        
        if ( num > mayor) {
            mayor = num;
          }
        
       } 
      
       suma += impares;
      }
      
      else {
        
      i = -1;
       
      }
      
    } while (i >= 0);
    
    
    media = suma/cantidadNumImp;
    System.out.println("\nHas introducido "+ (cantidadNum-1) +" numeros.");
    System.out.println("La media de los impares es de "+ media +".");
    System.out.println("El mayor de los pares es "+ mayor +".");
  }
}

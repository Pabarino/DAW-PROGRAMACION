import java.util.Scanner;

public class Ejercicio19 {
  
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

   System.out.print("\nPor favor, introduzca un número entero (de 5 cifras como máximo): "); 
   int n = s.nextInt();
   
   int cantidadNum = 0;
   
   int absN = Math.abs(n);
   
   
   if ( absN < 10 ) { 
     cantidadNum = cantidadNum + 1;
     System.out.println("El numero introducido tiene " + cantidadNum + " digitos."); 
     }
     
   else if (( absN >= 10 ) && ( absN < 100 )) { 
     cantidadNum = cantidadNum + 2; 
     System.out.println("El numero introducido tiene " + cantidadNum + " digitos.");
    }
    
   else if (( absN >= 100 ) && ( absN < 1000 )) { 
     cantidadNum = cantidadNum + 3; 
     System.out.println("El numero introducido tiene " + cantidadNum + " digitos.");
     }
     
   else if (( absN >= 1000 ) && ( absN < 10000 )) { 
     cantidadNum = cantidadNum + 4; 
     System.out.println("El numero introducido tiene " + cantidadNum + " digitos.");
     }
     
   else if (( absN >= 10000 ) && ( absN < 100000)){ 
     cantidadNum = cantidadNum + 5; 
     System.out.println("El numero introducido tiene " + cantidadNum + " digitos.");
     }
     
     else {
       System.out.println("El numero introducido es superior a 5 digitos.");
     }
     
     
    
  }
}

public class Ejercicio18 {
  
  public static void main(String[] args) {
  
   int n, primera = 0;

   System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): "); 
   n = Integer.parseInt(System.console().readLine());

   if ( n < 10 ) { 
     primera = n; 
     System.out.println("La primera cifra del número introducido es el " + primera + ".");
     }
     
   else if (( n >= 10 ) && ( n < 100 )) { 
     primera = n / 10;
     System.out.println("La primera cifra del número introducido es el " + primera + ".");
    }
    
   else if (( n >= 100 ) && ( n < 1000 )) { 
     primera = n / 100; 
     System.out.println("La primera cifra del número introducido es el " + primera + ".");
     }
     
   else if (( n >= 1000 ) && ( n < 10000 )) { 
     primera = n / 1000; 
     System.out.println("La primera cifra del número introducido es el " + primera + ".");
     }
     
   else if (( n >= 10000 ) && ( n < 100000)){ 
     primera = n / 10000; 
     System.out.println("La primera cifra del número introducido es el " + primera + ".");
     }
    
    else {
      System.out.println("No has introducido un numero de 5 cifras maximo.");
    }
     
  }
}

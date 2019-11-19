import java.util.Scanner;

public class Ex04pam3 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    boolean salir = false;
    
    System.out.println("Este programa “da vueltas” a un número.");
    System.out.print("Introduzca un numero: ");
    int numero = s.nextInt();
    
    int num = numero;
    int invertido = 0;
    int parteFinal = 0;
    int partePrimera = 0;
    int longitud = 0;
    int cifras = 0;
    
    do {
      
      invertido = (invertido * 10) + (num % 10);
      num = num/10;
      longitud ++;
      
    } while (num != 0);
    
    num = numero;
    
    while (!salir) {
    
      System.out.print("Introduzca el tipo de desplazamiento (izquierda, derecha; salir): ");
      String desplaz = s.next();
      
      if ((desplaz.equals("salir"))) {
        
        salir = true;
        
      }
      
      else {
      
        System.out.print("Introduzca la cantidad de cifras que desea desplazar: ");
        cifras = s.nextInt();
      
        while (cifras > longitud) {
            
            cifras -= longitud;
            
        }
          
        switch (desplaz) {
          
          case "izquierda":
          
          partePrimera = num % ((int)Math.pow(10 , (longitud - cifras)));
          parteFinal = num / ((int)Math.pow(10 , (longitud - cifras)));
          
          if (longitud != cifras) {
          
            num = (partePrimera * (int)(Math.pow(10 , (cifras)))) + parteFinal;
            
            System.out.println("El numero resultante es: "+ partePrimera + parteFinal);
            
          }
          
          else { 
            
            num = (parteFinal);
            
            System.out.println("El numero resultante es: "+ parteFinal);
            
          }
          
          break;
          
          case "derecha":
           
          partePrimera = num % ((int)Math.pow(10 , (cifras)));
          parteFinal = num / ((int)Math.pow(10 , (cifras)));
          
          if (longitud != cifras) {
          
            num = (partePrimera * (int)(Math.pow(10 , (longitud - cifras)))) + parteFinal;
            
            System.out.println("El numero resultante es: "+ partePrimera + parteFinal);
                 
           }
           
           else {
             
             num = (partePrimera * (int)(Math.pow(10 , (longitud - cifras))));
            
            System.out.println("El numero resultante es: "+ partePrimera);
                 
           }
                    
          break;
          
          default:
          break;
          
        }
      }
    }
  }
}

//PABLO ARINO MUNOZ//
      
    
    

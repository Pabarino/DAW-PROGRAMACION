import java.util.Scanner;

public class Ex04pam2 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    boolean alturaB = false;
    boolean orientacionB = false;
    int altura = 0;
    String orientacion = "";
    
    System.out.println("\nEste programa pinta piramides.");
    
    while (!alturaB) {
      
      System.out.print("Introduzca la altura (1-10): ");
      altura = s.nextInt();
      
      if ((altura >= 1) && (altura <= 10)) {
        
        alturaB = true;
        
      }
      
      else {
        
        System.out.print("Incorrecto. ");
        
      }
      
    }
    
    while (!orientacionB) {
      
      System.out.print("Introduzca la orientacicon (izquierda, derecha, arriba, abajo): ");
      orientacion = s.next();
      
      switch (orientacion) {
        
        case "izquierda":
        case "derecha":
        case "arriba":
        case "abajo":
        orientacionB = true;
        break;
        
        default:
        System.out.print("Incorrecto. ");
        break;
        
      }
      
    }
    
     System.out.print("Introduzca el primer caracter: ");
     char a = s.next().charAt(0);
     
     System.out.print("Introduzca el segundo caracter: ");
     char b = s.next().charAt(0);
     
     System.out.println("\n");
     
     //inicializo variables//
     int base = ((altura * 2) - 1);
     int izquierda = 0;
     int relleno = 0;
     int resto = 0;
     
      switch (orientacion) {
        
        case "arriba":
        
        izquierda = altura - 1;
        relleno = 1;
        
        for (int x = 0; x < altura; x ++) {
          
          //espacios a la izquierda//
          for (int i = 0; i < izquierda; i++) {
            
            System.out.print(" ");
            
          }
          
          //imprimimos el interior de la piramide//
          for (int i = 0; i < relleno; i++) {
            
            if ((i == 0) || (i % 2 == 0)) {
              
              System.out.print(a);
              
            }
            
            else {
              
              System.out.print(b);
              
            }
            
          }
          
          System.out.println();
          izquierda --;
          relleno += 2;
          
        }
        
        break;
        
        case "izquierda":
        
        relleno = 1;
        izquierda = altura - 1;
        resto = base - altura;
        
        //primera mitad//
        for (int x = 0; x < altura; x ++) {
          
          //espacios a la izquierda//
          for (int i = 0; i < izquierda; i++) {
            
            System.out.print(" ");
            
          }
          
          //imprimimos el interior de la piramide//
          for (int i = 0; i < relleno; i++) {
            
            if ((i == 0) || (i % 2 == 0)) {
              
              System.out.print(a);
              
            }
            
            else {
              
              System.out.print(b);
              
            }
            
          }
          
          System.out.println();
          relleno ++;
          izquierda--;
          
        }
        
        //segunda mitad//
        for (int x = 0; x < resto; x ++) {
          
          //espacios a la izquierda//
          for (int i = 0; i < izquierda + 2; i++) {
            
            System.out.print(" ");
            
          }
          
          //imprimimos el interior de la piramide//
          for (int i = 2; i < relleno; i++) {
            
            if ((i == 0) || (i % 2 == 0)) {
              
              System.out.print(a);
              
            }
            
            else {
              
              System.out.print(b);
              
            }
            
          }
          
          System.out.println();
          relleno --;;
          izquierda++;
          
        }
        break;
        
        case "derecha":
        
        relleno = 1;
        resto = base - altura;
        
        //primera mitad//
        for (int x = 0; x < altura; x ++) {
          
          //imprimimos el interior de la piramide//
          for (int i = 0; i < relleno; i++) {
            
            if ((i == 0) || (i % 2 == 0)) {
              
              System.out.print(a);
              
            }
            
            else {
              
              System.out.print(b);
              
            }
            
          }
          
          System.out.println();
          relleno ++;
          
        }
        
        //segunda mitad//
        for (int x = 0; x < resto; x ++) {
          
          //imprimimos el interior de la piramide//
          for (int i = 2; i < relleno; i++) {
            
            if ((i == 0) || (i % 2 == 0)) {
              
              System.out.print(a);
              
            }
            
            else {
              
              System.out.print(b);
              
            }
            
          }
          
          System.out.println();
          relleno --;;
          
        }
        
        
        break;
        
        case "abajo":
        
        relleno = base;
        
        for (int x = 0; x < altura; x ++) {
          
          //espacios a la izquierda//
          for (int i = 0; i < izquierda; i++) {
            
            System.out.print(" ");
            
          }
          
          //imprimimos el interior de la piramide//
          for (int i = 0; i < relleno; i++) {
            
            if ((i == 0) || (i % 2 == 0)) {
              
              System.out.print(a);
              
            }
            
            else {
              
              System.out.print(b);
              
            }
            
          }
          
          System.out.println();
          izquierda ++;
          relleno -= 2;
          
        }
        break;
        
        default:
        break;
        
      }
  }
}
        
//PABLO ARINO MUNOZ//
    
    
    

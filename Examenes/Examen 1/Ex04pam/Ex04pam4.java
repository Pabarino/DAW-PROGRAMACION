import java.util.Scanner;

public class Ex04pam4 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa codifica números en “letras similares”.");
    
    boolean salir = false;
    int numero = 0;
    int num = 0;
    int resto = 0;
    int invertido = 1;
    int longitud = 0;
    String letra = "";
    String codigo = "";
    
    while (!salir) {
    
      System.out.print("Introduzca un número entero (0 para salir): ");
      numero = s.nextInt();
      
      num = numero;
      
       if (numero == 0) {
        
        salir = true;
        
      }
      
      else { 
      
        do {
          
          resto = num % 10;
          invertido = (invertido * 10) + resto;
          num = num / 10;
          longitud ++;
          
        } while (num != 0);
        
        num = numero;
        resto = 0;
        
        do {
        
          resto = invertido % 10;
          invertido = invertido / 10;
          
          switch (resto) {
            
            case 0:
            letra = "O";
            break;
            
            case 1:
            letra = "I";
            break;
            
            case 2:
            letra = "Z";
            break;
            
            case 3:
            letra = "E";
            break;
            
            case 4:
            letra = "A";
            break;
            
            case 5:
            letra = "S";
            break;
            
            case 6:
            letra = "b";
            break;
            
            case 7:
            letra = "J";
            break;
            
            case 8:
            letra = "B";
            break;
            
            case 9:
            letra = "g";
            break;
            
            default:
            break;
            
          }
          
          codigo = (codigo + letra);
          longitud --;
          
        } while (longitud > 0);
        
        System.out.println(codigo);
        codigo = "";
        
      }
    }
  }
}

//PABLO ARINO MUNOZ//

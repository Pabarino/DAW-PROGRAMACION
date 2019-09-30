import java.util.Scanner;

public class Ejercicio04 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Introduce las horas trabajadas durante la semana: ");
  int horas= s.nextInt(); 
  int salario;
  salario = 0;
  
  if (0<= horas) {
     if ( horas <= 40) {
     salario = horas * 12;
    }
   }
   
   if (41<= horas) {
    salario = ((horas - 40) * 16) + 480;
    
   }
   
   else {
     System.out.println("El numero introducido no es valido.");
   }
 
  System.out.println("El salario total es de: " + salario);
  
  
  
  
  }
}


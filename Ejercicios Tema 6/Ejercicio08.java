import java.util.Scanner;

public class Ejercicio08 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int partido = 1;
    String vict1 = "| 1 |";
    String vict2 = "| 2 |";
    String empate = "| X |";
    
    System.out.println("\n\n");
    System.out.printf("%6s %6s %6s %6s\n","PARTIDOS" , vict1, empate, vict2);
    System.out.println("----------------------------");
    
    do {
      
      int result = (int)(Math.random()*6) + 1;
      
      switch (result) {
        
        case 1:
        case 2:
        case 3:
        System.out.printf("%8s \033[31m%6s \033[97m%6s %6s\n",partido , vict1, empate, vict2);
        System.out.println("----------------------------");
        break;
        
        case 4:
        case 5:
        System.out.printf("%8s %6s \033[31m%6s \033[97m%6s\n",partido , vict1, empate, vict2);
        System.out.println("----------------------------");
        break;
        
        case 6:
        System.out.printf("%8s %6s \033[97m%6s \033[31m%6s\033[97m\n",partido , vict1, empate, vict2);
        System.out.println("----------------------------");
        break;
                
      }
      
      partido ++;
    } while (partido < 15);
    
    int pleno = (int)(Math.random()*3) + 1;
      
      switch (pleno) {
        
        case 1:
        System.out.printf("%8s \033[31m%6s \033[97m%6s %6s\n","PLENO" , vict1, empate, vict2);
        System.out.println("----------------------------");
        break;
        
        case 2:
        System.out.printf("%8s %6s \033[31m%6s \033[97m%6s\n","PLENO" , vict1, empate, vict2);
        System.out.println("----------------------------");
        break;
        
        case 3:
        System.out.printf("%8s %6s \033[97m%6s \033[31m%6s\033[97m\n","PLENO" , vict1, empate, vict2);
        System.out.println("----------------------------");
        break;
      }
    
    
  }
} 

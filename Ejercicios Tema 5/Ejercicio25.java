import java.util.Scanner;

public class Ejercicio25 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce el numero que desea invertido:");
    int input = s.nextInt();
    
    int reversedNum = 0;
    int last_integer = 0; 
    
    while (input != 0) {
      last_integer = input%10;
      reversedNum = (reversedNum * 10) + last_integer;
      input = input / 10;
      
    }
    
    System.out.println("\nEl numero invertido es: "+ reversedNum);
    
  }
}

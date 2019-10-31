import java.util.Scanner;

public class Ejercicio11 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10];
    boolean esPrimo = true;
    int[] primos = new int[10];
    int y = 0;
    int x = 9;
    
    System.out.println("\nIntroduce 10 numeros.");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("\nN."+ i +":");
      num[i] = s.nextInt();
      
    }
    
    System.out.print("\nArray Inicial.");
    System.out.printf("-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Indice",0,1,2,3,4,5,6,7,8,9);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Valor",num[0],num[1],num[2],num[3],num[4],num[5],num[6],num[7],num[8],num[9]);
    System.out.printf("\n-------------------------------------------------------------------------------");
    
    for (int i = 0; i < 10; i++) {
      
      esPrimo = true;
      
      for (int j = 2; ((j < num[i]) && (esPrimo == true)); j++) {
      
        if (num[i] % j == 0) {
        
          esPrimo = false;
          
        }
      }
      
      if (!esPrimo) {
        
        primos[x] = num[i];
        x--;
        
      }
      
      else {
        
        primos[y] = num[i];
        y++;
        
      }
      
    }
    
    System.out.print("\nArray Final.");
    System.out.printf("-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Indice",0,1,2,3,4,5,6,7,8,9);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Valor",primos[0],primos[1],primos[2],primos[3],primos[4],primos[5],primos[6],primos[7],primos[8],primos[9]);
    System.out.printf("\n-------------------------------------------------------------------------------");
    
  }
}
    
    

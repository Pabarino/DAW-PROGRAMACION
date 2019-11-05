import java.util.Scanner;

public class Ejercicio17 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] enteros = new int[10];
    int[] aux = new int[10];
    boolean contieneNum = false;
    int longitud = 0;
    int numero = 0;
    int x = 9;
    int y = 0;
    
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      
      enteros[i] = (int)(Math.random()*101);
      System.out.print(enteros[i] + " ");
      
    } 
    
    System.out.println();
    
    while (!contieneNum) {
      
      longitud = 0;
      
      System.out.print("\nIntroduce un numero que este dentro del array: ");
      int num = s.nextInt();
      
      for (int i = 0; ((i < 10) && (!contieneNum)); i++) {
        
        if (enteros[i] == num) {
          
          contieneNum = true;
          numero = num;
        }  
        
        else {
          
          longitud ++; 
          
        }
           
      } 
      
      if (!contieneNum) {
          
          System.out.println("\nEl numero no esta en el array. ");
        }
        
        
      
    }
    
    for (int i = longitud - 1; i >= 0; i--) {
      
      aux[x] = enteros[i];
      x--;
      
    }
    
    for (int i = longitud; i < 10 ; i++) {
      
      aux[y] = enteros[i];
      y++;
      
    }
     
    for (int i = 0; i < 10; i++) {
      
      System.out.print(aux[i] + " ");
      
    }
  }
}

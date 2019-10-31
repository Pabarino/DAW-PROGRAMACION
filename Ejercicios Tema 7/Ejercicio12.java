import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10];
    int[] aux = new int[10];
    int nInicial = 0;
    int nFinal = 0;
    
    System.out.println("\nIntroduce 10 numeros.");
    
    //Capturamos los diez numeros//
    for (int i = 0; i < 10; i++) {
      
      System.out.print("\nN."+ i +":");
      num[i] = s.nextInt();
      aux[i] = num[i];
      
    }
    
    //Imprimimos el array inicial//
    System.out.println("\nArray Inicial.");
    System.out.printf("-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Indice",0,1,2,3,4,5,6,7,8,9);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Valor",num[0],num[1],num[2],num[3],num[4],num[5],num[6],num[7],num[8],num[9]);
    System.out.printf("\n-------------------------------------------------------------------------------");
    
    //Capturamos las posiciones y comprobamos las condiciones//
    do {
    
      System.out.print("\n\nIntroduce la posicion inicial: ");
      nInicial = s.nextInt();
      System.out.print("\nIntroduce la posicion final: ");
      nFinal = s.nextInt();
      
      if (nInicial >= nFinal) {
       
       System.out.println("\nEl numero inicial debe ser menor que el final.");
        
      }
      
      if ((nInicial > 9) && (nInicial < 0)) {
       
       System.out.println("\nEl numero inicial debe ser entre 0 y 9.");
        
      }
      
      if ((nFinal > 9) && (nFinal < 0)) {
       
       System.out.println("\nEl numero final debe ser entre 0 y 9.");
        
      }
    }  while ((nInicial >= nFinal) && (nInicial < 0) && (nInicial > 9) && (nFinal < 0) && (nFinal > 9));
    
    //cambiamos de posicion los valores en la arraz acorde a lo recogido anteriormente//
    aux[nFinal] = aux[nInicial];
    num[0] = num[9];
    
    for (int i = nInicial; i > 0; i--) {
      
      num[i] = num[i - 1];
      
    }
      
    for (int i = 9; i > nFinal; i--) {
      
      num[i] = num[i - 1];
      
    }
      
    num[nFinal] = aux[nFinal];
    
    //imprimimos el arraz final//
    System.out.println("\nArray final.");
    System.out.printf("-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Indice",0,1,2,3,4,5,6,7,8,9);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|%6s| %5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |%5d |","Valor",num[0],num[1],num[2],num[3],num[4],num[5],num[6],num[7],num[8],num[9]);
    System.out.printf("\n-------------------------------------------------------------------------------");
    
  }
}

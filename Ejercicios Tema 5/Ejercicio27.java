import java.util.Scanner;

public class Ejercicio27 {

    public static void main (String args []) {
        Scanner s = new Scanner(System.in);

        System.out.println("\nIntroduce un numero superior a 1.");
        System.out.print("Numero:");
        int num = s.nextInt();
        
        int suma = 0;

        for ( int i = 3; i <= num; i += 3) {
          System.out.println(i +" ");
          suma += i;
 
        }
        
        System.out.println("\nLa suma de los multiplos de tres entre 1 y "+ num +" es: "+ suma);
        

    }
}

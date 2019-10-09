import java.util.Scanner;

public class Ejercicio45 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero positivo.");
    System.out.print("Numero: ");
    long num = s.nextLong();
    System.out.println("\nIntroduzca el nuevo digito.");
    System.out.print("Digito: ");
    long dig = s.nextLong();
    System.out.println("\nIntroduzca la posicion del digito que quiera intercambiar.");
    System.out.print("Posicion: ");
    long pos = s.nextLong();
    
    long numero = num;
    long longitud = 0;
    long mitad1 = num;
    long mitad2 = num;
    
    do {
      numero /= 10;
      longitud ++;
    } while ( numero > 0 );
    
    if ( pos <= longitud) {
    
    long posicion = (longitud-pos);
    
    mitad1 /= Math.pow (10, posicion + 1);
    mitad2 %= Math.pow (10, posicion);
    
    System.out.println("El numero resultante es "+ mitad1 +""+ dig +""+ mitad2 +".");
    
    }
    
    else {
    System.out.println("La posicion introducida no es valida");
    }

    
  }
}

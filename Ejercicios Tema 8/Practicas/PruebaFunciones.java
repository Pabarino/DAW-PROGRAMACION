import matematicas.Varios;
import matematicas.Geometria;
import java.util.Scanner;

public class PruebaFunciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n;
    
    //Prueba es primo//
    
    System.out.print("Introduzca un numero entero positivo: ");
    n = s.nextInt();
    
    if (matematicas.Varios.esPrimo(n)) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }
    
    //Prueba digitos()//
    
    double r, h;
    
    System.out.println("Calculo del volumen de un cilindro");
    System.out.print("Introduzca el radio en metros: ");
    r = s.nextDouble();
    System.out.print("Introduzca la altura en metros: ");
    h = s.nextDouble();
    
    System.out.println("El volumen del cilindro es " + matematicas.Geometria.volumenCilindro(r, h) + " m3");
  }
}

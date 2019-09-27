import java.util.Scanner;

public class Ejercicio15 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.println("\n Introduce los detalles especificados: \n");
   System.out.print("Introduce la direccion en que quieres que apunte la piramide (arriba, abajo , izquierda o derecha): ");
   String dir = s.nextLine ();
   System.out.print("Introduce el caracter del que quieres hacer la piramide: ");
   String carS = s.nextLine();
   
   
   char carC = carS.charAt(0);
   
  if (dir.equals("arriba")) {
   
    System.out.println("\n\n             "+carC+"                                ");
    System.out.println("            "+carC+carC+carC+"                           ");
    System.out.println("           "+carC+carC+carC+carC+carC+"                  ");
    System.out.println("          "+carC+carC+carC+carC+carC+carC+carC+"         ");
    System.out.println("         "+carC+carC+carC+carC+carC+carC+carC+carC+carC+"");
    System.out.println("\n\n\nToma piramide.");
    
   }
  
  else if (dir.equals("abajo")) {
    
    System.out.println("\n\n          "+carC+carC+carC+carC+carC+carC+carC+carC+carC+"");
    System.out.println("           "+carC+carC+carC+carC+carC+carC+carC+"             ");
    System.out.println("            "+carC+carC+carC+carC+carC+"                      ");
    System.out.println("             "+carC+carC+carC+"                               ");
    System.out.println("              "+carC+"                                        ");
    System.out.println("\n\n\nToma piramide.");
    
   }
  
  else if (dir.equals("derecha")) {
    
    System.out.println("\n\n           "+carC+"                ");
    System.out.println("           "+carC+carC+"               ");
    System.out.println("           "+carC+carC+carC+"          ");
    System.out.println("           "+carC+carC+carC+carC+"     ");
    System.out.println("           "+carC+carC+carC+carC+carC+"");
    System.out.println("           "+carC+carC+carC+carC+"     ");
    System.out.println("           "+carC+carC+carC+"          ");
    System.out.println("           "+carC+carC+"               ");
    System.out.println("           "+carC+"                    ");
    System.out.println("\n\n\nToma piramide.");
    
   }
  
  else if (dir.equals("izquierda")) {
    
    System.out.println("\n\n               "+carC+"            ");
    System.out.println("              "+carC+carC+"            ");
    System.out.println("             "+carC+carC+carC+"        ");
    System.out.println("            "+carC+carC+carC+carC+"    ");
    System.out.println("           "+carC+carC+carC+carC+carC+"");
    System.out.println("            "+carC+carC+carC+carC+"    ");
    System.out.println("             "+carC+carC+carC+"        ");
    System.out.println("              "+carC+carC+"            ");
    System.out.println("               "+carC+"                ");
    System.out.println("\n\n\nToma piramide.");
    
   }
  
  else {
    System.out.println("\n\nLa direccion introducida no es valida.");
  }
  
   
   
   
   
   
   
   
   
  }
}


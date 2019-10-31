import java.util.Scanner;

public class Ejercicio16 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[20];
    boolean bCinco = false;
    boolean bSiete = false;
    
    System.out.println();
    
    //rellenamos el array//
    for (int i = 0; i < 20; i++) {
      
      num[i] = (int)(Math.random()*401);
      System.out.print(num[i] + " ");
      
    }
    
    //si desea destacar multiplos de cinco//
    System.out.print("\n\nDesea resaltar los multiplos de 5?");
    System.out.print("\nsi/no: ");
    String cinco = s.nextLine();
    
    switch (cinco) {
      
      case "si":
      bCinco = true;
      break;
      
      case "no":
      break;
      
      default:
      
    }
    
    //si desea destacar multiplos de 7//
    if (!bCinco) {
      
      System.out.print("\nEntonces desea resaltar los multiplos de 7?");
      System.out.print("\nsi/no: ");
      String siete = s.nextLine();
      
      switch (siete) {
        
        case "si":
        bSiete = true;
        break;
        
        case "no":
        break;
        
        default:
        
      }
    }
    
    //si no quiere resaltar ningun multiplo//
    if ((!bSiete) && (!bCinco)) {
      
      System.out.println("\nEntonces no me molestes.");
      
    }
    
    System.out.println();
    
    if ((bSiete) || (bCinco)) {
      
      //si queremos resaltar los multiplos de cinco//
      if (bCinco) {
       
        for (int i = 0; i < 20; i++) {
          
          if (num[i] % 5 == 0) {
           
           System.out.print("[" + num[i] + "] ");
            
          }
          
          else {
            
            System.out.print(num[i] + " ");
            
          }
          
        }
        
      }
      
      //si queremos resaltar los multiplos de siete//
      else {
        
        for (int i = 0; i < 20; i++) {
          
          if (num[i] % 7 == 0) {
           
           System.out.print("[" + num[i] + "] ");
            
          }
          
          else {
            
            System.out.print(num[i] + " ");
            
          }
          
        }
        
      }
    }
  }
}
    

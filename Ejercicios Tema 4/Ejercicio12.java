import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.println("\nResponde usando las opciones dadas de manera exacta, sin variaciones de ningun tipo. \n");
   System.out.print("1-Para que dispositivo fue desarrollado el primer procesador intel, modelo 4004: calculadora, pc, atari o grabadora de audio? \n");
   System.out.print("Respuesta: ");
   String ansA = s.nextLine ();
   System.out.print("\n2-En que año salio a la venta el Apple I: 1974, 1975, 1976 o 1977? \n");
   System.out.print("Respuesta: ");
   String ansB = s.nextLine ();
   System.out.print("\n3-En que generacion de computadores nos encontramos hoy en dia: cuarta, quinta, sexta o septima? \n");
   System.out.print("Respuesta: ");
   String ansC = s.nextLine ();
   System.out.print("\n4-En que generacion se comienza a usar cirucitos integrados: primera, segunda, tercera o cuarta? \n");
   System.out.print("Respuesta: ");
   String ansD = s.nextLine ();
   System.out.print("\n5-En que año sento las bases Turing para la Teoria Matematica de la Computacion: 1933, 1935, 1936 o 1934? \n");
   System.out.print("Respuesta: ");
   String ansE = s.nextLine ();
   System.out.print("\n6-Con con que nombre era mejor conocido el IBM 5150: Mega 5150, IBM+, IBM T o IBM PC? \n");
   System.out.print("Respuesta: ");
   String ansF = s.nextLine ();
   System.out.print("\n7-Cual de los siguientes ordenadores de Apple fue el primero en ser producido en masa: Apple I, Apple II, Lisa o Macintosh? \n");
   System.out.print("Respuesta: ");
   String ansG = s.nextLine ();
   System.out.print("\n8-Quien introdujo el primer ordenador personal: Apple, IBM, Microsoft o MITS? \n");
   System.out.print("Respuesta: ");
   String ansH = s.nextLine ();
   System.out.print("\n9-En que año se introdujo el IBM 5150: 1980, 1981, 1982 o 1983? \n");
   System.out.print("Respuesta: ");
   String ansI = s.nextLine ();
   System.out.print("\n10-Cual de los siguientes no es un tipo de S.O: Linux, Windows 9, Unix o Mac OS X? \n");
   System.out.print("Respuesta: ");
   String ansJ = s.nextLine ();
   
   int puntuacion = 0;
   
   if (ansA.equals("calculadora")) {
       System.out.println("\n1.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("\n1.Respuesta incorrecta.");
   } 
   
   if (ansB.equals("1976")) {
       System.out.println("2.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("2.Respuesta incorrecta.");
   } 
   
   if (ansC.equals("quinta")) {
       System.out.println("3.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("3.Respuesta incorrecta.");
   } 
   
   if (ansD.equals("tercera")) {
       System.out.println("4.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("4.Respuesta incorrecta.");
   } 
   
   if (ansE.equals("1936")) {
       System.out.println("5.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("5.Respuesta incorrecta.");
   } 
   
   if (ansF.equals("IBM PC")) {
       System.out.println("6.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("6.Respuesta incorrecta.");
   } 
   
   if (ansG.equals("Apple II")) {
       System.out.println("7.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("7.Respuesta incorrecta.");
   } 
   
   if (ansH.equals("IBM")) {
       System.out.println("8.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("8.Respuesta incorrecta.");
   } 
   
   if (ansI.equals("1981")) {
       System.out.println("9.Respuesta correcta.");
       puntuacion ++;
     } 
   else {
     System.out.println("9.Respuesta incorrecta.");
   } 
   
   if (ansJ.equals("Windows 9")) {
       System.out.println("10.Respuesta correcta. ");
       puntuacion ++;
     } 
   else {
     System.out.println("10.Respuesta incorrecta. ");
   } 
   
   if (puntuacion == 10) {
       System.out.println("\n\n 10/10...¡Fantástico! Permaneciste audaz e ingenioso en una atmósfera de pesimismo extremo.\n\n");
   
      System.out.println("         *  *  *          ");
      System.out.println("        *|_*|_*|*_        ");
      System.out.println("    .-'`|* |* |*| `'-.    ");
      System.out.println("    |`-............-'|    ");
      System.out.println("    |  FELICIDADES!  |    ");
      System.out.println("    |   _  .-.   _   |    ");
      System.out.println("  ,-|'-' '-'  '-' '-'|-,  ");
      System.out.println("/`  \\._            _./  `\\");
      System.out.println("'._    `\"\"\"\"\"\"\"\"\"\"`    _.'");
      System.out.println("    `''--..........--''`  ");
     
   }
   
   if (puntuacion >= 5){
     System.out.println("\n\n" + puntuacion + "/10... no esta nada mal, buen trabajo! \n\n");
     
       System.out.println("     /@         ");
       System.out.println("     \\ \\        ");
       System.out.println("   ___> \\       ");
       System.out.println("  (__O)  \\      ");
       System.out.println(" (____@)  \\     ");
       System.out.println(" (____@)   \\    ");
       System.out.println("  (__o)_    \\   ");
       System.out.println("        \\    \\  ");
    
     
     
   }
   
   else {
     System.out.println("\n\n " + puntuacion + "/10...Oof, bueno otro dia sera...\n\n");
     
     System.out.println("    .-\"\"\"\"\"\"-.      ");
     System.out.println("  .'  \\\\  //  '.    ");
     System.out.println(" /   O      O   \\   ");
     System.out.println(":                :  ");
     System.out.println("|                |  ");
     System.out.println(":       __       :  ");
     System.out.println(" \\  .-\"`  `\"-.  /   ");
     System.out.println("  '.          .'    ");
     System.out.println("    '-......-'      ");
    
    
   }
   
     
 
   
   
    
  }
}

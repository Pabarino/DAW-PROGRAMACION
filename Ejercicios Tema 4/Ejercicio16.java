import java.util.Scanner;

public class Ejercicio16 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.println("\nResponde usando verdadero y falso de manera honesta a las siguientes preguntas. \n");
   System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
   System.out.print("Respuesta: ");
   String ansA = s.nextLine ();
   System.out.println("\n2. Ha aumentado sus gastos de vestuario.");
   System.out.print("Respuesta: ");
   String ansB = s.nextLine ();
   System.out.println("\n3. Ha perdido el interés que mostraba anteriormente por ti.");
   System.out.print("Respuesta: ");
   String ansC = s.nextLine ();
   System.out.println("\n4- Ahora se afeita y se asea con más frecuencia(si es hombre)o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
   System.out.print("Respuesta: ");
   String ansD = s.nextLine ();
   System.out.println("\n5-No te deja que mires la agenda de su teléfono móvil.");
   System.out.print("Respuesta: ");
   String ansE = s.nextLine ();
   System.out.println("\n6- A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
   System.out.print("Respuesta: ");
   String ansF = s.nextLine ();
   System.out.println("\n7- Última mente se preocupa más en cuidar la línea y/o estar bronceado/a.");
   System.out.print("Respuesta: ");
   String ansG = s.nextLine ();
   System.out.println("\n8-Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
   System.out.print("Respuesta: ");
   String ansH = s.nextLine ();
   System.out.println("\n9- Has notado que últimamente se perfuma más.");
   System.out.print("Respuesta: ");
   String ansI = s.nextLine ();
   System.out.println("\n10- Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
   System.out.print("Respuesta: ");
   String ansJ = s.nextLine ();
   
   int puntuacion = 0;
   
   if (ansA.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
   
   if (ansB.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansC.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
   
   if (ansD.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansE.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansF.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansG.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansH.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansI.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if (ansJ.equals("verdadero")) {
       puntuacion = puntuacion + 3;
     } 
     
   if ((puntuacion>=0) && (puntuacion<=10)) {
      System.out.println("\nPuntuacion de " + puntuacion + ".¡\nEnhorabuena! Tu pareja parece ser totalmente fiel.");
    }
    
    else if ((puntuacion>=11) && (puntuacion<=22)) {
      System.out.println("\nPuntuación de " + puntuacion + ".\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    
    else if ((puntuacion>=22) && (puntuacion<=30)) {
      System.out.println("\nPuntuación de " + puntuacion + ".\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
 }
}
   
   
   

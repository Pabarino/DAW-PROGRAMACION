package Ejercicios20_28;
import java.util.Scanner;

public class Ejercicios20_28 {
  
  public static int[] generaArrayInt (int tamaño, int min, int max) {
    
    int[] array = new int[tamaño];
    
    for (int i = 0; i < tamaño; i++) {
      
      array[i] = (int)(Math.random()*(max - min + 1) + min);
      
    }   
    
    return array;
  }
  
  public static int minimoArrayIint (int[] array) {
    
    int min = 0;
    
    for (int i = 0; i < array.length; i++) {
      
      if (i == 0) {
        
        min = array[i];
        
      }
      
      else if (array[i] < min) {
        
        min = array[i];
        
      }      
    }   
    
    return min;
  }
  
  public static int maximoArrayInt (int[] array) {
    
    int max = 0;
    
    for (int i = 0; i < array.length; i++) {
      
      if (i == 0) {
        
        max = array[i];
        
      }
      
      else if (array[i] > max) {
        
        max = array[i];
        
      }      
    }   
    
    return max;
  }
  
  public static int mediaArrayInt (int[] array) {
    
    int media = 0;
    
    for (int i = 0; i < array.length; i++) {
      
      media += array[i];
       
    }   
    
    media = media / array.length;
    
    return media;
  }
  
  public static boolean estaEnArrayInt (int[] array, int num) {
    
    for (int i = 0; i < array.length; i++) {
      
      if (array[i] == num) {
        
        return true;
      }       
    }   
    
    return false;
  }
  
  public static int posicionEnArray (int[] array, int num) {
    
    int posicion = 0;
    
    for (int i = 0; i < array.length; i++) {
      
      if (array[i] == num) {
        
        posicion = i;
      }       
    }   
    
    return posicion;
  }
  
  public static int[] volteaArrayInt (int[] array) {
    
    int[] volteado = new int[array.length];
    int x = array.length;
    
    for (int i = 0; i < array.length; i++) {
      
      volteado[x] = array[i];
      x--;
            
    }   
    
    return volteado;
  }
  
  public static int[] rotaDerechaArrayInt (int[] array, int rotaciones) {
    
    int[] rotado = new int[array.length];
    
    for (int i = 0; i < array.length - 1; i++) {
      
      rotado[i + 1] = array[i];
            
    }   
    
    rotado[0] = array[array.length];
    
    return rotado;
  }
  
  public static int[] rotaIzquierdaArrayInt (int[] array, int rotaciones) {
    
    int[] rotado = new int[array.length];
    
    for (int i = array.length; i > 0 ; i++) {
      
      rotado[i - 1] = array[i];
            
    }   
    
    rotado[array.length] = array[0];
    
    return rotado;
  } 
}
    
    

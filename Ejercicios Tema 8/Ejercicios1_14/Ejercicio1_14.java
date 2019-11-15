package Ejercicios1_14;

public class Ejercicio1_14 {
  
  /*Ejercicio 1*/
  public static boolean esCapicua(long x) {
    
    if (x == voltea(x)) {
      
      return true;
    }
    
    else {
      
      return false;
    }
  }
  
  /*Ejercicio 2*/
  public static boolean esPrimo(long x) {
    if (x < 2) {
      return false;
    } 
    
    else {
    
      for (int i = 2; i < x; i++) {
        if ((x % i) == 0) {
          return false;
        }
      }
    }
    
    return true;
  }
  
  /*Ejercicio 3*/
  public static int siguientePrimo(int x) {
    
    while (!esPrimo(++x)) {};
    
    return x;    
  }
  
  /*Ejercicio 4*/
  public static double potencia(int base, int exponente) {
    
    if (exponente == 0) {
      return 1;
    }
      
    else if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }
    
    int n = 1;
    
    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }
    
    return n;
  }
  
  /*Ejercicio 5*/
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }
    
    if (x == 0) {
      return 1;
    } 
    
    else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
  
  /*Ejercicio 6*/
  public static long voltea(long x) {
    
    if (x < 0) {
      return -voltea(-x);
    }
    
    long v = 0;
    
    do {
      
      v = (v *10) + (x % 10);
      x = x / 10;
      
    } while (x > 0);
    
    return v;
  }
  
  /*Ejercicio 7*/
  public static int digitoN(long x, int posicion) {
    
    int p = digitos(x) - posicion;
    int n = ((int)x / p) % 10;
    
    return n;
    
  }
  
  /*Ejercicio 8*/
  public static int posicionDeDigito(int x, int d) {
    int i;
    
    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {}
      
    if (i == digitos(x)) {
      return -1;
    }
    
    else {
      return i;
    }
  }
  
  /*Ejercicio 9*/
  public static long quitaPorDetras(long x, int n) {
    
    x = x / (long)potencia(10, n);
    
    return x;
    
  }
  
  /*Ejercicio 10*/
  public static long quitaPorDelante(long x, int n) {
    
    x = voltea(voltea(x) / (long)potencia(10, n));
    
    return x;
    
  }  
  
  /*Ejercicio 11*/
  public static long pegaPorDetras(long x, int n) {
    
    x = (x * 10) + n;
    
    return x;
    
  } 
  
  /*Ejercicio 12*/
  public static long pegaPorDelante(long x, int n) {
    
    x = voltea((voltea(x)* 10) + n);
    
    return x;
    
  } 
  
  /*Ejercicio 13*/
  public static long trozoDeNumero(long x, int inicio, int fin) {
    
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x , longitud - fin - 1);
    
    return x;
    
  } 
  
  /*Ejercicio 14*/
  public static long juntaNumeros(long x, long y) {
    
    int longitud = digitos(y);
    long j = x * (long)potencia(10, longitud) + y;
    
    return j;
    
  } 
  
}

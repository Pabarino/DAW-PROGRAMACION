package matematicas;
 
public class Varios {
  
  public static boolean esPrimo(int x) {
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
  
  public static long digitos(long x) {
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
}
  

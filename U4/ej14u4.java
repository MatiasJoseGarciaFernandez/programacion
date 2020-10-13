public class ej14u4 {
  public static void main(String[] args) {
    System.out.println("introduce un numero entero y te dire si es par o divisible entre 5");
    int n =  Integer.parseInt(System.console().readLine());
    if ((n % 2) == 0) {
      System.out.println("el numero es par");
    } else { 
      System.out.println("el numero es impar");
    }
    if ((n % 5) == 0) {
      System.out.println("el numero es divisible entre 5");
    } else {
      System.out.println("el numero no es divisible entre 5");
    }
  }
}


public class ej16u5 {
  public static void main(String[] args) {
    int n;
    System.out.println("¿primo o no primo?");
    System.out.println("dime un numero");
    n= Integer.parseInt (System.console().readLine());
    boolean Primo = true;
    for (int i= 2; i<n; i++ ) {
      if ((n % i) == 0) {
        Primo = false;
      }
    } 
    if (Primo) {
        System.out.println("es primo.");
    }else{
        System.out.println("no es primo.");
    }
  }
}

public class ej22u5 {
  public static void main(String[] args) {
    System.out.println("numeros primos entre 2 y 100");
    boolean primo = true;
    for(int i=2; i<=100; i++) {
      primo= true;
      for(int n=2; n< i; n++) {
        if (i % n == 0) {
          primo = false;
        }
      }
      if (primo) {
      System.out.println(i +" ");
      }

    }
    System.out.println();
  }
}

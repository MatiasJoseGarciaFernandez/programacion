public class ej18u5 {
  public static void main(String[] args) {
    int c;
    int f;
    System.out.println("introduce el numero con el que quieres empezar");
    c= Integer.parseInt (System.console().readLine());
    System.out.println("ahora con el que quieras terminar");
    f= Integer.parseInt (System.console().readLine());
    for (int i= c; i<=f; i+=7) {
      System.out.println("tenemos los numeros: " +i);
    }
  }
}

public class ej12git {
  public static void main(String[] args) {
    String palabra=" ";
    String resultado=" ";
    int veces=0;
    while( (!palabra.equals("salir")) && (veces<4)) {
      System.out.print("introduce una palabra(acaba con salir): ");
      palabra= System.console().readLine();
      veces++;
      if (!palabra.equals("salir")) {
        resultado=palabra+" " +resultado;
      }
    }
    System.out.println(resultado);
    System.out.println("programa cerrado");
  }
}


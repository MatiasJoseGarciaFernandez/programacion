public class ej11git {
  public static void main(String[] args) {
    String palabra=" ";
    String resultado=" ";
    while( !palabra.equals("salir")) {
      System.out.print("introduce una palabra(acaba con salir): ");
      palabra= System.console().readLine();
      if (!palabra.equals("salir")) {
        resultado=palabra+" " +resultado;
      }
    }
    System.out.println(resultado);
    System.out.println("programa cerrado");
  }
}


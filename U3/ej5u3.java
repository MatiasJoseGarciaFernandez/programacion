public class ej5u3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("introduce altura del triangulo: ");
    linea = System.console().readLine();
    int n1;
    n1 = Integer.parseInt( linea );
    System.out.print("introduce base del triangulo: ");
    linea = System.console().readLine();
    int n2;
    n2 = Integer.parseInt( linea );
    int area = ( n1 * n2)/2;
    System.out.println("el area es " + area);
  }
}
    

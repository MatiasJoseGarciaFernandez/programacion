public class ej8u3 {
  public static void main (String [] args) {
    String linea;
    System.out.print("introduce horas trabajadas en la semana: ");
    linea = System.console().readLine();
    int n1;
    n1 = Integer.parseInt( linea );
    int n2;
    n2 = 12;
    
    int cobrado = n1 *n2;
    System.out.println("ha cobrado un total de " + cobrado);
  }
}
    

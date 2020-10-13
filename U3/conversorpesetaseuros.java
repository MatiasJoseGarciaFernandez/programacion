public class conversorpesetaseuros {
  public static void main (String[] args) {
    String linea;
    System.out.print("introduce un número de pesetas a convertir: ");
    linea = System.console().readLine();
    int n1;
    n1 = Integer.parseInt( linea );
    double x;
    x= 0.006;
    double mul = n1 * x;
    System.out.println("pesetas son " + mul );
    
    
  }
}


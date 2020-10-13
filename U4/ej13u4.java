public class ej13u4 {
  public static void main(String[] args) {
    int aux;
    System.out.println("introduce tres numeros enteros para ordenarlos");
    System.out.print("numero 1: ");
    int a =  Integer.parseInt(System.console().readLine());
    System.out.print("numero 2: ");
    int b =  Integer.parseInt(System.console().readLine());
    System.out.print("numero 3: ");
    int c =  Integer.parseInt(System.console().readLine());
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }

    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");

  }
}

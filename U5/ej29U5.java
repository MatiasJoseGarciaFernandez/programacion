public class ej29U5 {
  public static void main(String[] args) {
    int cuenta = 0;
    int suma = 0;
    int numgrande;
    int numpeque;
    System.out.print("Introduzca un numero grande: ");
    numgrande = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un numero pequeno: ");
    numpeque = Integer.parseInt(System.console().readLine());
    System.out.print("Los números enteros positivos menores que " + numgrande );
    System.out.println(" que no son divisibles entre " + numpeque + " son los siguientes: ");
    
    for (int i = 1; i < numgrande; i++) {
      if ((i % numpeque) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}

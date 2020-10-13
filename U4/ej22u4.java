public class ej22u4 {
  public static void main(String[] args) {
    String respuesta;
    System.out.println("calculo la media del trimestre");
    System.out.print("nota 1: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("nota 2: ");
    double b = Double.parseDouble(System.console().readLine());
    double result= (a + b)/2;
    
    if (result >= 5) {
      System.out.println("has sacado un " +result);
    }
    
    if (result <5) {
      System.out.println("cual ha sido el resultado de la recuperacion?(apto o no apto)");
      respuesta = System.console().readLine();
      if (respuesta.equals("apto")) {
        System.out.println("tu nota de programacion es un 5");
      }
      if (respuesta.equals("no apto")) {
        System.out.println(" tu nota es " +result);
      }
    }
  }
}

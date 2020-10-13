public class ej7y8u4 {
  public static void main(String[] args) {
    System.out.print("nota 1: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("nota 2: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("nota 3: ");
    double c = Double.parseDouble(System.console().readLine());
    double result= (a + b + c)/3;
    System.out.println("la media es = " +result);
    
    if (result <5) {
      System.out.print( "insuficiente");
    }
    if ((result >=5) && (result <6)) {
      System.out.print ( "suficiente");
    }
    if ((result >=6) && (result < 7)) {
      System.out.print ("bien");
    }
    if ((result >=7) && (result <9)) {
      System.out.print ("notable");
    }
    if (result >=9) {
      System.out.print ("sobresaliente");
    }
  }
}

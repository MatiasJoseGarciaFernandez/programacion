public class ej9u4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("este programa resuelve ecuaciones de segundo grado del tipo ax² + bx +c = 0");
    System.out.print("dame el valor de a : ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("dame el valor de b : ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print( "dame el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double result1 = ((-b + Math.sqrt(b²-(4*a*c))/2*a);
    double result2 = ((-b - Math.sqrt(b²-4*a*c))/2*a);
    System.out.println("los resultados son= " +resul1+ "y" +result2);
  }
}

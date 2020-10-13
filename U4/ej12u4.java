public class ej12u4 {
  public static void main(String[] args) {
    int puntos = 0;
    System.out.println("preparate para el cuestionario");
    System.out.println("1.¿Cuanta horas de programacion das a la semana?");
    String linea = System.console().readLine();
    int uno = Integer.parseInt( linea );
    if (uno == 8) {
      System.out.println("enhorabuena, has acertado");
      puntos++;
    } else  {
      System.out.println("has fallado suerte en la proxima");
    }
    System.out.println("2.¿el martes empiezas con SINF? (Verdadero= V, Falso= F)");
    String dos = System.console().readLine();
    if (dos.equals("V")) {
      System.out.println("enhorabuena, has acertado");
      puntos++;
    } else {
      System.out.println("has fallado suerte en la proxima");
    }
    System.out.println("3.usamos en LM a) html o b) css");
    String tres = System.console().readLine();
    if (tres.equals("a")) {
      System.out.println("enhorabuena, has acertado");
      puntos++;
    } else {
      System.out.println("has fallado suerte en la proxima");
    }
    System.out.println("has acertado un total de: " +puntos);
  }
}

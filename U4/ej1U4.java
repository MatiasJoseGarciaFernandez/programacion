public class ej1U4 {
  public static void main (String[] args) {
    System.out.println ("dame un dia de la semana");
    int dia= Integer.parseInt(System.console().readLine());
    
    String nombredeldia;
    
    switch (dia) {
      case 1:
        nombredeldia = " lunes toca programacion";
        break;
      case 2:
        nombredeldia= "martes toca sistemas informaticos";
        break;
      case 3:
        nombredeldia= "miercoles toca programacion";
        break;
      case 4:
        nombredeldia= "jueves toca programacion";
        break;
      case 5:
        nombredeldia= "viernes toca sistemas informaticos";
        break;
      default:
        nombredeldia= "a descansar que es finde :p";
    }
  
    System.out.println( + dia + ":" +nombredeldia);
  }
}

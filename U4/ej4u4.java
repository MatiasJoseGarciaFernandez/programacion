public class ej4u4 {
  public static void main (String[] args) {
    System.out.print("introduce las horas trabajada esta semana");
    int horas= Integer.parseInt(System.console().readLine());
    
    if (horas <=40) {
      System.out.println( "esta semana has ganado: " +(horas*12)+ "euros");
    }
    if (horas >40) {
      System.out.println( "esta semana has ganado: " +(horas*16)+ "horas");
    }
  }
}
      
      
    

public class ej11u4 {
  public static void main(String[] args) {
    System.out.println("dame la hora");
    int h =  Integer.parseInt(System.console().readLine());
    System.out.println("dame los minutos");
    int m =  Integer.parseInt(System.console().readLine());
    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " +\ segundosHastaMedianoche + " segundos.");
    System.out.println("Desde las  hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
  }
}

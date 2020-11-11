public class ej9U6 {
  public static void main(String[] args) {
    int contador=0;
    int aleatorio=0;
    
    
    while (aleatorio!=24) {
      aleatorio=((int)(Math.random()*100));
      if((aleatorio%2)==0) {
        System.out.println(aleatorio);
        contador++;
      }
    } 
    System.out.println("se han generado un total de "+contador+ " numeros");
  }
}

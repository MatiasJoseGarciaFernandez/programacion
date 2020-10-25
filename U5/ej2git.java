public class ej2git {
  public static void main(String[] args) {
    int num;
    int start;
    System.out.println("cadena de numeros");
    System.out.print("introduce la cantidad de numeros: ");
    num= Integer.parseInt (System.console().readLine());
    System.out.print("numeros en el que quieres comenzar: ");
    start= Integer.parseInt (System.console().readLine());
    for(int i= start; i<(num+start); i++) {
      if(i!=(num+start)-1){
        System.out.print(i+"-");
      }else{
        System.out.print(i);
      }
    }
  }
}

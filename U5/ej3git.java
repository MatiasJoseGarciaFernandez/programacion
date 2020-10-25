public class ej3git {
  public static void main(String[] args) {
    int num;
    int start;
    int salto;
    System.out.println("cadena de numeros");
    System.out.print("introduce la cantidad de numeros: ");
    num= Integer.parseInt (System.console().readLine());
    System.out.print("numeros en el que quieres comenzar: ");
    start= Integer.parseInt (System.console().readLine());
    System.out.print("introduce el salto: ");
    salto= Integer.parseInt (System.console().readLine());
    for(int i= 1; i<=num; i++) {
      if(i!=num){
        System.out.print(start+"-");
      }else{
        System.out.print(start);
      }
      start=start+salto;
    }
  }
}


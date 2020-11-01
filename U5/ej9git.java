public class ej9git {
  public static void main(String[] args) {
    int num=1;
    int veces=0;
    
    while (( num > 0) && (veces<4))   {
      veces++;
      System.out.print("introduce un numero entero (0 para salir): ");
      num= Integer.parseInt (System.console().readLine());
      if(num>0) {
        System.out.println("el cuadrado de " +num+ " es " +(num*num));
      }
    }
    System.out.println("programa cerrado");
  }
}


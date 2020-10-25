public class ej1git {
  public static void main(String[] args) {
    int num;
    System.out.println("cadena de numeros");
    System.out.print("introduce la cantidad de numeros: ");
    num= Integer.parseInt (System.console().readLine());
    for(int i= 1; i<=num; i++) {
      if(i!=num){
        System.out.print(i+"-");
      }else{
        System.out.print(i);
      }
    }
  }
}

public class ej2U6 {
  public static void main(String[] args) {
    
    String palo= " ";
    String carta= " ";
    
    int numpalo= (int)(Math.random()*4)+1;
    
    switch(numpalo) {
      case 1:
        palo= "picas";
        break;
      case 2:
        palo="diamantes";
        break;
      case 3:
        palo="corazones";
        break;
      case 4:
        palo="treboles";
        break;
      default:
    }
    
    int numerocarta = (int)(Math.random()*13)+1;
    
    switch (numerocarta) {
        case 1:
          carta = "As";
          break;
        case 11:
          carta = "J";
          break;
        case 12:
          carta= "Q";
          break;
        case 13:
          carta= "K";
          break;
        default:
          carta= String.valueOf(numerocarta);
      }
      
      System.out.println(carta+ " de " +palo);
    }
  }

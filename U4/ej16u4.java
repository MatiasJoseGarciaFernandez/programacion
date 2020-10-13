public class ej16u4 {
  public static void main(String[] args) {
    String respuesta;
    int puntos = 0;
    System.out.println("¿es tu pareja infiel? responde este cuestionario (Verdadero= V, Falso= F)");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("2.Ha aumentado sus gastos de vestuario");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+=3;
    }
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    } 
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("9. Has notado que últimamente se perfuma más");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      System.out.println("siguiente pregunta");
      puntos+= 3;
    }
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo delante");
    respuesta = System.console().readLine();
    if (respuesta.equals("V")) {
      puntos+= 3;
    }
    
    // Resultado del cuestionario
    
    if (puntos <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    if ((puntos >11) && (puntos <= 22)) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    if (puntos >= 22) {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}

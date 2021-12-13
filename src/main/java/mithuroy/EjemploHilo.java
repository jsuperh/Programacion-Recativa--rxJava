package mithuroy;

public class EjemploHilo {
    public static void main(String[] args) {
        Thread hilo = new Thread(EjemploHilo::corre);
        hilo.run();
    }

    public static void corre(){
        System.out.println("hola soy un hilo");
    }

}

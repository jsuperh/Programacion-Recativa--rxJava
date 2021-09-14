package EjemploPatroObserver;

public class PatronObservador {
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        Evento evento = new Evento();

        evento.agregaObservador(eventito -> {
            System.out.println("Recibimos el evento -> "+eventito);
        });

        evento.leeTeclado();

    }

}

package EjemploPatroObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evento {

    public interface Observador {
        void actualizar(String evento);
    }

    private final List<Observador> observadores = new ArrayList<>();

    private void notificarObservador(String evento) {
        observadores.forEach(obs -> obs.actualizar(evento));
    }

    public void agregaObservador(Observador observador) {
        observadores.add(observador);
    }

    public void leeTeclado() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            notificarObservador(linea);
        }
    }
}

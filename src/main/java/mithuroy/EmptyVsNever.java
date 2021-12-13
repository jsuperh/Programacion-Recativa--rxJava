package mithuroy;

import io.reactivex.rxjava3.core.Observable;

import static java.lang.Thread.sleep;

public class EmptyVsNever {
    public static void main(String[] args) {
        createObservableUsingEmpty();
        System.out.println("---------------------");
        createObservableUsingNever();

    }

    private static void createObservableUsingEmpty(){
        //crea un observable vacío, se va de frente a imprimir completo

        Observable observable = Observable.empty();
        observable.subscribe(System.out::println, System.out::println, () -> System.out.println("Completo"));

    }

    private static void createObservableUsingNever(){
        //crea un observable con vacíos y nunca llega al imprimir Completo

        Observable observable = Observable.never();
        observable.subscribe(System.out::println, System.out::println, () -> System.out.println("Completo"));

        pausa(3000);

    }

    public static void pausa(int duration){
        try {
            sleep(duration);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

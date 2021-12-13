package mithuroy;

import io.reactivex.rxjava3.core.Observable;

public class ObservableException {

    public static void main(String[] args) {
        throwEcception();
        System.out.println("--------------------");
        throwEcceptionUsingCallable();
    }

    private static void throwEcception(){
        //Los observables muestran la misma instancia para diferentes observables
        Observable observable = Observable.error(new Exception("Un exception "));
        observable.subscribe(System.out::println, errorcillo -> System.out.println("Error 1 : " + errorcillo.hashCode()));
        observable.subscribe(System.out::println, errorcillo -> System.out.println("Error 2 : " + errorcillo.hashCode()));

    }

    private static void throwEcceptionUsingCallable(){
        //Los observables muestran la diferentes instancis para diferentes observables
        Observable observable = Observable.error(() -> {
            System.out.println("Nueva exception creada");
            return new Exception("Un exceptio");
        });
        observable.subscribe(System.out::println, errorcillo -> System.out.println("Error 1 : " + errorcillo.hashCode()));
        observable.subscribe(System.out::println, errorcillo -> System.out.println("Error 2 : " + errorcillo.hashCode()));

    }
}

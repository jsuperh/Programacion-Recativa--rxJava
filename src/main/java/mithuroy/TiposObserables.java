package mithuroy;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import static java.lang.Thread.sleep;

public class TiposObserables {

    public static void main(String[] args) {
        //createColdObservable();
        createHotObservable();
    }

    private static void createColdObservable(){
        Observable<Integer> observable = Observable.just(1,2,3,4,5);
        observable.subscribe(x -> System.out.println("Observable 1: "+ x));

        pausa(3000); //3 segundos

        observable.subscribe(x -> System.out.println("Observable 2: "+ x));

    }

    private static void createHotObservable(){

        ConnectableObservable<Integer> observable = Observable.just(1,2,3,4,5).publish();
        observable.subscribe(x -> System.out.println("Observable 1: "+ x));
        observable.subscribe(x -> System.out.println("Observable 2: "+ x));
        //aiempre hay q poner al ultimo el metodo conecct para q se ejecuten los 2 observables
        observable.connect();


    }

    public static void pausa(int duration){
        try {
            sleep(duration);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

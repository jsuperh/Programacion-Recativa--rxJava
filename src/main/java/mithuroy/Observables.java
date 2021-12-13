package mithuroy;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class Observables {

    public static void main(String[] args) {
        createObservableWithJust();
        createObservableFromIterable();
        createObservableUsingCreate();
        createObserbableUsingCreateAndComplete();
    }

    private static void createObservableWithJust(){
        System.out.println("-----createObservableWithJust()-----");

        Observable<Integer> observable = Observable.just(1,2,3,4,5,6,7,8,9);
        observable.subscribe(System.out::println);

    }

    private static void createObservableFromIterable(){
        System.out.println("-----createObservableFromIterable()-----");

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Observable<Integer> observable = Observable.fromIterable(lista);
        observable.subscribe(System.out::println);
        //tambien se puede imprimir asi:
        observable.subscribe(x -> System.out.println(x));

    }

    private static void createObservableUsingCreate(){
        System.out.println("-----createObservableUsingCreate()-----");

        Observable<Integer> observable = Observable.create(emisor -> {
            emisor.onNext(1);
            emisor.onNext(2);
            emisor.onNext(3);
            emisor.onNext(4);
            emisor.onNext(5);
        });
        observable.subscribe(System.out::println);

    }

    private static void createObserbableUsingCreateAndComplete(){
        System.out.println("-----createObserbableUsingCreateAndComplete()-----");

        Observable<Integer> observable = Observable.create(emisor -> {
            emisor.onNext(1);
            emisor.onNext(2);
            emisor.onNext(3);
            emisor.onNext(4);
            emisor.onNext(5);
            //emisor.onNext(null);
            emisor.onComplete();
        });
        observable.subscribe(System.out::println,
                error -> System.out.println("ups parece q hubo un error: "+error.getLocalizedMessage()),
                () -> System.out.println("Se completo"));
    }
}

package mithuroy;

import io.reactivex.rxjava3.core.Observable;

public class ReactiveLoop {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.range(0, 10);
        observable.subscribe(System.out::println);

        System.out.println("-----------------------------------");

        //aquí sigue la siguiente fórmula  n+m-1, o sea inicio + cuenta - 1
        int inicio = 5, cuenta = 3;
        Observable<Integer> observable2 = Observable.range(inicio , cuenta);
        observable2.subscribe(System.out::println);
    }
}

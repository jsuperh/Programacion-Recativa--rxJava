package mithuroy;

import io.reactivex.rxjava3.core.Observable;

public class ObservableDefer    {

    private static int inicio = 5, cuenta = 3;

    public static void main(String[] args) {

        Observable<Integer> observable = Observable.defer(() -> {
            System.out.println("Nuevo observable es creado con inicio: "+ inicio + " y con cuenta: "+cuenta);
            return Observable.range(inicio, cuenta);
        });
        observable.subscribe(x -> System.out.println("Observable 1 : "+ x));
        cuenta = 4;
        observable.subscribe(x -> System.out.println("Observable 2 : "+ x));

    }
}

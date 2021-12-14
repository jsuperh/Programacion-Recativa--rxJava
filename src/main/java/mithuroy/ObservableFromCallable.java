package mithuroy;

import io.reactivex.rxjava3.core.Observable;

public class ObservableFromCallable {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromCallable(()->{
            System.out.println("llamando al método Callable ");
            return getNumber();
        });
        observable.subscribe(System.out::println, errorcito -> System.out.println("Se ha producido un error" + errorcito.getLocalizedMessage()));
    }

    private static int getNumber(){
        System.out.println("Se ha generado un valor");
        return 3 / 0;
    }

}

package mithuroy;

import io.reactivex.rxjava3.core.Observable;

public class Inicio {

    public static void main(String[] args) {
        Observable.just(1,2,3,4,5)
                .subscribe(System.out::println);
    }
}

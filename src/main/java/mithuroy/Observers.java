package mithuroy;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class Observers {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(1,2,3,4,5,6);

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("se suscribio");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println(integer);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println(e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Se ha completado");
            }
        };

        observable.subscribe(observer);

    }
}

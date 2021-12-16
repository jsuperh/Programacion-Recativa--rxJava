package mithuroy;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;

public class SingleMaybeCompletable {

    public static void main(String[] args) {
        createSingle();
        createMaybe();
        createCompletable();
    }

    private static void createSingle(){
        Single.just("Hola perritos con Single").subscribe(System.out::println);
    }

    private static void createMaybe(){
        //Maybe.just("Hola perritos con Maybe").subscribe(System.out::println);
        Maybe.empty().subscribe(new MaybeObserver<Object>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onSuccess(@NonNull Object o) {
                System.out.println(o);

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("Listo y completado");
            }
        });
    }

    private static void createCompletable(){
        Completable.fromSingle(Single.just("Hola perritos con Single")).subscribe(()-> System.out.println("Ta weno"));

    }

}

package mithuroy;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableInterval {

    public static void main(String[] args) {
        Observable observable = Observable.interval(1, TimeUnit.SECONDS);
        observable.subscribe(x -> System.out.println("Observable 1: " + x));
        pause(2000);

        observable.subscribe(x -> System.out.println("Observable 2: " + x));
        pause(2000);

    }

    private static void pause(int duracion) {
        try {
            Thread.sleep(duracion);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

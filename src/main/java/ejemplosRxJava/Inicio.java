package ejemplosRxJava;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

public class Inicio {

    public static void main(String[] args) {

        //Una forma estar observando y suscibiendo a una cadena
        Observable.just("Hola Soy Josue, que tal como estan, soy Observable").subscribe(System.out::println);

        Observable obser = Observable.just("hola", "que", "tal");
        obser.subscribe(s -> System.out.println(s));

        //Otra forma con Flowable
        Flowable.just("Hola Mundo, como estan soy Flowable").subscribe(System.out::println);

        //Este observable recibe los elementos de cadena y los imprime usando el metodo suscribe y dentro el metodo de imrpesion
        Observable<String> miCadena = Observable.just("Alfa", "Beta", "Gamma", "Delta", "Epsilon");
        miCadena.subscribe(System.out::println);


    }

}

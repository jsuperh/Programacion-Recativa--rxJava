package ejemplosRxJava;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/**
 * Tenga en cuenta que los componentes de RxJava 3 ahora viven debajo io.reactivex.rxjava3
 * y las clases e interfaces base viven debajo io.reactivex.rxjava3.core.
 * <p>
 * Clases base
 * RxJava 3 presenta varias clases base en las que puede descubrir operadores:
 * <p>
 * io.reactivex.rxjava3.core.Flowable: 0..N flujos, soportando Reactive-Streams y contrapresión
 * io.reactivex.rxjava3.core.Observable: 0..N flujos, sin contrapresión,
 * io.reactivex.rxjava3.core.Single: un flujo de exactamente 1 artículo o un error,
 * io.reactivex.rxjava3.core.Completable: un flujo sin elementos pero solo una señal de finalización o error,
 * io.reactivex.rxjava3.core.Maybe: un flujo sin elementos, exactamente un elemento o un error.
 * <p>
 * Algo de terminología
 * Upstream, downstream
 * Los flujos de datos en RxJava consisten en una fuente, cero o más pasos intermedios seguidos por un consumidor
 * de datos o paso combinador (donde el paso es responsable de consumir el flujo de datos por algún medio):
 * <p>
 * source.operator1().operator2().operator3().subscribe(consumer);
 * source.flatMap(value -> source.operator1().operator2().operator3());
 * <p>
 * Aquí, si nos imaginamos a nosotros mismos operator2, mirar a la izquierda hacia la fuente se llama corriente arriba (upstream)
 * Mirar a la derecha hacia el suscriptor / consumidor se denomina downstream .
 * Esto suele ser más evidente cuando cada elemento se escribe en una línea separada:
 * <p>
 * source
 * .operator1()
 * .operator2()
 * .operator3()
 * .subscribe(consumer)
 * <p>
 * Objetos in movimiento
 * En la documentación de RxJava, emission, emits, item, event, signal, data y message son considerados sinónimos y
 * representan el objeto que viaja a lo largo del flujo de datos..
 */


public class HelloWorld {

    public static void main(String[] args) {
        Flowable.just("Hola Mundo").subscribe(System.out::println);

        //Utilizar from y filter, imprimir números mayores a 4
        Integer[] numeros = {1, 15, 8, 80, 12, 13, 2, 1, 5, 94, 6, 4, 9, 10};

        Observable.fromArray(numeros)
                .filter(numeritos -> numeritos > 4)
                .firstElement()
                //.lastElement()
                .count()
                .subscribe(cadena -> System.out.println(cadena));


    }
}

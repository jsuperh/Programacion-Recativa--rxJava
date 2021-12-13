package ejemplosRxJava;

import io.reactivex.rxjava3.core.Observable;

public class UsoOperadorFlatMap {

    /*
     * FlatMap nos genera diferentes observables de los items que va entrando en su entrada
     * */

    public static void main(String[] args) {

        Integer[][] matrix = {{1, 15, 8, 80, 12, 8, 80, 13, 2, 1, 5, 8, 94, 8, 6, 4, 9, 10},
                {2, -3, -1, 14, 24, 14, 34, 44, 54, 2, 7, 8, 0, 2, 1, 5, 64, 48}};

        Observable.fromArray(matrix)
                .flatMap(linea -> Observable.fromArray(linea))// colocamos otro observable para q lea toda la matrix usando flatMap
                .filter(x -> x == 2)
                .distinct()
                .map(elelemtos -> "{" + elelemtos + "}")
                .subscribe(System.out::print);
    }
}

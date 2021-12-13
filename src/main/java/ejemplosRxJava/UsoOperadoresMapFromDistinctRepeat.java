package ejemplosRxJava;

import io.reactivex.rxjava3.core.Observable;

public class UsoOperadoresMapFromDistinctRepeat {
    /*
    * Utilizando fromArray y map convertir los números en string con formato [1]
    * */
    public static void main(String[] args) {
        Integer[] numeros =  {1, 15, 8, 80, 12,8,80,13, 2, 1, 5,8, 94,8, 6, 4, 9, 10};

        Observable.fromArray(numeros)
                  .filter(par -> par%2==0) //filtra solo los pares
                  .take(4) //para tomar solo 2 números pares
                  .distinct() //quita aquellos valores que están repetidos
                  .repeat(2) //repite 2 veces el valor que obtenido
                  .map(num -> "[" + num + "]")
                  .subscribe(System.out::print);


    }
}

package whiles;

import java.util.Random;
import java.util.stream.IntStream;

public class ExercicioIntStream {

    public static void main(String[] args) {

        //IntStream.of
        IntStream.of(10, 32, 60, 54, 15, 28, 01, 81, 76)
                .forEach(valor -> System.out.println(valor));

        //IntStream.range
        IntStream.range(01, 61).forEach(valor -> System.out.println("Número: " + valor));

        //random
        var runnable = new Random().ints(5, 1, 10);
//        runnable.ints(01,05);
        runnable.forEach(valor -> System.out.println(valor));


    }
}

package com.platzi.functional._15_streams_intro;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> numbersList=infiniteStream.limit(1000)
        /**con parallel las iteracciones se distribuyen por los nucleos que tenga la maquina 
         * recomendable para cuando sea procesamiento de cientos , millones de datos , 
         * si importa el orden de los datos lo mejor es no utilizar parallel
         * 
        */
                // .parallel()
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
                // .forEach(System.out::println);

                System.out.println(numbersList);
    }
}

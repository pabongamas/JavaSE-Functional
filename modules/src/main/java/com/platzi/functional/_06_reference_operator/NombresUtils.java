package com.platzi.functional._06_reference_operator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {
        List<String> profesores=getList("nicolas","juan","zulema");
        System.out.println(profesores);

        // Consumer<String> printer=text->System.out.println(text);
        // profesores.forEach(printer);

        /*impresion con operador de referencia , evita la redundancia del ejemplo de arriba  */
        profesores.forEach(System.out::println);
    }

    static <T>List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}

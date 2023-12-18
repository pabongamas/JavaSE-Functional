package com.platzi.functional._07_inference;

import java.util.List;
import java.util.function.Function;

import com.platzi.functional._06_reference_operator.NombresUtils;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer,String>funcionConvertidora=integer->"Al doble "+(integer*2);

        System.out.println(funcionConvertidora.apply(34));

        List<String> alumnos=NombresUtils.getList("hugo","paco","luis");
        /*
         * gracias a la inferencia de tipos en vez de ahacer esto 
         * alumnos.forEach((String name)->System.out.println(name));
         * hacemos esto , sin declararle el tipo
         */
        alumnos.forEach(name->System.out.println(name));
    }
}

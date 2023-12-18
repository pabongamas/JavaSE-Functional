package com.platzi.functional._11_composition;

import java.util.function.Function;

/**
 * MathOperations2
 */
public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer,Integer>multiplyby3=x->{
            System.out.println("Multiplicando x: "+x+" por 3");
            return x*3;
        };

        Function<Integer,Integer> add1MultiplyBy3=multiplyby3.compose(y->{
            System.out.println("le agregare 1 a :"+y);
            return y+1;
        });

        // funcion adicional despues de ejecutar add1MultiplyBy3
        Function<Integer,Integer> andSquare=add1MultiplyBy3.andThen(x->{
            System.out.println("estoy elevendo "+x+" al cuadrado");
            return x*x;
        });
        System.out.println(add1MultiplyBy3.apply(5));
        System.out.println(andSquare.apply(3));
    }

    
}
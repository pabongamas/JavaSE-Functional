package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        /*
        * Recibe un tipo y devuelve lo modificado de ese mismo tipo*/
        UnaryOperator<String> quote=text->"\""+text+"\"";
        UnaryOperator<String> addMark=text->text+"!";

        System.out.println(quote.apply("Hola estudiante !"));
        System.out.println(addMark.apply("Hola"));

        /*
        Rebibe dos tipos y retorna cierto tipo ,
        * */
        BiFunction<Integer,Integer,Integer> multiplicacion=(x,y)->x*y;

        /*BinaryOperator es similar ,solo que el detecta que todos los parametros enviados son del mismo tipo y van
        * a retornar del mismo tipo*/

        BinaryOperator<Integer> resta3Numbers=(x,y)->x-y;

        System.out.println(multiplicacion.apply(5,10));
        System.out.println(resta3Numbers.apply(70,30));


        /*Bifunction
        *
        * Esta toma Dos tipos de datos pueden ser differentes ,
        * en el ejemplo se envia un String y un integer , el cual el string es el texto a hacerle los espacios
        * a la izquierda , y el Segundo tipo el Integer va a ser la cantidad de veces que se va a hacer el espacio a
        * la derecha , este retorna un string , el mismo string pero con los espacios añadidos
        *
        * */
        BiFunction<String,Integer,String> leftpad=(text,number)->String.format("%" +number +"s",text);

        System.out.println(leftpad.apply("Java es el len",40));
    }
}

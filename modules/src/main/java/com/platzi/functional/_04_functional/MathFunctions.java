package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;


public class MathFunctions {
public static void main(String[] args) {
    /*
    * Esto son funciones en los cuales utilizando el paquete  Function con Function Intdicamos Una Entrada
    * y salida , En esta funcion square , defino que de entrada se va a ingresar un Integer y se va a retornar
    * un Integer , cuando se llame a la funcion se hace con el nombre de la funcion con el metodo apply
    * Estas funciones se pueden definir como el primer ejemplo con la funcion square o la otra es como la
    * funcion isOdd la cual se pasa un Entero y se devuelve un Boolean , esta funcion despues del nombre se declara
    * con -> la operacion que se va a realizar y cuando se vaya a  usar la funcion se evalua tambien aplicando el
    * apply
    * */
    Function<Integer,Integer> square=new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
            return x*x;
        }
    };
    Function<Integer,Boolean> isOdd=x->x%2==1;
    System.out.println(square.apply(8));
    System.out.println(isOdd.apply(1547));

    /**
     *Esta funcion es de tipo Predicado en la cual se evalua una sentencia , esta funcion se le indica el tipo de dato
     * que se va a ingresar a evaluar esta retorna un tipo boolean , osea si la sentencia a evaluar cumple o no
     * como en el ejemplo donde se define una operacion(funcion) que indica si el numero ingresado es par
     */

    Predicate<Integer> isEven=x->x%2==0;
    Boolean result =isEven.test(89);
    System.out.println(result);























}
}


package com.platzi.functional._08_lambda;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.platzi.functional._06_reference_operator.NombresUtils;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);
        usarPredicado(text -> text.isEmpty());

        usarBifunction((x, y) -> x + y);

        usarBifunction((x, y) -> {
            System.out.println("x: " + x + " ,Y:" + y);
            return x - y;
        });
        usarNada(() -> {
            System.out.println("hola alumno");
        });
    }

    /*
     * Si la lambda NO recibe argumentos: ( ) -> operación
     * 
     * Si la lambda recibe 1 argumento: _argumento -> operación ( argumento ) ->
     * operación_
     * 
     * Si la lambda recibe mas de 1 argumento: ( argumento1, argumento2) ->
     * operación
     * 
     * Si la lambda recibe varias operaciones: ( ) -> { operacion1; return
     * operación2; } argumento -> { operacion1; return operacion2; } ( argumento )
     * -> { operacion1; return operacion2; } ( argumento1, argumento2) -> {
     * operacion1; return operacion2 }
     * 
     * Si la lambda tiene mas de una operación debemos retornar un valor mediante.
     * return
     * 
     * Pero si NO devuelve nada, solo hay que indicar el tipo de entrada vacío.
     * 
     * ( ) -> { operación }
     * 
     * Para evitar errores es mejor usar ( ) -> { operación } para cualquier caso.
     */

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    static void usarPredicado(Predicate<String> predicado) {

    }

    static void usarBifunction(BiFunction<Integer, Integer, Integer> operacion) {

    }

    static void usarNada(OperarNada operarNada) {

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}

package com.platzi.functional._10_chaining;

public class ChainingExmple {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("hola ")
        .append("alumno ")
        .append("de ").append("platzi");

        System.out.println(stringBuilder);

        Chainer chainer =new Chainer();

        Chainer chainer2=chainer.sayHi();
        Chainer chainer3=chainer2.sayBye();
        chainer.sayHi().sayBye();

    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("hola");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }
    
}

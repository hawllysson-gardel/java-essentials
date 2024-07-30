package br.com.hawlab.final_keyword;

class SuperClass {
    public final void display() {}
}

class SubClass extends SuperClass {
    /*
    ERROR DE COMPILAÇÃO

    @Override
    public void display() {}
    */
}

final class FinalClass {}

class AnotherClass {}

/*
ERROR DE COMPILAÇÃO

class AnotherClass extends FinalClass {}
*/

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Final Keyword");

        final int x = 10;

        /*
        ERROR DE COMPILAÇÃO

        x = 20;
        */

        System.out.println("------------------------------------------");
    }
}

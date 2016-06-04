package com.jose;

public class Main {

    public static void main(String[] args) {
        try {
            executa();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void executa() {
        IAula aula = new Aula1();

        aula = aula.aulaNormal();
        System.out.println(aula);

        aula = aula.aulaProva();
        System.out.println(aula);
    }
}

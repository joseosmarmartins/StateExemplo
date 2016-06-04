package com.jose;

public class Aula2 implements IAula {

    @Override
    public IAula aulaNormal() {
        return Aulas.normal;
    }

    @Override
    public IAula aulaProva() {
        return Aulas.prova;
    }

    @Override
    public String toString() {
        return "IAula prova montada com sucesso!";
    }
}

package com.jose;

public class Aula1 implements IAula {

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
        return "IAula normal montada com sucesso!";
    }
}

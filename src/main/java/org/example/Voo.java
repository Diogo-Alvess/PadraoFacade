package org.example;

public class Voo extends Setor {

    private static Voo instancia = new Voo();

    private Voo() {}

    public static Voo getInstancia() {
        return instancia;
    }
}
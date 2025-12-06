package org.example;

public class Hotel extends Setor {

    private static Hotel instancia = new Hotel();

    private Hotel() {}

    public static Hotel getInstancia() {
        return instancia;
    }
}
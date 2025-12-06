package org.example;

public class Cliente {

    public boolean reservarPacote() {
        return AgenciaFacade.verificarDisponibilidade(this);
    }
}

package org.example;

public class AgenciaFacade {

    public static boolean verificarDisponibilidade(Cliente cliente) {

        if (!Hotel.getInstancia().verificarDisponibilidade(cliente)) {
            return false;
        }

        if (!Voo.getInstancia().verificarDisponibilidade(cliente)) {
            return false;
        }

        if (!Pagamento.getInstancia().verificarDisponibilidade(cliente)) {
            return false;
        }

        return true;
    }
}


package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Cliente> clientesIndisponiveis = new ArrayList<>();

    public void addClienteIndisponivel(Cliente cliente) {
        this.clientesIndisponiveis.add(cliente);
    }

    public boolean verificarDisponibilidade(Cliente cliente) {
        return !this.clientesIndisponiveis.contains(cliente);
    }
}


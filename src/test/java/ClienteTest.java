package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarIndisponibilidadeHotel() {
        Cliente c = new Cliente();
        Hotel.getInstancia().addClienteIndisponivel(c);

        assertFalse(c.reservarPacote());
    }

    @Test
    void deveRetornarIndisponibilidadeVoo() {
        Cliente c = new Cliente();
        Voo.getInstancia().addClienteIndisponivel(c);

        assertFalse(c.reservarPacote());
    }

    @Test
    void deveRetornarIndisponibilidadePagamento() {
        Cliente c = new Cliente();
        Pagamento.getInstancia().addClienteIndisponivel(c);

        assertFalse(c.reservarPacote());
    }

    @Test
    void deveConfirmarPacoteSemPendencias() {
        Cliente c = new Cliente();

        assertTrue(c.reservarPacote());
    }
}
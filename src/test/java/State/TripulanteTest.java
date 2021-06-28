package State;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TripulanteTest extends TestCase{

    Tripulante tripulante;

    @BeforeEach
    public void setUp() {
        tripulante = new Tripulante();
    }

    //Disponivel
    @Test
    public void FalhaEmDisponibilizarDisponibilizado() {
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        assertEquals("O processo falhou", tripulante.disponibilizar());
    }

    @Test
    public void DesligaDisponibilizado() {
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        assertEquals("Tripulante desligado", tripulante.desligar());
    }

    @Test
    public void DecolarDisponibilizado() {
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        assertEquals("Tripulante em voo", tripulante.decolar());
    }

    @Test
    public void aterrissaDisponibilizado() {
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        assertEquals("O Processo falhou", tripulante.aterrissar());
    }

    @Test
    public void InativaDisponibilizado() {
        tripulante.setEstado(TripulanteEstadoDisponivel.getInstance());
        assertEquals("Tripulante inativado", tripulante.inativar());
    }

    //Desligado
    @Test
    public void FalhaEmDisponibilizarDesligado() {
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        assertEquals("O Processo falhou", tripulante.disponibilizar());
    }

    @Test
    public void FalhaEmDesligarDesligado() {
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        assertEquals("O Processo falhou", tripulante.desligar());
    }

    @Test
    public void FalhaEmDecolarDesligado() {
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        assertEquals("O Processo falhou", tripulante.decolar());
    }

    @Test
    public void FalhaEmAterrissarDesligado() {
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        assertEquals("O Processo falhou", tripulante.aterrissar());
    }

    @Test
    public void FalhaEmInativarDesligado() {
        tripulante.setEstado(TripulanteEstadoDesligado.getInstance());
        assertEquals("O Processo falhou", tripulante.inativar());
    }

    //Em Voo
    @Test
    public void DisponibilizaDecolado() {
        tripulante.setEstado(TripulanteEstadoEmVoo.getInstance());
        assertEquals("Tripulante Disponibilizado", tripulante.disponibilizar());
    }

    @Test
    public void FalhaEmDesligarDecolado() {
        tripulante.setEstado(TripulanteEstadoEmVoo.getInstance());
        assertEquals("O Processo falhou", tripulante.desligar());
    }

    @Test
    public void FalhaEmDecolarDecolado() {
        tripulante.setEstado(TripulanteEstadoEmVoo.getInstance());
        assertEquals("O Processo falhou", tripulante.decolar());
    }

    @Test
    public void AterrissaDecolado() {
        tripulante.setEstado(TripulanteEstadoEmVoo.getInstance());
        assertEquals("Tripulante aterrisado", tripulante.aterrissar());
    }

    @Test
    public void FalhaEmInativarDecolado() {
        tripulante.setEstado(TripulanteEstadoEmVoo.getInstance());
        assertEquals("O Processo falhou", tripulante.inativar());
    }

    //Aterrissado
    @Test
    public void FalhaEmDisponibilizarAterrissado() {
        tripulante.setEstado(TripulanteEstadoExterior.getInstance());
        assertEquals("O Processo falhou", tripulante.disponibilizar());
    }

    @Test
    public void DesligaAterrissado() {
        tripulante.setEstado(TripulanteEstadoExterior.getInstance());
        assertEquals("Tripulante desligado", tripulante.desligar());
    }

    @Test
    public void DecolaAterrissado() {
        tripulante.setEstado(TripulanteEstadoExterior.getInstance());
        assertEquals("Tripulante em voo", tripulante.decolar());
    }

    @Test
    public void FalhaEmAterrissarAterrissado() {
        tripulante.setEstado(TripulanteEstadoExterior.getInstance());
        assertEquals("O Processo falhou", tripulante.aterrissar());
    }

    @Test
    public void FalhaEmInativatAterrissado() {
        tripulante.setEstado(TripulanteEstadoExterior.getInstance());
        assertEquals("O Processo falhou", tripulante.inativar());
    }

    //Inativo
    @Test
    public void DisponibilizaInativo() {
        tripulante.setEstado(TripulanteEstadoInativo.getInstance());
        assertEquals("Tripulante Disponibilizado", tripulante.disponibilizar());
    }

    @Test
    public void DesligaInativo() {
        tripulante.setEstado(TripulanteEstadoInativo.getInstance());
        assertEquals("Tripulante desligado", tripulante.desligar());
    }

    @Test
    public void FalhaEmDecolarInativo() {
        tripulante.setEstado(TripulanteEstadoInativo.getInstance());
        assertEquals("O Processo falhou", tripulante.decolar());
    }

    @Test
    public void FalhaEmAterrissarInativo() {
        tripulante.setEstado(TripulanteEstadoInativo.getInstance());
        assertEquals("O Processo falhou", tripulante.aterrissar());
    }

    @Test
    public void FalhaEmInativarInativo() {
        tripulante.setEstado(TripulanteEstadoInativo.getInstance());
        assertEquals("O Processo falhou", tripulante.inativar());
    }

}

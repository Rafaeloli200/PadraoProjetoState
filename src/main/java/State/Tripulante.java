/*
Tripulantes são colaboradores como os pilotos, copilotos e aeromoças, que estão constantemente viajando
 */
package State;

public class Tripulante {

    private String nome;
    private EstadoDoTripulante estado; 

       public Tripulante() {
        this.estado = TripulanteEstadoDisponivel.getInstance();
    }
    
    public void setEstado(EstadoDoTripulante estado) {
        this.estado = estado;
    }

    public EstadoDoTripulante getEstado() {
        return estado;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
     public String disponibilizar() {
        return estado.disponibilizar(this);
    }
    
    public String desligar() {
        return estado.desligar(this);
    }
    
    public String decolar() {
        return estado.decolar(this);
    }
    
    public String aterrissar() {
        return estado.aterrissar(this);
    }
    
    public String inativar() {
        return estado.inativar(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }
    
}

package transporte;

import modelo.Pacote;
import modelo.Localizacao;

public class TransporteDrone implements Transporte {

    @Override
    public boolean estaDisponivel(Pacote pacote, Localizacao localizacao) {
        return localizacao.ehMetropolitana() && pacote.getPeso() <= 5; // Apenas áreas metropolitanas e pequenos pacotes
    }

    @Override
    public void entregar(Pacote pacote, Localizacao localizacao) {
        System.out.println("Entregando por drone: " + pacote.getDescricao() + " para " + localizacao.getEndereco());
    }
}

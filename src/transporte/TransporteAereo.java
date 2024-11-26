package transporte;

import modelo.Pacote;
import modelo.Localizacao;

public class TransporteAereo implements Transporte {

    @Override
    public boolean estaDisponivel(Pacote pacote, Localizacao localizacao) {
        return pacote.getPeso() <= 100 && !pacote.excedeDimensoes(50, 50, 50); // Regras de peso e dimensões
    }

    @Override
    public void entregar(Pacote pacote, Localizacao localizacao) {
        System.out.println("Entregando por transporte aéreo: " + pacote.getDescricao() + " para " + localizacao.getEndereco());
    }
}

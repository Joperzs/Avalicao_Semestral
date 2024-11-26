package transporte;

import modelo.Pacote;
import modelo.Localizacao;

public class TransporteTerrestre implements Transporte {

    @Override
    public boolean estaDisponivel(Pacote pacote, Localizacao localizacao) {
        return !localizacao.ehInternacional();
    }

    @Override
    public void entregar(Pacote pacote, Localizacao localizacao) {
        System.out.println("Entregando por transporte terrestre: " + pacote.getDescricao() + " para " + localizacao.getEndereco());
    }
}

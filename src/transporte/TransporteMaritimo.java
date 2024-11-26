package transporte;

import modelo.Pacote;
import modelo.Localizacao;

public class TransporteMaritimo implements Transporte {

    @Override
    public boolean estaDisponivel(Pacote pacote, Localizacao localizacao) {
        return localizacao.ehInternacional(); // Apenas para locais internacionais
    }

    @Override
    public void entregar(Pacote pacote, Localizacao localizacao) {
        System.out.println("Entregando por transporte marítimo: " + pacote.getDescricao() + " para " + localizacao.getEndereco());
    }
}

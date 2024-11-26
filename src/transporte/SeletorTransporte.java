package transporte;

import modelo.Pacote;
import modelo.Localizacao;
import java.util.List;


public class SeletorTransporte {
    private final List<Transporte> transportes;

    public SeletorTransporte(List<Transporte> transportes) {
        this.transportes = transportes;
    }

    public Transporte selecionarTransporte(Pacote pacote, Localizacao localizacao) {
        for (Transporte transporte : transportes) {
            if (transporte.estaDisponivel(pacote, localizacao)) {
                return transporte;
            }
        }
        throw new RuntimeException("Nenhum transporte disponível para o pacote e localização especificados.");
    }
}

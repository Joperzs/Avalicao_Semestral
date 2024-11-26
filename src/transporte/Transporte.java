package transporte;

import modelo.Pacote;
import modelo.Localizacao;

public interface Transporte {
    boolean estaDisponivel(Pacote pacote, Localizacao localizacao);
    void entregar(Pacote pacote, Localizacao localizacao);
}
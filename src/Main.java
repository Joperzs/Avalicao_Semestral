import transporte.*;
import modelo.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Transporte terrestre = new TransporteTerrestre();
        Transporte aereo = new TransporteAereo();
        Transporte maritimo = new TransporteMaritimo();
        Transporte drone = new TransporteDrone();

        SeletorTransporte seletor = new SeletorTransporte(Arrays.asList(terrestre, aereo, maritimo, drone));

        Pacote pacote1 = new Pacote("Caixa Pequena", 3, 20, 20, 20);
        Localizacao local1 = new Localizacao("Rua A, Cidade B", false, true);

        Pacote pacote2 = new Pacote("Caixa Grande", 150, 100, 100, 100);
        Localizacao local2 = new Localizacao("Av. C, País D", true, false);

        try {
            Transporte transporte1 = seletor.selecionarTransporte(pacote1, local1);
            transporte1.entregar(pacote1, local1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Transporte transporte2 = seletor.selecionarTransporte(pacote2, local2);
            transporte2.entregar(pacote2, local2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

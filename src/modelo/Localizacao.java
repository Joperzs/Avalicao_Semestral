package modelo;
public class Localizacao {
    private final String endereco;
    private final boolean ehInternacional;
    private final boolean ehMetropolitana;

    public Localizacao(String endereco, boolean ehInternacional, boolean ehMetropolitana) {
        this.endereco = endereco;
        this.ehInternacional = ehInternacional;
        this.ehMetropolitana = ehMetropolitana;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean ehInternacional() {
        return ehInternacional;
    }

    public boolean ehMetropolitana() {
        return ehMetropolitana;
    }
}

package modelo;
public class Pacote {
    private final String descricao;
    private final double peso;
    private final double comprimento;
    private final double largura;
    private final double altura;

    public Pacote(String descricao, double peso, double comprimento, double largura, double altura) {
        this.descricao = descricao;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public boolean excedeDimensoes(double maxComprimento, double maxLargura, double maxAltura) {
        return comprimento > maxComprimento || largura > maxLargura || altura > maxAltura;
    }
}

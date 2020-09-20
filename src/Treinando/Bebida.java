package Treinando;

public class Bebida {


    final String nome;
    final int ml;
    final double preco;
    final boolean temAlcool;

    @Override
    public String toString() {
        return "Bebida{" +
                "nome='" + nome + '\'' +
                ", ml=" + ml +
                ", preco=" + preco +
                '}';
    }

    public Bebida(String nome, int ml, double preco, boolean temAlcool) {
        this.nome = nome;
        this.ml = ml;
        this.preco = preco;
        this.temAlcool = temAlcool;
    }
}

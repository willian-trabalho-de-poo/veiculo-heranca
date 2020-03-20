public class Veiculo {
    private double preco;
    private int ano;

    public double getPreco() {
        return this.preco;
    }

    public int getAno() {
        return this.ano;
    }

    public Veiculo setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public Veiculo setAno(int ano) {
        this.ano = ano;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "Preco: R$ %.2f\n" +
            "Ano: %d\n",
            this.getPreco(),
            this.getAno()
        );
    }
}

public class Navio extends Veiculo {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public Navio setNome(final String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "%s" +
            "Nome: %s\n",
            super.toString(),
            this.getNome()
        );
    }
}

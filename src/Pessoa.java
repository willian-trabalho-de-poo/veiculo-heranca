public class Pessoa {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public Pessoa setNome(final String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s\n",
            this.getNome()
        );
    }
}

public class Aviao extends Veiculo {
    private String prefixo;

    public String getPrefixo() {
        return this.prefixo;
    }

    public Aviao setPrefixo(final String prefixo) {
        this.prefixo = prefixo;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "%s" +
            "Prefixo: %s\n",
            super.toString(),
            this.getPrefixo()
        );
    }
}

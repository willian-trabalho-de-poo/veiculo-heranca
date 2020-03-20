public class Onibus extends Veiculo {
    private int assentos;

    public int getAssentos() {
        return this.assentos;
    }

    public Onibus setAssentos(int assentos) {
        this.assentos = assentos;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "%s" +
            "Assentos: %d\n",
            super.toString(),
            this.getAssentos()
        );
    }
}

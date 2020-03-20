public class Piloto extends Pessoa {
    private long breve;

    public long getBreve() {
        return this.breve;
    }

    public Piloto setBreve(long breve) {
        this.breve = breve;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "%s" +
            "Breve: %d\n",
            super.toString(),
            this.getBreve()
        );
    }
}

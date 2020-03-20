public class Motorista extends Pessoa {
    private long cnh;

    public long getCnh() {
        return this.cnh;
    }

    public Motorista setCnh(long cnh) {
        this.cnh = cnh;
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "%s" +
            "CNH: %d\n",
            super.toString(),
            this.getCnh()
        );
    }
}

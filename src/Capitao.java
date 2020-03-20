public class Capitao extends Pessoa {
    private long arrais;

    public long getArrais() {
        return this.arrais;
    }

    public Capitao setArrais(long arrais) {
        this.arrais = arrais;
        return this;
    }
    
    @Override
    public String toString() {
        return String.format(
            "%s" +
            "Arrais: %d\n",
            super.toString(),
            this.getArrais()
        );
    }
}

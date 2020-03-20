public class Principal {
    public static void main(String[] args) {
        final Entrada in = new Entrada();
        final Aviao aviao = in.leiaAviao("\nAviao\n");
        final Onibus onibus = in.leiaOnibus("\nOnibus\n");
        final Navio navio = in.leiaNavio("\nNavio\n");
        System.out.printf(
            "\n----------------------------\n" +
            "Dados" +
            "\n----------------------------\n" +
            "\nAviao\n" +
            "%s" +
            "----------------------------\n" +
            "\nOnibus\n" +
            "%s" +
            "----------------------------\n" +
            "\nNavio\n" +
            "%s" +
            "----------------------------\n",
            aviao,
            onibus,
            navio
        );
        System.exit(0);
    }
}

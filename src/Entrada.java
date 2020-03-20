import java.util.Scanner;

public class Entrada {
    private final Scanner in = new Scanner(System.in);
    private Scanner inString;

    public Aviao leiaAviao(final String prompt) {
        System.out.print(prompt);
        final Aviao aviao = new Aviao();
        aviao
            .setPreco(this.leiaDouble("Preco: "))
            .setAno(this.leiaInt("Ano: "));
        return aviao.setPrefixo(this.leiaString("Prefixo: "));
    }

    public Onibus leiaOnibus(final String prompt) {
        System.out.print(prompt);
        final Onibus onibus = new Onibus();
        onibus
            .setPreco(this.leiaDouble("Preco: "))
            .setAno(this.leiaInt("Ano: "));
        return onibus.setAssentos(this.leiaInt("Assentos: "));
    }

    public Navio leiaNavio(final String prompt) {
        System.out.print(prompt);
        final Navio navio = new Navio();
        navio
            .setPreco(this.leiaDouble("Preco: "))
            .setAno(this.leiaInt("Ano: "));
        return navio.setNome(this.leiaString("Nome: "));
    }

    public String leiaString(final String prompt) {
        System.out.print(prompt);
        this.inString = new Scanner(System.in);
        return this.inString.nextLine();
    }

    public int leiaInt(final String prompt) {
        System.out.print(prompt);
        return this.in.nextInt();
    }

    public double leiaDouble(final String prompt) {
        System.out.print(prompt);
        return this.in.nextDouble();
    }
}

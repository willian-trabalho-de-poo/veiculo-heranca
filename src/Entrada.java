import java.util.Scanner;

public class Entrada {
    private final Scanner in = new Scanner(System.in);
    private Scanner inString;

    public Piloto leiaPiloto(final String prompt) {
        System.out.print(prompt);
        final Piloto piloto = new Piloto();
        piloto.setNome(this.leiaString("Nome: "));
        return piloto.setBreve(this.leiaLong("Breve: "));
    }

    public Motorista leiaMotorista(final String prompt) {
        System.out.print(prompt);
        final Motorista motorista = new Motorista();
        motorista.setNome(this.leiaString("Nome: "));
        return motorista.setCnh(this.leiaLong("CNH: "));
    }

    public Capitao leiaCapitao(final String prompt) {
        System.out.print(prompt);
        final Capitao capitao = new Capitao();
        capitao.setNome(this.leiaString("Nome: "));
        return capitao.setArrais(this.leiaLong("Arrais: "));
    }

    public String leiaString(final String prompt) {
        System.out.print(prompt);
        this.inString = new Scanner(System.in);
        return this.inString.nextLine();
    }
    
    public long leiaLong(final String prompt) {
        System.out.print(prompt);
        return this.in.nextLong();
    }
}

import java.util.Scanner;

public class atvd2 {

    public static void main() {
        AdicionarContato();
    }

    private String nome;
    private String numeroTelefone;

    public static void AdicionarContato() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nInforme o nome do contato: ");
        setNome(sc.next());
        System.out.printf("\nInforme o numero do contato: ");
        setNumeroTelefone(sc.next());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

}

import java.util.Scanner;

public class atvd4 {

  public class Livro {
    private String nome;
    private String codigo;

    public void DadosLivro() {
      System.out.println("Digite o nome do livro: ");
      setNome(sc.next());
      System.out.println("Digite o codigo do livro: ");
      setCodigo(sc.next());
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getCodigo() {
      return codigo;
    }

    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }

    public class Pessoa {
      Scanner sc = new Scanner(System.in);

      private String nome;
      private String numeroTelefone;
      private String Cpf;

      public void ColetarDados() {
        System.out.println("Digite o nome: ");
        setNome(sc.next());
        System.out.println("Digite o numero de telefone: ");
        setNumeroTelefone(sc.next());
        System.out.println("Digite o CPF: ");
        setCpf(sc.next());
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

      public String getCpf() {
        return Cpf;
      }

      public void setCpf(String cpf) {
        Cpf = cpf;
      }

    }

    public class Emprestimo {

      Pessoa cliente = new Pessoa();
      Livro livro = new Livro();

      public void RealizarEmprestimo(int dias) {
        cliente.ColetarDados();
        livro.DadosLivro();
        double aux = 2.5 * dias;
        ExibirDadosEmprestimo(aux);

      }

      private void ExibirDadosEmprestimo(double valor) {
        System.out.printf("Dados do emprestimo: \nNome: %s\nNumero: %s\nCPF: %s\nLivro: %s\nCodigo: %s\n",
            cliente.getNome(),
            cliente.getNumeroTelefone(), cliente.getCpf(), livro.getNome(), livro.getCodigo());
        System.out.println("Valor: " + valor);

      }

    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite quantos dias o cliente ficara com o livro: ");
    int dias = sc.nextInt();

    Emprestimo emprestimo = new Emprestimo();

    emprestimo.RealizarEmprestimo(dias);

  }
}

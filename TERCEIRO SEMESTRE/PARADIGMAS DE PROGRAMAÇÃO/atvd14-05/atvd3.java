public class atvd3 {
  public static void main(String args[]) {
    final Funcionario f1 = new Funcionario();

    f1.nome = "Luciano";
    f1.sexo = "Masculino";
    f1.idade = 23;

    f1.pergunta();
    f1.resposta();

    final Cliente c1 = new Cliente();

    c1.nome = "Antonio";
    c1.sexo = "Masculino";
    c1.idade = 28;

    c1.pergunta();
    c1.resposta();
  }
}

abstract class Pessoa {
  public String nome;
  public int idade;
  public String sexo;

  abstract public void pergunta();

  public void resposta() {
    System.out.printf("Tenho %d anos e sou do sexo %s\n", this.idade, this.sexo);
  };
}

class Funcionario extends Pessoa {

  @Override
  public void pergunta() {
    System.out.println("Olá, eu sou um funcionário e meu nome é " + this.nome);
  }
}

class Cliente extends Pessoa {

  @Override
  public void pergunta() {
    System.out.printf("Olá,meu nome é %d, preciso de ajuda" + this.nome);
  }

}
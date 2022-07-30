public class Parametros2 {
  public static void main(String args[]) {
    final Colaborador novoColaborador = new Colaborador();
    String nomeCompleto;
    float salarioReceber;

    novoColaborador.nome = "Luis";
    novoColaborador.sobrenome = "Silva";
    novoColaborador.horasTrabalhadas = 10;
    novoColaborador.valorPorHora = (float) 25.50;

    nomeCompleto = novoColaborador.nomeCompleto();
    System.out.println(nomeCompleto);

    salarioReceber = novoColaborador.calcularSalario();
    System.out.println(salarioReceber);

    novoColaborador.incrementarHoras(8);
    salarioReceber = novoColaborador.calcularSalario();
    System.out.println(salarioReceber);
  }
}

class Colaborador {
  public String nome;
  public String sobrenome;
  public int horasTrabalhadas;
  public float valorPorHora;

  String nomeCompleto() {
    return nome + " " + sobrenome;
  }

  float calcularSalario() {
    return horasTrabalhadas * valorPorHora;
  }

  void incrementarHoras(int horas) {
    horasTrabalhadas += horas;
  }
}
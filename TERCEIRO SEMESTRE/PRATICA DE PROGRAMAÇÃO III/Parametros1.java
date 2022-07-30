public class Parametros1 {
  public static void main(String args[]) {
    final ContaCorrente conta = new ContaCorrente();
    boolean saqueConcluido;

    conta.definirSaldoInicial(2500);
    conta.mostarSaldo();

    saqueConcluido = conta.sacar(350);

    if (!saqueConcluido) {
      mostrarSaldoInsuficiente();
    }

    conta.mostarSaldo();
    conta.depositar(400);
    conta.mostarSaldo();

    saqueConcluido = conta.sacar(400);

    if (!saqueConcluido) {
      mostrarSaldoInsuficiente();
    }

    conta.mostarSaldo();
  }

  static void mostrarSaldoInsuficiente() {
    System.out.println("Saldo insuficiente.");
  }
}

class ContaCorrente {
  private float saldo;

  void definirSaldoInicial(float saldoInicial) {
    saldo = saldoInicial;
  }

  void depositar(float valor) {
    saldo += valor;
  }

  boolean sacar(float valor) {
    if (saldo < valor) {
      return false;
    }
    saldo -= valor;
    return true;
  }

  void mostarSaldo() {
    System.out.printf("Seu saldo atual : R$ %.2f\n", saldo);
  }
}

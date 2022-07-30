public class atvd2 {
  public static void main(String args[]) {
    final Supermercado supermercado = new Supermercado();

    supermercado.setQuantidade(3);
    supermercado.realizarVenda();
  }
}

abstract class Produto {
  private String nome;
  private int estoque;
  private float preco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public int getEstoque() {
    return estoque;
  }

  public void setEstoque(int estoque) {
    this.estoque = estoque;
  }
}

class Venda extends Produto {
  private int quantidade;

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public void realizarVenda() {
    System.out.println("Nome: ".concat(getNome()));
    System.out.println("Quantidade: " + quantidade);
    System.out.println("Preço: " + getPreco());
    System.out.println("Total: " + getPreco() * quantidade);

    setEstoque(getEstoque() - quantidade);
  }
}

final class Supermercado extends Venda {

  public Supermercado() {

    setNome("Arroz");
    setPreco((float) 20.99);
    setEstoque(40);
  }
}
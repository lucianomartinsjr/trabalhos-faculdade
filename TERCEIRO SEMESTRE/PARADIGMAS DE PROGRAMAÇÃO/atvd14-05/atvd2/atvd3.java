import java.util.Scanner;
import java.util.ArrayList;

public class atvd3 {

  static ArrayList<String> notaFiscal = new ArrayList();
  static ArrayList<String> notaFiscalpreco = new ArrayList();

  public class Produto extends Supermercado {
    int quantidade;
    String nome;
    double preco;
    String precoString;

    void vender() {
      quantidade--;
    }

  }

  public class Supermercado {
    Scanner sc = new Scanner(System.in);
  }

  public class Venda extends Supermercado {
    double valor;
    int quantProduto;

    void adicionarProduto() {
      quantProduto++;
    }

    void removerProduto() {
      quantProduto--;
    }

    void exibirVenda() {

      System.out.printf("\nQuantidade de produtos vendidos: %d\nValor total da venda: R$ %2.2f", quantProduto, valor);

    }

    void selecionar(double valor) {
      System.out.printf("\nSelecione a forma de pagamento: \n1. Cartão\n2. Dinheiro\n");
      int aux = sc.nextInt();

      switch (aux) {
        case 1:
          double valorComTaxa = valor * 1.0148;
          System.out.printf("Cartão selecionado. Taxa adicionada a compra. Valor final: %2.2f", valorComTaxa);
          break;
        case 2:
          System.out.println("Dinheiro selecionado. Valor final: " + valor);
          break;
        default:
          System.out.println("Codigo inexistente.");
          break;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Produto arroz = new Produto();
    arroz.quantidade = 10;
    arroz.nome = "Arroz";
    arroz.preco = 20.75;
    arroz.precoString = Double.toString(arroz.preco);

    Produto oleo = new Produto();
    oleo.quantidade = 15;
    oleo.nome = "Oleo";
    oleo.preco = 8.50;
    oleo.precoString = Double.toString(oleo.preco);

    Produto macarrao = new Produto();
    macarrao.quantidade = 20;
    macarrao.nome = "Macarrão";
    macarrao.preco = 3.5;
    macarrao.precoString = Double.toString(macarrao.preco);

    Produto feijao = new Produto();
    feijao.quantidade = 15;
    feijao.nome = "Feijão";
    feijao.preco = 10.25;
    feijao.precoString = Double.toString(feijao.preco);

    Venda compra = new Venda();
    compra.valor = 0;
    compra.quantProduto = 0;

    int aux = 0;

    while (aux != 999) {

      System.out.printf(
          "\nSelecione o produto a ser adicionado: \n1. Arroz\n2. oleo\n3. Macarrao\n4. feijao\n999. finalizar compra\n");
      aux = sc.nextInt();

      switch (aux) {
        case (1):
          arroz.vender();
          compra.valor = compra.valor + arroz.preco;
          compra.adicionarProduto();
          notaFiscal.add(arroz.nome);
          notaFiscalpreco.add(arroz.precoString);
          break;
        case (2):
          oleo.vender();
          compra.valor = compra.valor + oleo.preco;
          compra.adicionarProduto();
          notaFiscal.add(oleo.nome);
          notaFiscalpreco.add(oleo.precoString);
          break;

        case (3):
          macarrao.vender();
          compra.valor = compra.valor + macarrao.preco;
          compra.adicionarProduto();
          notaFiscal.add(macarrao.nome);
          notaFiscalpreco.add(macarrao.precoString);
          break;

        case (4):
          feijao.vender();
          compra.valor = compra.valor + feijao.preco;
          compra.adicionarProduto();
          notaFiscal.add(feijao.nome);
          notaFiscalpreco.add(feijao.precoString);
          break;

        case (999):
          System.out.println("Compra finalizada.");
          break;

        default:
          System.out.println("Código inexistente");
          break;
      }
    }

    for (int i = 0; i < compra.quantProduto; i++) {
      System.out.printf("\n %s %s ", notaFiscal.get(i), notaFiscalpreco.get(i));
    }
    compra.exibirVenda();
    compra.selecionar(compra.valor);
  }
}

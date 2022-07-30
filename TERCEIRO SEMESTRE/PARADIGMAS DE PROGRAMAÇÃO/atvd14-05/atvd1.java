public class atvd1 {
  public static void main(String args[]) {
    final Cachorro c = new Cachorro();

    c.especie = "Canino";
    c.movimentacao = "Terrestre";
    c.caracteristicas = "Morder";

    c.falar();
    c.comer();

    final Gato g = new Gato();

    g.especie = "Felino";
    g.movimentacao = "Terrestre";
    g.caracteristicas = "Pular";

    g.falar();
    g.comer();
  }
}

abstract class Animal {
  public String especie;
  public String movimentacao;
  public String caracteristicas;

  public void falar() {
    System.out.println("Som animal");
  };

  public void comer() {
    System.out.println("Alimento pro animal");
  };
}

class Cachorro extends Animal {

  @Override
  public void falar() {
    System.out.println("Au-au");
  }
}

class Gato extends Animal {

  @Override
  public void falar() {
    System.out.println("Miau");
  }
}
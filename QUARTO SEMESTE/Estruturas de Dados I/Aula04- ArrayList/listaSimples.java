import java.util.*;
public class listaSimples {
    public static void main(String[] args) {
        String aula1 = "Modelando a classe";
        String aula2 = "Listas simplesmente encadeadas";
        String aula3 = "Estruturas de dados 1";

        ArrayList<String> aulas = new ArrayList();

        //adicionar elementos.
        aulas.add(aula1);
        aulas.add("Adicionando diretamente pelo arraylist");
        aulas.add(aula2);
        aulas.add("Adicionando diretamente pela segunda vez");
        aulas.add(aula3);

        Collections.sort(aulas);

        //imprimir especifico
        System.out.println(aulas.get(0));

        System.out.println(aulas);

        //remover elementos.

        aulas.remove(0);

        
    } 
}

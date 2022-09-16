// 1-Escreva um programa em Java que crie um ArrayList adicione algumas cores (string) e as imprima na tela.
// a)percorra todos os elementos do ArrayList;
// b)adicione um elemento na primeira posição da lista;
// c)remova o terceiro elemento da lista;
// d)ordene o ArrayList pelo nome;
// e)imprima o ArrayList;

import java.util.*;
public class atvd1 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList();

        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Laranja");
        cores.add("Rosa");
        cores.add("Roxo");

        for (int i = 0; i< cores.size() ; i++){
            System.out.println(cores.get(i));
        }

        cores.add(0,"Preto");
        cores.remove(2);

        Collections.sort(cores);

        System.out.println(cores);
        
    }
}

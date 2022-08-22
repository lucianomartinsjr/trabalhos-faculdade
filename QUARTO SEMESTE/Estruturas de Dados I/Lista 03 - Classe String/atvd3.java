// 3- Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de caracteres total e o número de palavras
//  (palavra é definida por qualquer sequência de caracteres delimitada por espaços em branco) e exiba o resultado.
import javax.swing.JOptionPane;
public class atvd3 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Digite seu texto : ");

        System.out.println("Numero de caracteres digitados: "+texto.replace(" ", "").length());
        System.out.println("Numero de palavras informadas: "+qtndPalavas(texto));

    }

    public static int qtndPalavas(String texto){
        int qntdPalavras = 0;
        for (String partes: texto.split(" ")) {
           qntdPalavras ++;
        }
        return qntdPalavras;
    }
}

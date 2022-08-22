// 4- Escreva um método retiraVogais que receba uma string como parâmetro
// e remova todas as vogais (maiúsculas e minúsculas) dessa string, imprimindo a string modificada como resultado.
import javax.swing.JOptionPane;
public class atvd4 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Digite seu texto : ");

        System.out.println("Seu texto sem as vogais: "+retiraVogais(texto));

    }

    public static String retiraVogais(String texto){
        String novoTexto = texto.trim().replaceAll("[AEOIOUaeiou]", "");
        return novoTexto;
    }
}

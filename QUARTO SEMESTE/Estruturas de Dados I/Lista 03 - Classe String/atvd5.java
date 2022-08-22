// 5- Faça um programa em que o usuário digite uma palavra e o  programa diga quantas letras ‘ A ’ ela possui.
import javax.swing.JOptionPane;
public class atvd5 {
    public static void main(String[] args) {
    String texto = JOptionPane.showInputDialog(null, "Digite seu texto : ");

    System.out.printf("A quantidade de letra 'a' no texto informado : %d",contaCaracteresA(texto));

    }

    public static int contaCaracteresA(String texto) {
        int qntdLetras= 0;

        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
        if(letra == 'a'|| letra == 'A' )
        qntdLetras++;
        }

        return qntdLetras;    
    }
}

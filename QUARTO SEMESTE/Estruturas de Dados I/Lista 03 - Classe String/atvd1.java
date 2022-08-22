// 1 -  Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
// a) O número de caracteres da string.
// b) A string com todas suas letras em maiúsculo.
// c) O número de vogais da string.
// d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
// e) Se a string digitada termina com “ADO” (ignorando maiúsculas/minúsculas).
// f) O número de dígitos (0 a 9) da string.
// g) Se a string é um palíndromo ou não.(Palíndromo palavra que de trás pra frente forma a mesma palavra EX: ana, ovo...)
import javax.swing.JOptionPane;
class atvd1{
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Digite uma frase: ");

    
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("a) "+texto.trim().length()+" Caracteres");
        System.out.println("b) "+texto.trim().toUpperCase());
        System.out.println("c) "+verificaQntdVogais(texto));
        System.out.println("d) "+texto.toLowerCase().startsWith("uni"));
        System.out.println("e) "+texto.toLowerCase().endsWith("ado"));
        System.out.println("f) "+verificaQntdNumeros(texto));
        System.out.println("g) "+verificaPalindromo(texto));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    }


    public static int verificaQntdVogais(String texto){
        int qntdVogais=0;
        texto = texto.toLowerCase();
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
        qntdVogais++;
        }
        return qntdVogais;
    }

    public static int verificaQntdNumeros(String texto){
        int qntdNumeros= 0;

        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
        if(letra == '0'|| letra == '1' || letra == '2' || letra == '3' || letra == '4'|| letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9')
        qntdNumeros++;
        }

        return qntdNumeros;
    }

    public static boolean verificaPalindromo(String texto){
        String reverso ="";
        for(int i = (texto.length()-1); i >= 0; i--){
             reverso += texto.charAt(i);
        }

        if(texto.equals(reverso) == true)
        return true;
        else
        return false;      
    }


}
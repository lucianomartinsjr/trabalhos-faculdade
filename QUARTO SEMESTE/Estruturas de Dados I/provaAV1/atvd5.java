package provaAV1;
import java.util.Scanner;

public class atvd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print( "Digite seu texto : ");
        String texto = sc.nextLine();

        System.out.println("\na) Quantidade de espacos em branco: "+qntdEspacos(texto));
        System.out.println("b) Quantidade de vezes que aparecem as vogais: "+verificaQntdVogais(texto));
        System.out.println("c) Numero de letras: "+qntdLetras(texto));
        System.out.println("d) Numero de caracteres digitados: "+texto.replace(" ", "").length());
    }

    public static int qntdEspacos(String texto){
        int qntdEspacos = 0;
        for (int i = 0; i < texto.length(); i++) {
           if(texto.charAt(i) == ' ') 
           qntdEspacos++;
        }
        return qntdEspacos++;
    }

    public static int qntdLetras(String texto){
        int qntdLetras = 0;
        for (int i = 0; i < texto.length(); i++) {
            if((texto.charAt(i) >= 'a' && texto.charAt(i)  <= 'z') || (texto.charAt(i)  >= 'A' && texto.charAt(i)  <= 'Z')) 
            qntdLetras++;
        }
        
        return qntdLetras;
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

}

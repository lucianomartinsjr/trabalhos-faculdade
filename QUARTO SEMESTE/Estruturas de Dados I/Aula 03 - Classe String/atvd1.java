// Crie um programa em que o usuário digite uma palavra e o programa informe
// quantos caracteres foram digitados.
import java.util.Scanner;
public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.print("Informe uma palavra: ");
    String s = sc.nextLine();

    int numCaracteres = s.length(); 
    System.out.println("A quantidade de caracteres: " + numCaracteres);
    }
}

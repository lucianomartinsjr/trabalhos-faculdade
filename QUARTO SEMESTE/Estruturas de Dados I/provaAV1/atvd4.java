package provaAV1;
import java.util.Scanner;
public class atvd4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        String nome,sobrenome;

        System.out.print("Informe o nome :");
        nome = sc.nextLine();

        String parts[]=nome.trim().split("\\s+");

        
       sobrenome = parts[parts.length-1];
        System.out.println("\nSobrenome : "+sobrenome);
        
    }
}

// 6- Crie um programa em que o usuário digite 5 palavras. Depois ele poderá digitar outra palavra e o programa informa se ela já existe entre as 5 digitadas.
import java.util.Scanner;
public class atvd6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto[] = new String[6];
        boolean bolFind = false;

        for (int i = 0; i < 5; i++) {
        System.out.printf("Informe a %dª palavra: ",(i + 1));
        texto[i] = sc.nextLine();
        }
        System.out.print("Informe o valor a ser consultado: ");
        texto[5] = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            if (texto[i].trim().equals(texto[5]))
                bolFind = true;
            System.out.println("\nPalavra encontrada"); 
        }
        
        if(bolFind == false)
            System.out.println("\nPalavra nao encontrada");            

    }


}
import java.util.Scanner;
public class atvd1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[9];
        for(int i=0; i <= 8;i++){
            System.out.print("Informe um numero: ");
            vetor[i]=sc.nextInt();
        }

        System.out.print("Vetor informado: ");
        for(int i = 0; i <= 8;i++){
            System.out.print(vetor[i]+" ");                
        }

        System.out.println("");
        System.out.print("Vetor invertido: ");
        for(int i = 8; i >= 0;i--){
            System.out.print(vetor[i]+" ");                
        }
    }
}
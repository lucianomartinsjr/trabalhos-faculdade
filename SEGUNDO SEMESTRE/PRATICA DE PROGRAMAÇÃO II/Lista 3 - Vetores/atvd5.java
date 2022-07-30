import java.util.Scanner;
public class atvd5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[10];
         int pares=0 ;

        for(int i = 0; i < 10; i++){
            System.out.print("Informe um numero: ");
            vetorA[i] = sc.nextInt();
            if (vetorA[i] % 2 == 0)
                pares ++;
        }
        
        System.out.printf("\nForam informados %d numeros pares no vetor",pares);
    }
}

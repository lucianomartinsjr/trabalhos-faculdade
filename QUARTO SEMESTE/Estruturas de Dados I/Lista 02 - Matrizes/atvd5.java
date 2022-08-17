import java.util.Scanner;
import java.util.Random;
public class atvd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        final int numMin = 1 , numMax = 10;

        System.out.print("Informe o tamanho da matriz: ");
        int n = sc.nextInt();

        int mtrz[][]= new int [n][n];
        int vetor[]= new int [n];

        for(int i = 0; i < mtrz.length; i++){
            for(int j = 0; j < mtrz[i].length; j++){
                mtrz[i][j] = random.nextInt(numMax)+numMin;

                vetor[j] += mtrz[i][j];    
            }

        }

        System.out.println("");
        for(int i= 0; i < mtrz.length ; i++){
            for(int j= 0; j < mtrz.length ; j++){
                System.out.print(" "+mtrz[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("");
        for(int i=0; i < vetor.length; i++){
            System.out.print(" "+vetor[i]);
        }

    }
}

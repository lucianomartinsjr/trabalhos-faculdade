import java.util.Scanner;
public class atvd1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a ordem da matriz:  ");
        int n = sc.nextInt();
        int mtrz[][] = new int[n][n];

        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                if (i==j) {
                    mtrz[i][j] = 1;
                }else{
                    mtrz[i][j] = 0;
                }
            }
        }

        for (int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {
                System.out.print(mtrz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
import java.util.Scanner;
import java.util.Random;
class atvd4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        final int numMin = 1 , numMax = 10;

        System.out.print("Informe o tamanho da matriz: ");
        int n = sc.nextInt();

        int mtrzA [][]= new int [n][n];
        int mtrzB [][]= new int [n][n];
        int mtrzC [][]= new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mtrzA[i][j]=random.nextInt(numMax)+numMin;
                mtrzB[i][j]=random.nextInt(numMax)+numMin;
                
                mtrzC[i][j]= mtrzA[i][j] * mtrzB[i][j];
            } 
        }
        
        System.out.println("\n------------Matriz A------------\n");
        for(int i= 0; i < mtrzA.length ; i++){
            for(int j= 0; j < mtrzA.length ; j++){
                System.out.print(" "+mtrzA[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("\n------------Matriz B------------\n");
        for(int i= 0; i < mtrzB.length ; i++){
            for(int j= 0; j < mtrzB.length ; j++){
                System.out.print(" "+mtrzB[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("\n------------Matriz C------------\n");
        for(int i= 0; i < mtrzC.length ; i++){
            for(int j= 0; j < mtrzC.length ; j++){
                System.out.print(" "+mtrzC[i][j]);
            }
            System.out.println(" ");
        }

    }
}
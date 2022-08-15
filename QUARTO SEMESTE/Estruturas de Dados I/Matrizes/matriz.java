import java.util.Random;
class matriz{
    public static void main(String[] args) {
        int v[][] = new int[5][5];
        int m[][] = {{0,1},{5,2}};
        int i,j;

        Random numRand = new Random();

        for (i=0;i<5;i++){
            for (j=0;j<4;j++){
                v[i][j] = numRand.nextInt(20);
            }
        }

        for (i=0;i<5;i++){
            for (j=0;j<4;j++){
                System.out.println(v[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
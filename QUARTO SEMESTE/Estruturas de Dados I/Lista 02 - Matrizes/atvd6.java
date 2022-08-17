import java.util.Scanner;
import java.util.Random;

public class atvd6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int notas[][] = new int[3][10];
        int menorNota =0,maiorNota=10,prova1,prova2,prova3;

        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++){
                System.out.printf("Aluno %d,AV%d",(j+1),(i+1));
                notas[i][j]= r.nextInt(10);
                System.out.printf(" "+notas[i][j]);

                if(notas[i][j]<=menorNota)
                menorNota=notas[i][j];
                System.out.println();
            }
            System.out.printf("=-=-=-=-=-=-=");
        
        }
        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++){
                
            }
        System.out.println("");
        }

    }
}



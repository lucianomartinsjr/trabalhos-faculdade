import java.util.Scanner;
import java.util.Random;

public class atvd6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        int notas[][] = new int[10][3];
        int menorNota[]= {10,10,10,10,10,10,10,10,10,10};
        int av1= 0 ,av2 = 0,av3 = 0;

        for (int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++){
                notas[i][j]= r.nextInt(10);
                if (menorNota[i] > notas[i][j]){
                menorNota[i]=notas[i][j];
                if(i == 0)
                    av1++;
                if(i == 1)
                    av2++;
                if(i == 2)
                    av3++;
                }
            }
        }
        System.out.printf("=-=-=-=-=-=-=");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nAluno %d -\n",i+1);
            for(int j = 0; j < notas[j].length; j++){
                System.out.printf(" %d ",notas[i][j]);
            }
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Aluno %d ",i);
                System.out.printf("Menor nota : %d ",menorNota[i]);
        System.out.println("");
        }
        System.out.println("Menores notas por avaliacao:");
        System.out.printf  (" AV1 = %d | AV2 = %d | AV3 = %d | ",av1,av2,av3);
    
    }

}



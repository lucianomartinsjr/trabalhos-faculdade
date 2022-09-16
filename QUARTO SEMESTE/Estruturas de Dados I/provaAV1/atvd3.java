package provaAV1;
import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numImpar = 0 ,numPar = 0 ;
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j  = 0; j < matriz.length; j++) {
                System.out.printf ("\nInforme um numero para posição [%d][%d] :", i+1, j+1);
                matriz[i][j] = sc.nextInt();

                if(matriz[i][j] %2 == 0) 
                    numPar++;
                else
                    numImpar++;
            }
        }

        System.out.println("");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ",matriz[i][j]);
            }
        System.out.println("");
        }
        System.out.println("A quantidade de numeros pares foi: "+numPar);
        System.out.println("A quantidade de numeros impares foi: "+numImpar);
    }   
}

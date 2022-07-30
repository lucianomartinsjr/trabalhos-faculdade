import java.util.Scanner;
public class atvd3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        for(int i=0; i<10; i++ ){
            System.out.print("Informe 10 numeros: ");
            vetorA[i] = sc.nextInt();
            //sempre ao multiplicar pela posição, somar o indice ao 1.
            vetorB[i] = vetorA[i] * i+1;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        for(int i=0;i<10;i++){
            System.out.printf("\n    %d    *    %d    =    %d\n",vetorA[i],(i+1),vetorB[i]);
        }
    }
    
}

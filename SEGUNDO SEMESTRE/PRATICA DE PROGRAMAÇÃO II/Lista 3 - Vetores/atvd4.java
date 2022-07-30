import java.util.Scanner;
public class atvd4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int [10];
        int vetorB[] = new int [10];
        int vetorC[] = new int [10];

        for(int i=0;i<10;i++){
            System.out.print("Informe o valor de A :");
            vetorA[i] = sc.nextInt();
            System.out.print("Informe o valor de B :");
            vetorB[i] = sc.nextInt();
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.println("");
        }
        System.out.println("------------------------");
        System.out.println("   A   -   B   :");
        System.out.println("------------------------");
        for(int i=0;i<10;i++){
            System.out.printf("   %d   -   %d   :   %d\n",vetorA[i],vetorB[i],vetorC[i]);
        }
        System.out.println("------------------------");
    }
}

import java.util.Scanner;
public class atvd7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[5];
        int vetorD[] = new int[15];

        for(int i=0;i<5;i++)
            {
                System.out.print("Informe o valor de A: ");
                vetorA[i] = sc.nextInt();
                vetorD[i] = vetorA[i];

                System.out.print("Informe o valor de B: ");
                vetorB[i] = sc.nextInt();
                vetorD[i+5]=vetorB[i];

                System.out.print("Informe o valor de C: ");
                vetorC[i] = sc.nextInt();
                vetorD[i+10]=vetorC[i];
                System.out.println("");
            }

        System.out.println("- Vetor A -");
            for(int i=0;i<5;i++){
                System.out.print(vetorA[i]+" ");
            }

        System.out.println("");
        System.out.println("- Vetor B -");
            for(int i=0;i<5;i++){
                System.out.print(vetorB[i]+" ");
            }

        System.out.println("");
        System.out.println("- Vetor C -");
            for(int i=0;i<5;i++){
                System.out.print(vetorC[i]+" ");
            }

        System.out.println("");
        System.out.println("- Vetor D -");
            for(int i=0;i < 15;i++){
                System.out.print(vetorD[i]+" ");
            }
    }
}

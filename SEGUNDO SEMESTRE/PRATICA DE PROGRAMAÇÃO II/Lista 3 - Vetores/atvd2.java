import java.util.Scanner;
public class atvd2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        for (int i = 0; i < 10;i++)
            {
                System.out.print("Informe o Valor de A: ");
                vetorA[i] = sc.nextInt();
                vetorB[i] = vetorA[i]*vetorA[i];
            }
        for(int i = 0; i < 10; i++){
          System.out.println("  Vetor A  ~>   Vetor B ");  
          System.out.printf("|    %d   | ~> |    %d   |\n",vetorA[i],vetorB[i]);
        }
    }
}

import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S[] = new int[20];
        int j=0,k=0;

        for (int i = 0; i < 20;i++) {
            System.out.print("Informe um valor: ");
            S[i] = sc.nextInt();
            j++;
        }

        int Scomp[] = new int[j];
        System.out.println("\n\nVETOR COMPACTADO:");
        for (int i = 0; i < 20;i++) {
            if(S[i]>0){
                Scomp[k]=S[i];
                System.out.print(Scomp[k]+" ");
                k++;
            }
        }
        
    } 
}

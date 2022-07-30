import java.util.Scanner;
public class atvd5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n,somadiv=0;

        System.out.println("Informe um numero para verificar se ele e perfeito. ");
        System.out.print("\nQual numero deseja verificar ? : ");
            n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            if ( n % i == 0)
                { 
                  somadiv =  somadiv + i;
                }
                
        }

        if ( somadiv == n)
            {
                System.out.printf("\nO numero %d e um numero perfeito.",n);
            }

        else { System.out.printf("\nO numero %d não e perfeito.",n); }
    }
}

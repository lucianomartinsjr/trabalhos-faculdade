import java.util.Scanner;
public class atvd4 {
        public static void main(String[] args)
        {
            int num ;
            Scanner sc = new Scanner(System.in);

            System.out.print("\nInforme o numero: ");
            num=sc.nextInt();

            if(num % 2 == 0)
                System.out.println("O numero escolhido e par.");
            
            else
                System.out.println("O numero escolhido e impar.");
        }
}

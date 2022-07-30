import java.util.Scanner;
public class atvd4 
{
     public static void main (String[]args)
        {
            Scanner sc = new Scanner (System.in);
            int num;

            System.out.print("Informe um numero: ");
            num = sc.nextInt();

            if (num < 1)
                System.out.println("o numero informado e negativo");
            else if (num >= 1)
                System.out.println("o numero informado e positivo");
            else
                System.out.println("o numero informado e zero");

        }    
}

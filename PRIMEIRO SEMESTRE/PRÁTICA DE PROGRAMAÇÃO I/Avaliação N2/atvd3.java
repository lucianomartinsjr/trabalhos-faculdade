import java.util.Scanner;
public class atvd3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int num1,num2,num3;
        System.out.print("\nInforme o primeiro numero: ");
            num1 = sc.nextInt();
        System.out.print("\nInforme o segundo numero: ");
            num2 = sc.nextInt();
        System.out.print("\nInforme o terceiro numero: ");
            num3 = sc.nextInt();
            if((num1 >= num2)&&(num1 >= num3))
                System.out.println("\nO maior numero e "+num1);
            else if ((num2 >= num1)&&(num2 >= num3))
                System.out.println("\nO maior numero e "+num2);
            else
                System.out.println("\nO maior numero e "+num3);
    }
}

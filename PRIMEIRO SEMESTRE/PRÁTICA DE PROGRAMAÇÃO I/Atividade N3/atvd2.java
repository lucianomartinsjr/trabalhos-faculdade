import java.util.Scanner;
public class atvd2{
    public static void main(String[] args)
    {
        int num,fat = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero que deseja fatorar: ");
            num = sc.nextInt();
        
        System.out.println("________________");   
            for (int i = 1; i <= num; i++)
            {
                fat = fat * i;
                System.out.println("!"+num+" = "+fat);
            }

        System.out.println("_________________________________");
    }
}
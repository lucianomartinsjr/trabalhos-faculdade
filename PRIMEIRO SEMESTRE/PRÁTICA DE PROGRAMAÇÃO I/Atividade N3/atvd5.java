import java.util.Scanner;
public class atvd5 {
    public static void main(String[]Args)
    {
        Scanner sc = new Scanner(System.in);
        int num,mult;
        
        System.out.print("\nInforme o numero em que deseja realizar a tabuada: ");
            num = sc.nextInt();
            
        System.out.println("________________\n");   
        for (int i = 1; i <= 10; i++)
            {
                mult= num * i;
                System.out.println(num+" * "+i+" = "+mult);
                
            }

        System.out.println("________________");          
    }
}

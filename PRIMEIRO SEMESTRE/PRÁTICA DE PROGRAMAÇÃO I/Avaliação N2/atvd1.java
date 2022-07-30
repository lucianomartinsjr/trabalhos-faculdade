import java.util.Scanner;
public class atvd1
{
    public static void main(String[] args)
    {
        int ano;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ano que deseja saber se e bissexto: ");
        ano = sc.nextInt();
        
        if((ano % 100 != 0) && (ano % 4 == 0))
            System.out.println("\nO ano "+ano+" e bissexto.");

        else if(ano % 400 == 0)
            System.out.println("\nO ano "+ano+" e bissexto."); 

        else
            System.out.println("\nO ano "+ano+" e um ano comum");
        
    }
}
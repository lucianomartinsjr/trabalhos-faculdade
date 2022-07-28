import java.util.Scanner;
public class atvd3
{
    public static void main(String[]Args)
    {
     String nome,idade,cidade;
     Scanner sc = new Scanner(System.in);
     System.out.print("Informe seu nome: ");
     nome = sc.nextLine();
     System.out.print("Informe sua idade: ");
     idade = sc.nextLine();
     System.out.print("Informe onde mora: ");
     cidade = sc.nextLine();
     System.out.printf("\nOla! %s, %s, residente em %s, Seja bem vindo ... \n",nome,idade,cidade);
    }
}
import java.util.Scanner;
public class atvd1{
    public static void main(String[] args)
    {
        int cod,num,i=0,res;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme o numero: ");
            num = sc.nextInt();

        System.out.println("\n1- Soma;");
        System.out.println("2- Multiplicacao;");
        System.out.print("\nEscolha a opcao: ");
            cod = sc.nextInt();
        System.out.println("__________________________\n");

                switch(cod)
                {
                    case 1:
                        do{
                            i++;
                        res=i+num;
                        System.out.println(num+" + "+ i +" = "+res);
                        }
                        while(i <= );
                    break;

                    case 2:    
                        do{
                            i++;
                        res = i * num;
                        System.out.println(num+" * "+ i +" = "+res);
                        }
                        while(i <= 9);
                    break;
                    default: System.out.println("\nCodigo Incorreto");
                }
    }
}
import java.util.Scanner;
public class atvd2 {
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            
            System.out.print("\nInforme o numero que deseja saber o o mes correspondente: ");
                num = sc.nextInt();
                
            if (num >= 1 && num <= 12)
            {
                switch (num)
                    {
                        case 1:
                            System.out.println("\nO numero "+num+"  corresponde a Janeiro");
                        break;

                        case 2:
                            System.out.println("\nO numero "+num+" corresponde a Fevereiro");
                        break;

                        case 3:
                            System.out.println("\nO numero "+num+" corresponde a Março ");
                        break;

                        case 4:
                            System.out.println("\nO numero "+num+" corresponde a Abril ");
                        break;

                        case 5:
                            System.out.println("\nO numero "+num+" corresponde a Maio ");
                        break;

                        case 6:
                            System.out.println("\nO numero "+num+" corresponde a Junho");
                        break;

                        case 7:
                            System.out.println("\nO numero "+num+" corresponde a Julho ");
                        break;

                        case 8:
                            System.out.println("\nO numero "+num+" corresponde a Agosto");
                        break;

                        case 9:
                            System.out.println("\nO numero "+num+" corresponde a Setembro");
                        break;

                        case 10:
                            System.out.println("\nO numero "+num+" corresponde a Outubro");
                        break;

                        case 11:
                            System.out.println("\nO numero "+num+" corresponde a Novembro");
                        break;

                        case 12:
                            System.out.println("\nO numero "+num+" corresponde a Dezembro");
                        break;
                    }
            }else 
            System.out.println("\nO numero inválido, rode novamente o algoritimo e selecione apenas de 1 a 12.");

        }
    
}

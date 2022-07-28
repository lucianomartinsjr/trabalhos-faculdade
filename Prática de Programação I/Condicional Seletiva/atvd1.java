import java.util.Scanner;
public class atvd1{
    public static void main(String[] args)
    {
        int cod;
        double num1,num2,op;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o primeiro numero: ");
            num1 = sc.nextDouble();
          System.out.print("Informe o segundo numero: ");
            num2 = sc.nextDouble();

            System.out.println("\n1 - Media entre os valores ");
            System.out.println("2 - Diferenca do maior pelo menor");
            System.out.println("3 - Produto entre os valores digitados");
            System.out.println("4 - Divisao do primeiro pelo segundo\n"); 
            System.out.print("\nEscolha a Operacao: ");
                cod = sc.nextInt();

                 switch(cod)
                    {
                        case 1 :
                            op = (num1 + num2) / 2;
                            System.out.printf("A media entre os numeros e %.2f",op);
                        break;

                        case 2 :
                            double maior,menor;
                            if( num1 > num2 )
                            { 
                                maior = num1;
                                menor = num2;
                            }
                            else{
                                maior = num2;
                                menor = num1;
                            };
                            op = (maior - menor);
                            System.out.printf("A diferenca do maior para o menor e %.1f",op);
                        break;

                        case 3 :
                            op = num1 * num2;
                            System.out.printf("O produto entre os dois numeros digitados e %.2f",op);
                        break;

                        case 4 :
                            op = num1 / num2;
                            System.out.printf("A divisao do primeiro pelo segundo numero e %.2f",op);
                        break;
                    default : System.out.println("A operacao selecionada e invalida."); 
                    }

    }
}
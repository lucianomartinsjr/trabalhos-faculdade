import java.util.Scanner;
public class atvd2 
    {
    public static void main(String [] args)
        {
            double num1,num2,div;
            Scanner sc = new Scanner (System.in);

            System.out.print("\nInforme o primeiro numero: ");
                num1 = sc.nextDouble();

            System.out.print("Informe o segundo numero: ");
                num2 = sc.nextDouble();
            if(num2 == 0)
                {System.out.println("\nNao e possivel dividir por 0.");}
            else
             {
                div = num1 / num2;
                System.out.printf("\nRealizando a divisao de %.0f e %.0f resulta em : %.0f\n",num1,num2,div);
             }
        }
    }

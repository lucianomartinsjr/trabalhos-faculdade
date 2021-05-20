import java.util.Scanner;
public class atvd2 
    {
        public static void main (String[]Args)
        {
            double valor=0,percentual =0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe o valor: ");
            valor = sc.nextDouble();
            percentual = 5.0/100.0;
            if(valor > 0 )
                {
                double reajuste = valor*percentual;
                valor = valor + reajuste;  
                System.out.println("O valor do reajuste foi: "+valor);
                }
            else{ System.out.println("Valor informado incorreto.");}
        }


    }
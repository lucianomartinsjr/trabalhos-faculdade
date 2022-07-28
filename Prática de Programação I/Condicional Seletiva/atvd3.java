import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args) 
        {
            int cod;
            Double num1,num2,result=0.0;

            Scanner sc = new Scanner(System.in);
            
            System.out.println("\t1 \tSoma.");
            System.out.println("\t2 \tSubtracao.");
            System.out.println("\t3 \tMultiplicacao.");
            System.out.println("\t4 \tDivisao.");

            System.out.print("\nSelecione uma operacao: ");
                cod = sc.nextInt();
            if( cod < 1 || cod > 4) 
                System.out.println("Operacao invalida");
            else {

                    System.out.print("\n\tInforme o primeiro numero: ");
                        num1 = sc.nextDouble();
                    System.out.print("\tInforme o segundo numero: ");
                        num2 = sc.nextDouble();

                    switch(cod)
                    {
                        case 1 :
                            result = num1 + num2;
                        break;

                        case 2 :
                            result = num1 - num2;
                        break;

                        case 3 :
                            result = num1 * num2;
                        break;

                        case 4 :
                            if (num2 == 0 )
                                { System.out.println("\n\tNao e possivel dividir por 0");}

                            else result = num1 / num2;
                        break;
                    }

                    System.out.printf("\n\tO resultado foi %.0f\n",result); 
                }
        
        }
}

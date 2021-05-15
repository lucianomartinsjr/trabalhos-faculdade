import java.util.Scanner;
public class atvd4{
    public static void main (String[]args){
        double valDol,valReal;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme a cotacao do dolar: ");
        float cotDol= sc.nextFloat();
        System.out.print("Informe o valor em dolares: ");
        valDol= sc.nextDouble();
        valReal = cotDol*valDol;
        System.out.printf("\nO valor em reais e: %.2f\n",valReal);

    }
}
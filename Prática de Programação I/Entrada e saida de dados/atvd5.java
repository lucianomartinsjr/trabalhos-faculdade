import java.util.Scanner;
class atvd5{
    public static void main(String[]args){
        int codvend,codprod,qntd;
        double valorun,valorfinal;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme o codigo do vendedor: ");
        codvend = sc.nextInt();
        System.out.print("Informe o codigo da peca: ");
        codprod = sc.nextInt();
        System.out.print("Informe o valor da peca: ");
        valorun = sc.nextDouble();
        System.out.print("Informe a quantidade vendida: ");
        qntd = sc.nextInt();
        valorfinal=valorun*qntd;
        double comissao = (valorfinal*0.05);
        System.out.printf("\nO vendedor %d vendeu %d unidades no valor de %.2f | totalizando %.2f\n",codvend,qntd,valorun,valorfinal);
        System.out.printf("\nSendo assim sua comissao nessa venda foi de R$: %.2f \n",comissao);


        
    }
}
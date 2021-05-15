import java.util.Scanner;
public class atvd7 {
    public static void main(String[]args){
        String desc;
        double valor,vlrfinal;
        int quantidade;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme a Descricao do Produto  : ");
        desc = sc.nextLine();
        System.out.print("Informe o valor do Produto      : ");
        valor = sc.nextDouble();
        System.out.print("Informe a quantidade do produto : ");
        quantidade = sc.nextInt();
        vlrfinal= quantidade * valor;
        System.out.printf("\nO produto | %s | vendido por R$ %.2f \n",desc,valor);
        System.out.printf("Temos %d produtos no estoque e com valor de estoque total: %.2f\n",quantidade,vlrfinal);



    }
}

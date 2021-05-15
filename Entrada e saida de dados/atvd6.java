import java.util.Scanner;
public class atvd6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,aux;
        System.out.print("Informe o Valor de A : ");
        a= sc.nextInt();
        System.out.print("Informe o Valor de B : ");
        b=sc.nextInt();
        aux=a;
        a=b;
        b=aux;
        System.out.printf("\nEntao agora ficou A: %d e B: %d\n",a,b);
    }
}

import java.util.Scanner;
class atvd2{
    public static void main(String[]args){
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        num1= sc.nextInt();
        System.out.print("Informe o segundo  numero: ");
        num2= sc.nextInt();
        System.out.print("Informe o terceiro numero: ");
        num3= sc.nextInt();
        int soma = num1+num2+num3;
        System.out.print("A Soma dos três numeros foi: "+soma);
    }

}
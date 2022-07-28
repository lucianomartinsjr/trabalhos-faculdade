import java.util.Scanner;
class atvd3{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do Salario Minimo R$ ");
            double slrmin = sc.nextDouble();
        System.out.print("Informe o valor do seu Salario atual R$ ");
            double slratual = sc.nextDouble();
        if(slratual >= slrmin)
            {
                double qnt_slr = slratual/slrmin;
                System.out.printf("Voce recebe %.1f Salarios",qnt_slr);     
            }
        else 
         {
            System.out.print("\nSalario atual menor que o salario minimo, valor invalido.");
         }
 }
}
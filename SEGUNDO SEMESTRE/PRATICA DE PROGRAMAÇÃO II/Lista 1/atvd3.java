import java.util.Scanner;

public class atvd3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,a1,r;

        System.out.println("\n\t-  Progressao Aritmetica (P.A.) - ");
        System.out.print("\nInforme o Primeiro Elemento: ");
        a1 = sc.nextInt();

        System.out.print("Informe a razao: ");
        r = sc.nextInt();

        System.out.print("Informe o numero de elementos: ");
        n = sc.nextInt();
        System.out.print("\n");

        for (int i = 0; i < n; i++) {

            System.out.print(a1+"  ");

            if (a1 > 0 )
            { a1 = a1 + r; }

            else
            { a1 = a1 - r; }
        }

        System.out.println("\n\n\t- Progressao Geometrica (P.G.) - ");
        System.out.print("\nInforme o primeiro elemento: ");
            a1 = sc.nextInt();

        System.out.print("Informe a razao: ");
            r = sc.nextInt();
        System.out.print("\n");

        for (int i = 0; i < n; i++ ){

            System.out.print(a1+"  ");
            a1 = a1 * r;
        }

        System.out.print("\n");
    }
}
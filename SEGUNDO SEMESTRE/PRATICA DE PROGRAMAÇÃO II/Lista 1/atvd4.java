import java.util.Scanner;
public class atvd4 {
    public static void main (String[]args ) {
        Scanner sc = new Scanner(System.in);

        int num,a1 = 0, a2 = 0 , a3 = 0, a4 = 0;
        
        System.out.println("\n\t - Contagem de intervalos - ");
        System.out.println("\nA contagem ira parar assim que informar um numero negativo.");

        do {
            System.out.print("\nInforme um numero:");
            num = sc.nextInt();

            if (num < 0 || num > 100){
                System.out.println("\nFora do intervalo.")
            }

            else if (num < 26 ){
                a2++;
            }

            else if (num < 51 ){
                a3++;
            }

            else if (num < 76 ){
                a4++;

            } else
                a1++;
        
        }
        while (num >= 0);


        System.out.println("\n\tResultados");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("[ 0  - 25 ] = %d\n",a1);
        System.out.printf("[ 26 - 50 ] = %d\n",a2);
        System.out.printf("[ 51 - 75 ] = %d\n",a3);
        System.out.printf("[ 76 - 100] = %d\n",a4);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        
    }
}

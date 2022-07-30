import java.util.Scanner;

public class atvd3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char sexo = 'N';
        int n_criancas = 0, numMas = 0, numFem = 0, cri24m = 0, numMesesVida;
        float porc_mortasper, porcmascmortas, porcCri24m,totalMortas;

        System.out.print("Informe o número de crianças nascidas no periodo: ");
        n_criancas = sc.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" F - Feminino");
        System.out.println(" M - Masculino");
        System.out.print("Informe o sexo da criança : ");
        sexo = sc.next().charAt(0);

        while (sexo != 'v' && sexo != 'V') {
        
            if (sexo == 'm' || sexo == 'M')
                numMas++;

            if (sexo == 'f' || sexo == 'F')
                numFem++;

            System.out.print("Informe a quantidade de meses de vida: ");
            numMesesVida = sc.nextInt();

            if (numMesesVida <= 24) 
                cri24m++;

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(" F - Feminino");
            System.out.println(" M - Masculino");
            System.out.print("Informe o sexo da criança : ");
            sexo = sc.next().charAt(0);
        }

        totalMortas = numMas + numFem;
        porc_mortasper = (float) totalMortas / n_criancas * 100;
        porcmascmortas = (float) numMas / totalMortas * 100;
        porcCri24m = (float) cri24m / n_criancas  * 100;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("Total de crianças mortas no periodo:  %.2f %%\n",totalMortas);
        System.out.printf("Porcentagem de criancas mortas no periodo: %.2f %%\n",porc_mortasper);
        System.out.printf("Porcentagem de criancas do sexo masc. mortas no periodo: %.2f %%\n",porcmascmortas);
        System.out.printf("Porcentagem de criancas que viveram 24 meses ou menos no periodo: %.2f %%\n",porcCri24m);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }   
}

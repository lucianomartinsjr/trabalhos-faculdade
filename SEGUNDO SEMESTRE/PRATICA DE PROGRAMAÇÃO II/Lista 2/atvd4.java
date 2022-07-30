import java.util.Scanner;

public class atvd4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int dia1 = 1, mes1 , ano1 = 0, dia2 = 0, mes2, ano2, diasAno = 0, diaMes, dia;

        while (dia1 > 0) {
            diaMes = 0;
            System.out.print("-=-=- Informe um numero negativo para encerrar o código -=-=-");
            System.out.print("Informe a data mais antiga na ordem dia/mês/ano\nDia: ");
            dia = sc.nextInt();

            if (dia > 0) {
                System.out.print("Mês: ");
                mes1 = sc.nextInt();
                System.out.print("Ano: ");
                ano1 = sc.nextInt();

                System.out.print("Informe a data mais recente na ordem dia/mês/ano\nDia: ");
                dia2 = sc.nextInt();
                System.out.print("Mês: ");
                mes2 = sc.nextInt();
                System.out.print("Ano: ");
                ano2 = sc.nextInt();

                diasAno = ano2 - ano1;
                diasAno = diasAno * 365;

                for (int i = ano1; i < ano2; i++) {
                    if ((i % 4 == 0) && (i % 100 != 0)) diasAno++;
                }

                if (mes1 != mes2) {
                    if (mes1 > mes2) {
                        int j = mes2;

                        while (j != mes1) {
                            if (j == 1 || j == 3 || j == 5 || j == 7 || j ==8 || j == 10 || j == 12) diaMes = diaMes - 31;
                            if (j == 2) diaMes = diaMes - 28;
                            if (j == 4 || j == 6 || j == 9 || j == 11) diaMes = diaMes - 30;
                            j++;
                        }

                        if (mes2 > mes1) {
                            j = mes1;

                            while (j != mes2) {
                                if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12) diaMes = diaMes+31;
                                if(j == 2) diaMes = diaMes+28;
                                if (j == 4 || j == 6 || j == 9 || j == 11) diaMes = diaMes+30;
                                j++;
                            }
                        }
                    }
                }
            }

            dia = dia2 - dia1;
            dia = dia + diaMes + diasAno;
            System.out.println("Total de dias: " + dia);
        }
    }
}

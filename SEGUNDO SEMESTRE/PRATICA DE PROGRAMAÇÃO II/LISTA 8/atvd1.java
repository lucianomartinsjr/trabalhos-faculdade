import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = { 9, 75, 77, 18, 48, 14, 2, 4, 91, 57, 56, 29, 22, 5, 8, 60, 62, 93, 97, 7, 49, 87, 81, 71, 38, 78,
                99, 19, 31, 67 };
        int num, i = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Informe o valor que deseja buscar: ");
        num = sc.nextInt();

        for (i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                System.out.println("Foi encontrado o numero " + num);
                break;
            }
        }

        if (i >= vet.length) {
            System.out.println("Nao foi encontrado o valor " + num);
        }
    }
}
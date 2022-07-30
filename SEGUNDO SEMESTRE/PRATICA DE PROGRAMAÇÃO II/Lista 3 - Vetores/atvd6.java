import java.util.Scanner;
public class atvd6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[10];
        int igual15=0,soma=0;
        float media= 0;
        for(int i=0; i< 10; i++){
            System.out.print("Informe um numero: ");
            vetorA[i] = sc.nextInt();
                if(vetorA[i] < 15)
                    soma=vetorA[i]+soma;
                else
                    if(vetorA[i] > 15)
                        media +=(float)vetorA[i];
                    else
                        igual15++;                          
        }
        media = media/10;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("A soma de numeros menores que 15 é : %d",soma);
        System.out.printf("\nForam informados %d números iguais a 15.",igual15);
        System.out.printf("\nOs numeros maiores formam uma media de: %.2f %%\n",media);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=");
    }
}

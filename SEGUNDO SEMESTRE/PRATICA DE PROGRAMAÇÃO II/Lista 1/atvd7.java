import java.util.Scanner;
public class atvd7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        int num,maior=0,menor=0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("- Para encerrar o algoritimo digite 0 -");
        System.out.println("Informar somente valores inteiros e positivo.");
        
        System.out.print("\nDigite um numero : ");
            num = sc.nextInt();
            maior = num;
            menor = num;
    
            while (num != 0 ) {

                if(num < 0)
                {
                    System.out.println("\nNumero nao pode ser negativo.");
                }
                
                else
                {
                        if(num > maior )
                        {
                            maior = num;
                        }

                        if (num < menor || menor < 0 )
                        {
                            menor = num;
                        }

                }

                System.out.print("Digite um numero : ");
                num = sc.nextInt();
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("\nO maior numero informado foi %d",maior);
            System.out.printf("\nO menor numero informado foi %d",menor);
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");     
    }    
}

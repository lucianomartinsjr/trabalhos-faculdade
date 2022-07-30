import java.util.Scanner;
public class atvd8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[40];
        int cont[]= new int[40];
        int num = 0;

        for(int i=0;i<40;i++){
            System.out.print("Informe um numero:");
            vetorA[i]=sc.nextInt();
                for(int ia=0;ia<40;ia++){
                    if(ia != i){
                        while(vetorA[i] == vetorA[ia]){
                            System.out.println("Numero já escrito no elemento.");
                            System.out.println("Informe um numero diferente para o indice "+i+" :");
                            vetorA[ia] = sc.nextInt();
                            }
                    }
                }
        }

        do{
        System.out.print("Digite um número ");
        num=sc.nextInt();
            for(int i=0;i<40;i++){
                if(vetorA[i] == num)
                    cont[i]++;
            }
        }while (num != 0);

        for(int i=0;i<40;i++){
            if(cont[i] != 0){
                System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-");
                System.out.printf("O numero %d de posicao %d foi encontrado %d vezes.\n",vetorA[i],i,cont[i]);
            }
        }
    }
}

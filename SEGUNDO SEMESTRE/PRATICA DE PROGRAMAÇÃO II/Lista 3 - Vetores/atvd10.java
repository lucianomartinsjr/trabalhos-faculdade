import java.util.Scanner;
public class atvd10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maior=0,indice=0,N=0;
        System.out.print("Quantos elementos deseja no vetor: ");
        N = sc.nextInt();
        int vet[] = new int[N];
        for(int i=0;i<N;i++)
        {
            System.out.print("Informe um numero:");
            vet[i] = sc.nextInt();
                for(int ia=0;ia<N;ia++)
                {
                    while(vet[i] != vet[ia]);
                    {
                        System.out.println("Número já escrito no elemento: "+ia);
                        System.out.println("Digite um diferente para o elemento "+i+":");
                        vet[i]=sc.nextInt();
                    }
                }
            if(maior < vet[i])
            {
                maior=vet[i];
                indice=i;
            }
        }     

        System.out.println("O maior numero foi: "+maior+" - POSIÇÃO NO VETOR ["+indice+" ]");
    }    
}

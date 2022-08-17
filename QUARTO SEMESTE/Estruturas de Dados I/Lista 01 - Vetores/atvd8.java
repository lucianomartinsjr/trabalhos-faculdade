import java.util.Scanner;

public class atvd8
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[12];
    int x,y,soma;
    
    for (int i=0; i<12;i++){
        System.out.printf("Informe a posição %d do vetor A: ",i);
        a[i]= sc.nextInt();
    }
    
    do{
    System.out.printf("Informe a primeira posição: ");
    x=sc.nextInt();
    if (x<0 || x>11)
        System.out.printf("Posição inválida, deve ser de 0 a 11\n");
    }while(x<0 || x>11);
    do{
    System.out.printf("Informe a segunda posição: ");
    y=sc.nextInt();
     if (y<0 || y>11)
        System.out.printf("Posição inválida, deve ser de 0 a 11\n");
	}while(y<0 || y>11);
    
    soma = a[x]+a[y];
    
    System.out.printf("\n"); 
    imprimeVetor(a);
    System.out.printf("\n"); 
    System.out.printf("Soma das posições %d + %d = %d",x,y,soma);
    }
    
    static void imprimeVetor(int[] vet) {
        for(int i=0;i<vet.length;i++){
            System.out.printf("[%d]", vet[i]);
        }
    }
}

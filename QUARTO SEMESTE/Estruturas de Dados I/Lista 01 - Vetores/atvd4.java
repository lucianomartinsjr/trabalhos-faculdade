import java.util.Scanner;

public class atvd4
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int SomaMaior=0,QuantIgual=0,mediaMaior=0,quantMaior=0;
    int a[] =  new int[10] ;

    
    for (int i=0; i<10;i++){
        System.out.printf("Informe a posição [%d] do vetor: ",i);
        a[i] = sc.nextInt();
        
        if (a[i] <15)
        SomaMaior += a[i];
        else if(a[i]==15)
        QuantIgual++;
        else if(a[i]>15){
            quantMaior++;
            mediaMaior+=a[i];
        }
	}
	mediaMaior = mediaMaior / SomaMaior;
	
    System.out.printf("Soma dos menores que 15: %d\nQuantidade Igual a 15: %d\nMedia dos maiores que 15: %d",SomaMaior,QuantIgual,mediaMaior);
	
    }
}
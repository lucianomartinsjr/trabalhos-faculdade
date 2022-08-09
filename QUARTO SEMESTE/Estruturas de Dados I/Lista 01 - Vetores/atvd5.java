//import java.util.Scanner;
import java.util.Random;

public class atvd5
{
	public static void main(String[] args) {
    Random random = new Random();
    int a[] =  new int[10] ;
    int n=0;

    
    for (int i=0; i<10;i++){
        a[i]=(int)random.nextInt(2);
        
        if (a[i]==1)
        n++;
        }
        System.out.printf("%d porcento são iguais a 1 e %d porcento são iguais a zero\n",n*10,(10-n)*10);
        
        for (int i=0;i<10;i++){
            System.out.printf("[%d]",a[i]);
        }
	}
}
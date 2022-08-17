import java.util.Random;
import java.util.Scanner;
public class atvd2 {
     public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    final int numMin = 1 , numMax = 10;
	
	int mtrz[][] = new int [10][10];
	int somaTotalMatriz = 0,somaPrimeiraLinha = 0,somaTerceiraColuna = 0,somaDiagonalPrincipal = 0,somaDiagonalSegundaria = 0,x;
	int i,j = 0;
	
	do{
        System.out.print("Informe a ordem da Matriz: ");
        x = sc.nextInt();
        if(x<3){
            System.out.println("Por favor informe uma ordem maior que 3!");
        }
    }while(x<3);
	 
	 for(i = 0; i < x; i++){
		 for(j = 0; j < x; j++){
			 mtrz[i][j] = random.nextInt(numMax)+numMin;
		 }
	 }
     //linha
	 for(i = 0; i < mtrz.length; i++){
        //coluna
		 for(j = 0; j < mtrz.length; j++){
			 
			 if(i == 0){
				  somaPrimeiraLinha += mtrz[i][j];
			 }
			 
			 if(j == 2){
				 somaTerceiraColuna += mtrz[i][j];
			 }
			
			 if(i == j){
				 somaDiagonalPrincipal += mtrz[i][i];
			 }
	    
	         if(i + j == x - 1){
				  somaDiagonalSegundaria += mtrz[i][j];
			 }
			
			  somaTotalMatriz += mtrz[i][j];
		 }
	 }

     System.out.println("");
	 for(i = 0; i < x; i++){
		 for(j = 0; j < x; j++){
            System.out.printf(" %d ",mtrz[i][j]);
        }
        System.out.println("");
	 }
	 System.out.printf("\nA Soma da primeira linha : %d",somaPrimeiraLinha);
	 System.out.printf("\nA soma da terceira coluna: %d", somaTerceiraColuna);
     System.out.printf("\nA soma da diagonal principal: %d", somaDiagonalPrincipal);
     System.out.printf("\nA soma da diagonal secundaria: %d", somaDiagonalSegundaria);
     System.out.printf("\nA soma de todos os elementos da matriz: %d", somaTotalMatriz);
  }
}

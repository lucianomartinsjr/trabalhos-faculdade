import java.util.Scanner;

public class atvd{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	
	int[] vet[] = new int [10][10];
	int soma = 0,Soma1linha = 0,Soma3coluna = 0,somadp = 0,somads = 0,x;
	int i,j = 0;
	
	System.out.print("Informe a ordem da Matriz: ");
    x = sc.nextInt();
	 
	 for(i = 0; i < x; i++){
		 for(j = 0; j < x; j++){
			 
			 System.out.printf("\nInforme os valores para Linha %d Coluna %d ",i+1,j+1);
			 vet[i][j] = sc.nextInt();
		 }
	 }

	 for(i = 0; i < x; i++){
		 for(j = 0; j < x; j++){
			 
			 if(i == 1){
				  Soma1linha += vet[i][j];
			 }
			 
			 if(i == 3){
				 Soma3coluna += vet[i][j];
			 }
			
			 if(i == j){
				 somadp += vet[i][i];
			 }
	    
	         if(i + j == x - 1){
				  somads += vet[i][j];
			 }
			
			  soma += vet[i][j];
		 }
	 }

	 for(i = 0; i < x; i++){
		 for(j = 0; j < x; j++){
			 System.out.printf("\n %d",vet[i][j]);
		 }
	 }
	 System.out.printf("\nA Soma da linha 1 %d",Soma1linha);
	 System.out.printf("\nA soma da terceira coluna: %d", Soma3coluna);
     System.out.printf("\nA soma da diagonal principal: %d", somadp);
     System.out.printf("\nA soma da diagonal secundaria: %d", somads);
     System.out.printf("\nA soma de todos os elementos da matriz: %d", soma);
  }
}


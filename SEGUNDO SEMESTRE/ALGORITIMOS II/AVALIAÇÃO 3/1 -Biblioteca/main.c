#include <stdio.h>
#include <stdlib.h>

void organizaVetor(int *,int);

void ordenaVetor(int *vetor, int n){
	int i, j, aux, menor;
	
	for(i = 0; i < n; i++){
		menor = i;
		for(j = i+1; j < n; j++)
			if(vetor[j] < vetor[menor]) menor = j;		
		aux = vetor[i];
		vetor[i] = vetor[menor];
		vetor[menor] = aux;
	}
}

int main(int argc, char *argv[]) {
	int i,n,leitor=1;
	printf("Informe número de livros a serem ordenadas e depois os códigos dos livros\nInforme número MENOR/IGUAL a 0 para sair\n");
	
	do{
			scanf("%d",&leitor);
			if (leitor <= 0)
			 break;		 
			n=leitor;
			int vetor [n];
			for (i=0;i<n;i++){
				scanf("%d",&vetor[i]);
			}
			ordenaVetor(vetor,n);

			printf("\n Códigos Ordenados: \n");
			for (i=0;i<n;i++){
				printf("|%04d|\n", vetor[i]);	
			}
			system("pause");
			system("cls");
			printf("Informe número de livros a serem ordenadas e depois os códigos dos livros\nInforme número MENOR/IGUAL a 0 para sair\n");
	}while(leitor >= 0);
	return 0;
}



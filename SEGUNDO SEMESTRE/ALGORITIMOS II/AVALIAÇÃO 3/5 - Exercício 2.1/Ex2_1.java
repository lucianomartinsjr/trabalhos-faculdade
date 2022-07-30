package lib;

import java.util.Random;

public class Ex2_1 {
	public static void main(String[] args) {
		//gerador para gerar números aleatórios
		Random gerador = new Random();
		
		//vetor inicial
		Integer vetorPrimario[] = new Integer[10];
		//qtd de casas que serão excluidas
		Integer qtdCasasDaDivisaoDoTamanhoDoVetor = vetorPrimario.length / 2;
		//criando o vetor que ira armazenar os números excluidos
		Integer vetorSecundario[] = new Integer[qtdCasasDaDivisaoDoTamanhoDoVetor];
		//criando o vetor final com um tamanho dinamico
		Integer vetorFinal[] = new Integer[vetorPrimario.length - qtdCasasDaDivisaoDoTamanhoDoVetor];
		
		//preenchendo o vetor principal
		System.out.println("Vetor inicial");
		for(int i = 0; i < vetorPrimario.length; i++) {
			vetorPrimario[i] = gerador.nextInt(10);
			System.out.print(vetorPrimario[i] + " | ");
		}
		//pulando uma linha no console
		System.out.println();
		
		//preenchendo o vetor secundario com os elementos que não serão utilizado
		System.out.println("Vetor secundario");
		for(int i = 0; i < qtdCasasDaDivisaoDoTamanhoDoVetor; i++) {
			vetorSecundario[i] = vetorPrimario[i];
			System.out.print(vetorSecundario[i] + " | ");
		}
		//pulando uma linha no console
		System.out.println();
		
		//preenchendo o vetor final com as casas finais do vetor inicial
		System.out.println("Vetor final");
		for(int i = 0; i < vetorFinal.length; i++) {
			vetorFinal[i] = vetorPrimario[qtdCasasDaDivisaoDoTamanhoDoVetor];
			System.out.print(vetorFinal[i] + " | ");
			qtdCasasDaDivisaoDoTamanhoDoVetor++;
		}
	}

}
import java.util.Scanner;
public class atvd4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[10];
        int[] Y = new int[10];
		int i,ia;
		
		for(i = 0; i < 10; i++){
			System.out.printf("\nInforme um valor para o elemento X: ");
			X[i] = sc.nextInt();
			
			for(ia = 0; ia < 10; ia++){
				if(i != ia){
					while(X[i] == X[ia]){
						System.out.println("Número já inserido!");
					    System.out.print("Informe outro número para X: ");
					    X[i] = sc.nextInt();
					}
				}
			}
		}
		for(i = 0; i < 10; i++){
			System.out.printf("\nInforme um valor para o elemento Y: ");
			Y[i] = sc.nextInt();
			
			for(ia = 0; ia < 10; ia++){
				if(i != ia){
					while(Y[i] == Y[ia]){
						System.out.println("Número já inserido!");
					    System.out.print("Informe outro número para Y: ");
					    Y[i] = sc.nextInt();
					}
				}
			}
		}
		System.out.println("\nOs número que intersectam os vetores X e Y é: ");
		System.out.print("");
		for(i = 0; i < 10; i++){
			for(ia = 0; ia < 10; ia++){
				if(X[i] == Y[ia]){
				    System.out.print(X[i]+" ");
				}
			}
		}
	}
}
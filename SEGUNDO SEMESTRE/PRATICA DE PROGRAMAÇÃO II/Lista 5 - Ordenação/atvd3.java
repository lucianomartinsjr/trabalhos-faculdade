public class atvd3 {
    public static void main(String[] args) {
    int []vetor = {82, 50, 71, 63, 85, 43, 39, 97, 14};
    int aux,min;

        for (int i = 0; i <vetor.length - 1; i++) 
        {
            min = i;
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[j] < vetor[min])
                        min = j;       
                }
                aux = vetor[min];
                vetor[min] = vetor[i];
                vetor[i] = aux;
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    for(int ij=0; ij < vetor.length; ij++){
                        System.out.print(vetor[ij]+" " );
                    } 
                    System.out.println("");        
                
        }

        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-= Vetor ORDENADO =-=-=-=-=-=-=-=-=-");
        for(int i=0; i < vetor.length; i++){
            System.out.print(vetor[i]+" " );
        }    
    }  
}

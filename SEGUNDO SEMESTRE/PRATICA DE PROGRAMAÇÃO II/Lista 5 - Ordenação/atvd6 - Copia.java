import java.util.Scanner
public class prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);     
        char chave;
        int j,n;

        System.out.print("Deseja informar quantos caracteres : ");
            n = sc.nextInt();
        
        char []v = {n}; 
        
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.next().charAt(0);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=VETOR DESORDENADO=-=-=-=-=-=-=-=-=-");
        for(int i=0; i < v.length; i++){
            System.out.print(v[i]+" " );
        }

        System.out.println("");
        for(int i = 1;i< v.length; i++){
            chave = v[i];
            j = i - 1;

            while (j >= 0 && chave < v[j]) 
                {
                    v[j + 1] = v[j];
                    j--;
                }

            v[j + 1] = chave;

            }

        System.out.println("-=-=-=-=-=-=-=-=-=VETOR ORDENADO=-=-=-=-=-=-=-=-=-");
        for(int i=0; i < v.length; i++){
            System.out.print(v[i]+" " );
        }
    
    } 
}

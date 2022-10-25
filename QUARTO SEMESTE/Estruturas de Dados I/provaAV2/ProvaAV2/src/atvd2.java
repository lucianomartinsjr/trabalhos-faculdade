
import java.io.IOException;
import java.util.*;
public class atvd2 {
    public static ArrayList  lista = new ArrayList<>();
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) throws Exception {
        
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.print("a,b) ");
        imprimeLista(lista);
       

        lista.add(lista.size(),14);
        System.out.print("\nc) ");
        imprimeLista(lista);

        System.out.print("\nd) Informe um numero para adicionar a lista: ");
        int num = sc.nextInt();

        lista.add(lista.size(),num);

        System.out.print("Nova lista com o numero informado: ");
        imprimeLista(lista);

        System.out.print("\ne) ");
        procuraEmLista();

    }

    public static void imprimeLista(ArrayList lista) throws Exception { 
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i)+" ");
        }
    }

    public static void procuraEmLista() throws Exception { 

        System.out.print("Informe um numero: ");
        int numInformado = sc.nextInt();
        boolean find = false;

        for(int i = 0; i < lista.size(); i++){
            if((int)lista.get(i) == numInformado){
                find = true;
                System.out.println("Valor encontrado na posição: " + i);
            }
            
        }

        if(find == false)
        System.out.println("Valor nao esta na lista.");
        
    }

}

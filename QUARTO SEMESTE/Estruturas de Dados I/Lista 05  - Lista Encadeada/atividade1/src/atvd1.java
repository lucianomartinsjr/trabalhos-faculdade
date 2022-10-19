import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class atvd1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Contatos contato = new Contatos();
        Queue<String> fila = new LinkedList<String>();
        String texto;
        int opcao;

        do{

        System.out.println("=-=-= Menu =-=-=");
        System.out.println("1 - Inserir Contato. ");
        System.out.println("2 - Visualizar proximo contato. ");
        System.out.println("0 - Sair.");
        System.out.print("Informe a opção: ");
        opcao = sc.nextInt();
        System.out.println();

        
        switch (opcao){
            case 1:
            System.out.print("Informe o nome do contato: ");
            sc.nextLine();
            String nome = sc.nextLine();
            texto = nome;
    
            System.out.print("Informe o numero do contato: ");
            String numero = sc.nextLine();
            System.out.println();

            texto = "Nome: " + nome + "\nNumero: " + numero;
            
            fila.add(texto);
            
            break;

            case 2:


            if ( fila.size() == 0){
                System.out.println("Lista de contatos Vazia");
                System.out.println();
            }else{
                System.out.println(fila.poll());
                System.out.println();
            }
            
            case 0:
            break;
            
            default:
            System.out.println("Opção Invalida:");
            break;
        };
        
        }while(opcao != 0);
    }
    

    
}
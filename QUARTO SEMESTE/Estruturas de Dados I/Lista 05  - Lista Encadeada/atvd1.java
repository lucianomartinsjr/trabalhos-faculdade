import java.util.*;

class atvd1{
    public static void main(String[] args) {
        
        do
        Menu();
        while(Menu()!= 0);
    }
    
    public static int Menu(){
        Scanner sc = new Scanner(System.in); 
        Contatos contato = new Contatos();
        Queue fila = new LinkedList();

        int opcao = 3;
        System.out.println("=-=-= Menu =-=-=");
        System.out.println("1 - Inserir Contato ");
        System.out.println("2 - Visualizar proximo contato");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção:");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
            System.out.print("Informe o nome do contato");
            contato.setNome(sc.nextLine());
            System.out.print("Informe o numero do contato");
            contato.setNumero(sc.nextLine());
            fila.add(contato.toString());
                break;
            case 2:
                System.out.println(fila.poll());
            case 0:
                break;

            default:
            System.out.println("Opção Invalida:");
                break;
        };

        return opcao;
    }

    public class Contatos{
        private String nome;
        private String numero;

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String toString(){
            return "Nome: " + nome + "\nNumero: " + numero;
        }
    }

    public static String inserirContato(){
        String contato;
        System.out.print("Informe o nome do contato");
        contatos.setNome(sc.nextLine());
        System.out.print("Informe o nunero do contato");
        contatos.setNumero(sc.nextLine());
        return contato;
        
        
    }   
}
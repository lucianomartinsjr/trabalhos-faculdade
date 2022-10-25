import java.util.*;
import java.io.IOException;

public class atvd1 {
    public static Scanner sc = new Scanner(System.in);
    public static LinkedList lista = new LinkedList<>();

    public static void main(String [] args) throws Exception {
        int opcao1 = 5;

        while ( opcao1 != 0){
            
            opcao1 = menu();

            switch (opcao1){
                case 1:
                    adicionarItem();
                break;

                case 2:
                    verificaQntdNos();
                break;

                case 3:
                    verificaMaiores();
                break;

                case 4:
                System.out.println("Informe um número a remover da lista: ");
                String sNumero = sc.nextLine();
                    removerNumero(sNumero);
                break;
                
                case 0:
                    System.out.println("Encerrando o algoritimo.");
                break;
                
                default:
                    System.out.println("\n\n - Opção Invalida: - \n\n");
                break;
            };
            
        };
    }

    public static int menu(){
        System.out.println("=-=-= Menu =-=-=");
        System.out.println("1 - Inserir um numero na lista. ");
        System.out.println("2 - Calcular o numero de nós na lista. ");
        System.out.println("3 - Informar um numero para verificar quantos maiores há na lista . ");
        System.out.println("4 - Remover todas as ocorrencias do numero infomado e imprimir a lista com os valores restantes. ");
        System.out.println("\n0 - Sair.");
        System.out.print("\n Informe a opção: ");

        String sOpcao = sc.nextLine();
        int opcao = Integer.valueOf(sOpcao);
        clearConsole();

        return opcao;
        
    }
 
    public static void verificaQntdNos(){
        if ( lista.size() == 0){
            System.out.println("\n\n - Lista Vazia - \n\n");
            System.out.println();
        }else{
            System.out.println("\n\n - Há "+lista.size()+" nós em sua lista. -\n\n");
            System.out.println();
        }
    }

    public static void verificaMaiores(){
        System.out.print("Informe um número para verificar a quantidade de maiores que ele há na lista: ");
        String n = sc.nextLine();
        int numero = Integer.valueOf(n);
        int qntdMaior = 0;
        for(int i = 0; i<lista.size(); i++){
                if (Integer.valueOf((String)lista.get(i)) > numero)
                    qntdMaior++;
        }
        
        clearConsole();
        System.out.printf("\n\n - Houveram %d ocorrencias maiores que o numero %d na lista.\n\n -",qntdMaior,numero);
    }

    public static void removerNumero(String sNumero){
        
        if(lista.contains(sNumero)){
            lista.remove(sNumero);
            removerNumero(sNumero);
        }
        
        clearConsole();
        imprimeLista();

    }

    public static void imprimeLista(){
        System.out.println("\n\n");
        if ( lista.size() == 0){
            System.out.println("- Lista Vazia -");
            System.out.println();
        }else{  
            for(int i = 0; i<lista.size(); i++){
                System.out.print((String)lista.get(i)+" ");
            }    
        }
        System.out.println("\n\n");
    }

    public static void adicionarItem(){
        System.out.print("Informe o numero a ser adicionado: ");
        String item = sc.nextLine();
        lista.add(item);
        clearConsole();
    }

    public static void clearConsole(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}

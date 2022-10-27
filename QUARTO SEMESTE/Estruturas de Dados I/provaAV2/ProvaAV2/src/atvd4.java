import java.util.*;
import java.io.IOException;

public class atvd4 {
    
    public static Scanner sc = new Scanner(System.in);
    public static Queue filaDeImpressao = new LinkedList<>();
    public static Queue<Integer> qntdFolhasImpressao = new LinkedList<Integer>();
    public static int qntdFolhasTotal;
    
    public static void main(String[] args) throws Exception {
        int opcao1 = 5;

        while ( opcao1 != 0){
            
            opcao1 = menu();

            switch (opcao1){
                case 1:
                    adicionarImpressao();
                break;

                case 2:
                     verificaFilaImpressao();
                break;

                case 3:
                     imprimirDocumentos();
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

        int opcao;
        String sOpcao = "";



        do {
            
            System.out.println("\t=-=-= Menu =-=-=");
            System.out.println("1 - Adicionar uma Impressao. ");
            System.out.println("2 - Verificar fila de impressão. ");
            System.out.println("3 - Imprimir Documentos. ");
            System.out.println("\n0 - Sair.");
            System.out.print("\n Informe a opção: ");
                sOpcao = sc.nextLine();

            clearConsole();

        }while (sOpcao.equals(""));

        opcao = Integer.valueOf(sOpcao);
            clearConsole();

        return opcao;
        
    }

    public static void adicionarImpressao() throws InterruptedException{
        int qntdFolhas;
        System.out.print("Informe o nome do documento para impressao: ");
        String nomeImpressao = sc.nextLine();

        System.out.print("Informe a quantidade de paginas a serem impressas: ");
        String sQntdFolhas = sc.nextLine();

            qntdFolhas = Integer.valueOf(sQntdFolhas);

        filaDeImpressao.add(nomeImpressao);
        qntdFolhasImpressao.add(qntdFolhas);
      
        qntdFolhasTotal += qntdFolhas;

            clearConsole();
            System.out.printf("\n Documento Adicionado com Sucesso.\n\n\t - Retornando ao menu. -");
                Thread.sleep( 800 );
            clearConsole();

    }

    public static void verificaFilaImpressao(){
        int qntdDocumentos = filaDeImpressao.size();

        if ( filaDeImpressao.size() == 0){

            System.out.println("\n\n - Fila de Impressão está vazia - \n\n");
            System.out.println();
            
        }else{

            System.out.printf("\n\n - Há %d documentos em sua lista | %d Paginas no total\n",qntdDocumentos,qntdFolhasTotal);
            System.out.println();

        }
    }

    public static void imprimirDocumentos() throws InterruptedException {

        if ( filaDeImpressao.size() == 0){
            System.out.println("\n\n - Fila de Impressão está vazia - \n\n");
            System.out.println();

        }else{
            
            int FolhasFilaImpressao = qntdFolhasImpressao.peek();

                 for(int j = 0 ; j < FolhasFilaImpressao; j++){ 
                    System.out.println("Imprimindo documento - "+ filaDeImpressao.peek() +" - "+ (j+1) +"/"+FolhasFilaImpressao);
                    Thread.sleep( 1000 );
                }

                filaDeImpressao.poll();
                qntdFolhasImpressao.poll();

                System.out.println("");   

                imprimirDocumentos();

        }
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

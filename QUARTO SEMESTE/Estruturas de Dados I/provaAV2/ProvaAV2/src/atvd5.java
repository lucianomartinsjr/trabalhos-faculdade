import java.util.*;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

public class atvd5 {
    public static Scanner sc = new Scanner(System.in);
    public static LinkedBlockingQueue<String> filaDeEspera = new LinkedBlockingQueue<String>(10);

    public static void main(String[] args) throws Exception {
       
        int opcao1 = 5;

        while ( opcao1 != 0){
            
            opcao1 = menu();

            switch (opcao1){
                case 1:
                    adicionarPaciente();
                break;

                case 2:
                    chamarProximoPaciente();
                break;

                case 3:
                    verificarFiladeEspera();
                break;

                case 4:
                    System.out.println("Proximo paciente a ser atendido é: "+ filaDeEspera.peek());
                break;

                case 5:
                     System.out.println("Há "+filaDeEspera.size()+" pacientes na fila de espera.");
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
            System.out.println("1 - Inserir Paciente ");
            System.out.println("2 - Chamar Proximo Paciente ");
            System.out.println("3 - Verificar fila de espera. ");
            System.out.println("4 - Verificar proximo paciente a ser atendido.");
            System.out.println("5 - Verificar quantidades de pacientes na fila de espera.");
            System.out.println("\n0 - Sair.");
            System.out.print("\n Informe a opcao: ");
                sOpcao = sc.nextLine();

            clearConsole();

        }while (sOpcao.equals(""));

        opcao = Integer.valueOf(sOpcao);
            clearConsole();

        return opcao;
        
    }

    public static void adicionarPaciente() throws InterruptedException{

        if(filaDeEspera.size() == 10 ){
            System.out.println("Fila de espera esta cheia.");    

        } else {

            System.out.print("\nInforme o nome do Paciente: ");
            String nomePaciente = sc.nextLine();
           
            filaDeEspera.add(nomePaciente);

                clearConsole();
                System.out.printf("\n Adicionado com Sucesso.\n\n\t - Retornando ao menu. -");
                    Thread.sleep( 800 );
                clearConsole();
        }
            

    }

    public static void chamarProximoPaciente() throws InterruptedException {

        if ( filaDeEspera.size() == 0){
            System.out.println("\n\n - Não há pacientes para serem chamados. - \n\n");
            System.out.println();
        }else{
            System.out.print("Solicite que o seguinte paciente se dirija ao consutório: "+filaDeEspera.poll());
            System.out.println();
        }

    }

    public static void verificarFiladeEspera() throws InterruptedException {

        if(filaDeEspera.isEmpty()==true)
            System.out.println("Fila de espera esta vazia.");
        else if(filaDeEspera.size()== 10)
            System.out.println("Fila de espera esta cheia. ");
        else
            System.out.println("Restam "+filaDeEspera.remainingCapacity()+" vagas na fila de espera. ");

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

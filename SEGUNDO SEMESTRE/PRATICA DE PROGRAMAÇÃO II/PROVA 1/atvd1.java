import java.util.Scanner;
    public class atvd1{
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            char questoes[] = new char [15];
            char gbrt[] = new char [15];
            int n_matric;

            System.out.print("Informe o numero de alunos na sala: ");
            n_matric = sc.nextInt();
        
            System.out.println("\nAs alternativas sao identificadas por A, B, C, D e E.");
            System.out.println("Informe o Gabarito da prova");
            for (int i = 0; i < 15; i++){
                System.out.print((i+1)+" : ");
                gbrt[i] = sc.next().charAt(0);
            }
     
            String alnsmat[] = new String [n_matric];

            for (int i = 0; i < n_matric; i++){
                System.out.print("\nInforme a matricula do aluno: ");
                alnsmat[i] = sc.next();
                    System.out.println("\nAs alternativas sao identificadas por A, B, C, D e E.");

                    for (int j = 0; j < 15;j++){
                        System.out.print("Informe a resposta para a questão "+(j+1)+" : ");
                        questoes[j] = sc.next().charAt(0);
                    } 
            } 

            int n_acertos[] = new int [n_matric];
            
                System.out.println("\nGABARITO: ");
            for ( int ia = 0; ia < 15; ia++ ){
                System.out.println((ia+1)+" = "+ gbrt[ia]);                        
            } 
            
                for (int j = 0; j < n_matric; j++)
                    {
                        for (int ib = 0; ib < 15; ib++){
                            if(questoes[j] == gbrt[ib])
                            n_acertos[j] = n_acertos[j]+1;   
                        }
                
                        System.out.println("O aluno matricula "+alnsmat[j]+" acertou "+ n_acertos[j]);
                        System.out.println("Seu gabarito foi: ");
                            for (int ic = 0; ic < 15; ic++){
                                System.out.println((ic+1)+" = "+questoes[ic]);   
                            }
                        
                    }
        }
    }
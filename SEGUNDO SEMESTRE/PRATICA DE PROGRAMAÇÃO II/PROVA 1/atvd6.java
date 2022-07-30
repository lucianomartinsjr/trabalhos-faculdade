import java.util.Scanner;
public class atvd6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nome[] = new String[5];
        float salario[] = new float[5];
        int t_serv[] = new int[5];

        for(int i=0; i<5;i++)
            {
                System.out.print("\nInforme o nome do funcionario: ");
                nome[i] = sc.next();

                System.out.print("Informe o salario: ");
                salario[i] = sc.nextFloat();

                System.out.print("Ha quantos anos esta no servio : ");
                t_serv[i] = sc.nextInt();
            }

        
        for(int j=0; j<5; j++)
            {
                if(t_serv[j] <= 5 && salario[j] >= 800 ){
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("Nao recebera aumento: ");  
                    System.out.println(nome[j]);
            }
            
        for(int i=0; i<5; i++)
            {
                double aumento = 0;
                if(t_serv[i] > 5 && salario[i] < 800 )
                    {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("Tempo de servico + Salario = +35%:     ");
                        aumento = salario[i] * 0.35;
                        salario[i] += aumento;
                        System.out.println(nome[i]+" novo Salario: "+salario[i]);
                    } 
                    else if (t_serv[i] > 5)
                        {
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("Somente Tempo de servico = +25% ");
                            aumento = salario[i] * 0.35;
                            salario[i] += aumento;
                            System.out.println(nome[i]+" novo Salario: "+salario[i]);
                        }
                    else if(salario[i] < 800 )
                        {
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("Somente Tempo de servico = +15% ");
                            aumento = salario[i] * 0.15;
                            salario[i] += aumento;
                            System.out.println(nome[i]+" novo Salario: "+salario[i]);
                        }
            }
        }
    }
}

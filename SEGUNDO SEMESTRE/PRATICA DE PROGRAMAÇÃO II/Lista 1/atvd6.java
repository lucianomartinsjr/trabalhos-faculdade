import java.util.Scanner;
public class atvd6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        Double divida,valorfinal= 0.0,valorparc=0.0,porcjuros = 0.0 ,valorjuros=0.0;
        int quantpar = 1;


        System.out.print("- Informe o valor da divida 0 para parar o algoritimo -\n");
        
        do{

            System.out.print("\nInforme o valor da divida: ");
            divida = sc.nextDouble();

                if(divida < 0) {
                    
                    do{
                        System.out.print("\nValor não pode ser menor que 0 ");
                        System.out.print("\nInforme o valor da divida: ");
                        divida = sc.nextDouble();

                    }while(divida < 0);

                } 
                else
                    {
                    if(divida == 0) 
                        System.out.println(" Valor informado foi 0, finalizando.");             
                    else{
                        System.out.println("\n| Valor da Divida | Valor dos Juros | Qnt de parcelas | Valor da Parcela | ");
                        
                            for (int cont = 0 ; cont <= 12 ; cont = cont + 3) 
                            {
                                if (cont == 0){
                                    porcjuros = 0.0;
                                    quantpar = 1;
                                } 

                                if (cont == 3){
                                    porcjuros = 0.1;
                                    quantpar = 3;
                                }
                                
                                if (cont == 6){
                                    porcjuros = 0.15;
                                    quantpar = 6;
                                }
                            
                                if (cont == 9){
                                    porcjuros = 0.2;
                                    quantpar = 9;
                                }
                                
                                if (cont == 12){ 
                                    porcjuros = 0.25;
                                    quantpar = 12;
                                }

                                    valorjuros = divida * porcjuros;
                                    valorfinal = divida + valorjuros;
                                    valorparc = valorfinal/ quantpar;

                                System.out.printf("|     %.2f     |        %.2f         |       %d       |        %.2f        | \n",valorfinal,valorjuros,quantpar,valorparc);
                            }       
                         }
                    }     
        }while(divida != 0);
    }
}


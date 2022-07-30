import java.util.*;
public class atvd8 
{
    public static void main(String args[])
    {
  
        
        Random ran = new Random();    
        Scanner sc = new Scanner(System.in);
        
        int numero;     
    
        int nxt = ran.nextInt(10);
        
        if (nxt % 2 == 0) 
          System.out.println("\nO numero Aleatorio e PAR e esta entre 0 e 10");
        else
          System.out.println("\nO numero Aleatorio e IMPAR e esta entre 0 e 10");
      
        System.out.print("\nInforme o seu palpite do numero: ");  
        numero  = sc.nextInt();    
        if (numero == nxt)  
          System.out.println("\nParabens, voce adivinhou o numero aleatorio: " + nxt);
        else
            {
                if(nxt < 5)
                {
                    System.out.println("\nO numero aleatorio e menor que 5.");
                    System.out.print("Informe novamente um numero: ");  
                    numero  = sc.nextInt();

                    if (numero == nxt)  
                    System.out.println("\nParabens, voce adivinhou o numero aleatorio: " + nxt);
                    else
                    System.out.println("\nQue pena, voce errou, o numero aleatorio entre 0 and 10 gerado foi: " + nxt);
                }
                else
                {
                    System.out.println("\nO numero aleatorio e maior que 5.");
                    System.out.print("Informe novamente um numero: "); 
                    numero  = sc.nextInt(); 
                    
                    if (numero == nxt)  
                    System.out.println("\nParabens, voce adivinhou o numero aleatorio: " + nxt);
                    else
                    System.out.println("\nQue pena, voce errou, o numero aleatorio entre 0 and 10 gerado foi: " + nxt);
        
                }

            }        
         
    }
}

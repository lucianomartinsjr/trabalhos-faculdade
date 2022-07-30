import java.util.*;
public class atvd3 
{
    public static void main(String args[])
    {
  
        
        Random ran = new Random();    
        Scanner sc = new Scanner(System.in);
        
        int numero;     
    
        int nxt = ran.nextInt(10);
        
        if (nxt % 2 == 0) 
          System.out.println("O numero Aleatorio e par e esta entre 0 e 10");
        else
          System.out.println("O numero Aleatorio e impar e esta entre 0 e 10");
      
        numero  = sc.nextInt();    
        
        if (numero == nxt)  
          System.out.println("Parabens, voce adivinhou o numero aleatorio: " + nxt);
        else        
         System.out.println("Que pena, voce errou, o numero aleatorio entre 0 and 10 gerado foi: " + nxt);
    }
}

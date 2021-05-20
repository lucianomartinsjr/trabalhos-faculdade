import java.util.Scanner;
public class atvd1{
   public static void main (String[]Args){
      System.out.print("\nInforme a nota do aluno: ");
      Scanner sc = new Scanner (System.in);
      float nota = sc.nextFloat();
      if(nota < 0 ){
           System.out.println("\nValores menores que zero não permitidos"); 
         }
         else{
            if(nota >= 20)
            {
               if (nota >= 60)
               { 
                  System.out.print("\n> Aluno Aprovado! <");
               }
               else
                {
                  System.out.print("\n> Aluno em recuperacao < ");
                }
            } 
            else {
               System.out.print("\n> Aluno reprovado por média< ");
            }
         }
   }
}
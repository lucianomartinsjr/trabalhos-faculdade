import java.util.Scanner;
    class atvd4{
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("\nInforme um valor de 1 a 7: ");
                int num = sc.nextInt();
            if((num < 1)||(num > 7))
                {
                    System.out.print("\nO Numero informado esta fora da faixa.");    
                }
            else{  
                    if(num == 1)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Domingo");
                    }
                    else if(num == 2)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Segunda"); 
                    }  
                    else if(num == 3)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Terça ");
                    }  
                    else if(num == 4)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Quarta ");
                    }  
                    else if(num == 5)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Quinta ");
                    }  
                    else if(num == 6)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Sexta ");
                    }  
                    else if(num == 7)
                    {
                        System.out.print("\n O dia correspondente a "+num+" e Sabado ");
                    } 
                }
        }
    }
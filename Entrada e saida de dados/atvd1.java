import java.util.Scanner;
public class atvd1{   
public static void main(String [] args){
double nota1,nota2,media;
Scanner sc = new Scanner(System.in); // aqui está criando o scanner com o nome de sc
System.out.print("Informe o nome do Aluno: ");
   String nome = sc.nextLine();
System.out.print("Informe a primeira nota: ");
   nota1 = sc.nextDouble(); // informando o valor da primeira nota
System.out.print("Informe a segunda nota : "); 
   nota2 = sc.nextDouble(); // informando o valor da segunda nota
   media=(nota1+nota2)/2; // realizando o calculo da media
System.out.printf("%nO aluno %s teve a media de: %.2f%n",nome,media);
}
 }
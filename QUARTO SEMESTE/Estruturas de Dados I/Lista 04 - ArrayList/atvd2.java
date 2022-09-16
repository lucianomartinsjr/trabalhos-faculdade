import java.util.*;
public class atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("informe uma frase: ");
        String texto = sc.nextLine();

        List<String> arrayFrase = Arrays.asList(texto.split("\\s+"));
        
        Collections.reverse(arrayFrase);
        
        arrayFrase.forEach(s -> {System.out.print(s); System.out.print(" ");});	

    }
}

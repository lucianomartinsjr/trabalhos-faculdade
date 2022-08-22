import javax.swing.JOptionPane;
import java.util.*;
public class atvd2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe um nome completo : ");
        List<String> conectores = Arrays.asList("e", "do", "da", "dos", "das", "de", "di", "du");
        
        StringBuilder iniciais = new StringBuilder();
        
        
        for (String parte: nome.split(" ")) {
            if (! conectores.contains(parte.toLowerCase())) { 
                iniciais.append(Character.toUpperCase(parte.charAt(0)));
            }
        }

        System.out.println("Iniciais: " + iniciais.toString());

        }
    }

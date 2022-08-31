import java.util.Scanner;
class atvd2Prof {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nome;
        String abreviacao = "";
        String conectores[] = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        boolean chave;


        System.out.print("Informe o nome :");
        nome = sc.nextLine();
        nome = nome.toLowerCase();
        String parts[]=nome.split("\\s+");

        for(int i=0; i<parts.length; i++) {
            chave = true;
            for(int j=0; j<conectores.length; j++) {
                if(parts[i].equalsIgnoreCase(conectores[j])) {
                    chave=false;
                }
            }
            
            if(chave == true){
                abreviacao = abreviacao+parts[i].charAt(0);
            }
        }
        abreviacao = abreviacao.toUpperCase();
        System.out.println(abreviacao);
    }
}
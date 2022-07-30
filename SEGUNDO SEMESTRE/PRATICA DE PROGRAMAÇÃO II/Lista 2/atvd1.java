import java.util.Scanner;

public class atvd1 {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

        String maiorEspec = "", menorAud = "";

        float canal = 0, 
            num,
            total,
            cultura = 0,
            sbt = 0,
            globo = 0,
            record = 0,
            mtv = 0, 
            tva = 0,
            manchete = 0,
            bandeirantes = 0;
        
            double porcCultura , porcSbt , porcGlobo , porcRecord , porcMtv , porcTva , porcManchete , porcBandeirantes;

        while (canal != 10) {
            System.out.println("Qual canal está assistindo na casa ?");
            System.out.println("1. Cultura");
            System.out.println("2. SBT");
            System.out.println("3. Globo");
            System.out.println("4. Record");
            System.out.println("5. MTV");
            System.out.println("6. TVA");
            System.out.println("7. Manchete");
            System.out.println("8. Bandeirantes");
            System.out.println("9. Está com a TV desligada");
            System.out.println("10. Fim");
            canal = sc.nextInt();

            if (canal != 10) {
                System.out.println("Quantas pessoas estavam assistindo: ");
                num = sc.nextInt();
    
                if (canal == 1) cultura++;
                if (canal == 2) sbt++;
                if (canal == 3) globo++;
                if (canal == 4) record++;
                if (canal == 5) mtv++;
                if (canal == 6) tva++;
                if (canal == 7) manchete++;
                if (canal == 8) bandeirantes++;
            }
        } 

        total = cultura + sbt + globo + record + mtv + tva + manchete + bandeirantes;

        porcCultura = (cultura / total) * 100;
        porcSbt = (sbt / total) * 100;
        porcGlobo = (globo / total) * 100;
        porcRecord = (record / total) * 100;
        porcMtv = (mtv / total) * 100;
        porcTva = (tva / total) * 100;
        porcManchete = (manchete / total) * 100;
        porcBandeirantes = (bandeirantes / total) * 100;
    
        if ((cultura > sbt) && (cultura > globo) && (cultura > record) && (cultura > mtv) && (cultura > tva) && (cultura > manchete) && (cultura > bandeirantes)) maiorEspec = "Cultura";
    
        if ((cultura < sbt) && (cultura < globo) && (cultura < record) && (cultura < mtv) && (cultura < tva) && (cultura < manchete) && (cultura < bandeirantes)) menorAud = "Cultura";
    
        if ((sbt > cultura) && (sbt > globo) && (sbt > record) && (sbt > mtv) && (sbt > tva) && (sbt > manchete) && (sbt > bandeirantes)) maiorEspec = "SBT";
    
        if ((sbt < cultura) && (sbt < globo) && (sbt < record) && (sbt < mtv) && (sbt < tva) && (sbt < manchete) && (sbt < bandeirantes)) menorAud = "SBT";
    
        if ((globo > sbt) && (globo > cultura) && (globo > record) && (globo > mtv) && (globo > tva) && (globo > manchete) && (globo > bandeirantes)) maiorEspec = "Globo";
    
        if ((globo < sbt) && (globo < cultura) && (globo < record) && (globo < mtv) && (globo < tva) && (globo < manchete) && (globo < bandeirantes)) menorAud = "Globo";
    
        if ((record > sbt) && (record > globo) && (record > cultura) && (record > mtv) && (record > tva) && (record > manchete) && (record > bandeirantes)) maiorEspec = "Record";
    
        if ((record < sbt) && (record < globo) && (record < cultura) && (record < mtv) && (record < tva) && (record < manchete) && (record < bandeirantes)) menorAud = "Record";
    
        if ((mtv > sbt) && (mtv > globo) && (mtv > record) && (mtv > cultura) && (mtv > tva) && (mtv > manchete) && (mtv > bandeirantes)) maiorEspec = "MTV";
    
        if ((mtv < sbt) && (mtv < globo) && (mtv < record) && (mtv < cultura) && (mtv < tva) && (mtv < manchete) && (mtv < bandeirantes)) menorAud = "MTV";
    
        if ((tva > sbt) && (tva > globo) && (tva > record) && (tva > mtv) && (tva > cultura) && (tva > manchete) && (tva > bandeirantes)) maiorEspec = "TVA";
    
        if ((tva < sbt) && (tva < globo) && (tva < record) && (tva < mtv) && (tva < cultura) && (tva < manchete) && (tva < bandeirantes)) menorAud = "TVA";
    
        if ((manchete > sbt) && (manchete > globo) && (manchete > record) && (manchete > mtv) && (manchete > tva) && (manchete > cultura) && (manchete > bandeirantes)) maiorEspec = "Manchete";
    
        if ((manchete < sbt) && (manchete < globo) && (manchete < record) && (manchete < mtv) && (manchete < tva) && (manchete < cultura) && (manchete < bandeirantes)) menorAud = "Manchete";
    
        if ((bandeirantes > sbt) && (bandeirantes > globo) && (bandeirantes > record) && (bandeirantes > mtv) && (bandeirantes > tva) && (bandeirantes > manchete) && (bandeirantes > cultura)) maiorEspec = "Bandeirantes";
    
        if ((bandeirantes < sbt) && (bandeirantes < globo) && (bandeirantes < record) && (bandeirantes < mtv) && (bandeirantes < tva) && (bandeirantes < manchete) && (bandeirantes < cultura)) menorAud = "Bandeirantes";
    
        System.out.println("Porgentagens de audiência");
        System.out.println("Cultura:" + porcCultura);
        System.out.println("SBT:" + porcSbt);
        System.out.println("Globo:" + porcGlobo);
        System.out.println("Record:" + porcRecord);
        System.out.println("MTV:" + porcMtv);
        System.out.println("TVA:" + porcTva);
        System.out.println("Manchete:" + porcManchete);
        System.out.println("bandeirantes:" + porcBandeirantes);
        System.out.println(" ");
        System.out.println("Maior audiência:" + maiorEspec);
        System.out.println("Menor audiência:" + menorAud);
    }
}

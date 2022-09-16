package aulas.exer;
import java.util.Scanner;

public class prob1_ifelse {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String dataF, dataS;
        
        dataF = scan.next();
        dataS = scan.next();
        scan.close();

        String[] data1 = dataF.split("/");
        String[] data2 = dataS.split("/");

        int dia1,mes1,ano1,dia2,mes2,ano2;
        dia1 = Integer.parseInt(data1[0]);
        mes1 = Integer.parseInt(data1[1]);
        ano1 = Integer.parseInt(data1[2]);
        dia2 = Integer.parseInt(data2[0]);
        mes2 = Integer.parseInt(data2[1]);
        ano2 = Integer.parseInt(data2[2]);

        if(ano1>ano2){
            System.out.println("A data " + dataF + " é cronologicamente maior");
        }
        else{
            if(mes1>mes2){
                System.out.println("A data " + dataF + " é cronologicamente maior");
            }
            else{
                if(dia1>dia2){
                    System.out.println("A data " + dataF + " é cronologicamente maior");
                }
                else{
                    System.out.println("A data " + dataS + " é cronologicamente maior");
                }
            }
        }
        
    }
}

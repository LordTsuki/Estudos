import java.util.Scanner;

public class ac1
{
    public static void main(String[] args) throws Exception
    {
        Scanner entrada = new Scanner(System.in);
        String lin1,lin2;        

        System.out.print(">>");
        lin1 = entrada.nextLine();

        System.out.println("Digite os comandos agora");
        System.out.print(">>");
        lin2 = entrada.nextLine();
        
        entrada.close();

        String[] line1 = lin1.split("-");
        for (int index = 0; index < line1.length; index++)
        {
            System.out.println(line1[0]);
            System.out.println(line1[1]);
            System.out.println(line1[2]);
        }
        String[] line2 = lin2.split("-");

        int nEst, nCom, estEsp, i, nEsp=0;

        nEst = Integer.parseInt(line1[0]);
        nCom = Integer.parseInt(line1[1]);
        estEsp = Integer.parseInt(line1[2]);

        int[] Line2 = new int[(nCom-1)];
        
        for(int j=0;j<nCom;j++)
        {
            Line2[j] = Integer.parseInt(line2[j]);
        }
        
        for(i = 0;i<nCom;i++)
        {
            int estAtual=1;

            if(Line2[i] == 1)       
                estAtual += 1;
            if(Line2[i] == -1)
                estAtual -= 1;
            
            if(estAtual == estEsp)
                nEsp++;
            if(estAtual>nEst)
                estAtual = 1;
            if(estAtual==0)
                estAtual = nEst; 

        }

        System.out.println("O robô passou " + nEsp + " vezes pelo ponto mais próximo da área devastada");
    }
}

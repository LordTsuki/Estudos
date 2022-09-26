import java.util.Scanner;

public class robo2
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        
        final int[] linha1 = new int[3];

        for(int k = 0; k < 3; k ++)
            linha1[k] = scan.nextInt();

        int nEst, nCom, estEsp, nEsp = 0, estAtual = 1;
        nEst = linha1[0];
        nCom = linha1[1];
        estEsp = linha1[2];

        final int[] linha2 = new int[nCom];

        for(int h = 0; h < nCom; h++)
            linha2[h] = scan.nextInt();
        scan.close()
    }
}
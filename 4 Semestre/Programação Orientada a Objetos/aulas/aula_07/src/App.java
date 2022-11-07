package aulas.aula_07.src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scan =new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        int vetor[] = new int[5];
        String continuar;
        
        int i = 0;
        do
        {
            System.out.println("Digite o dado a ser analisado");
            vetor[i] = scan.nextInt();

            System.out.println("Deseja continuar (s/n)");
            continuar = scanStr.nextLine();
            i++;
        }
        while( !continuar.equalsIgnoreCase("n"));

        scan.close();
        scanStr.close();
        for(int j = 0; j< vetor.length; j++)
        {
            System.out.println(vetor[j]);
        }
    }
}

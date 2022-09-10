import java.util.Scanner;

public class MediaSalarioFilhos 
{
    public static void main(String[] args) throws Exception
    {
        int medFil;
        double mSalario, medSal;
        Scanner scan = new Scanner(System.in);

        mSalario = salario;

        while(mSalario < salario)
        {
            System.out.print("Insira o valor do maior salário:");
                mSalario = scan.nextDouble();
            System.out.println("");
            System.out.print("Insira a média de filhos:");
                medFil = scan.nextInt();
            System.out.println("");
        
        }
        
        while(mSalario > 0)
        {
            System.out.print("Insira a média dos salários:");
            medSal = scan.nextDouble();
        }

        scan.close();
    }
}
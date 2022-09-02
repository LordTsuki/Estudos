import java.util.Scanner;

public class Aula_03_1
{
    public static void main(String[] args) throws Exception
    {
        int diadata1, diadata2, mesdata1, mesdata2, anodata1, anodata2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeira data");
        System.out.println("Defina o dia: ");
        diadata1 = entrada.nextInt();

        System.out.println("Defina o mes: ");
        mesdata1 = entrada.nextInt();

        System.out.println("Defina o ano: ");
        anodata1 = entrada.nextInt();

        System.out.println("Segunda data");
        System.out.println("Defina o dia: ");
        diadata2 = entrada.nextInt();

        System.out.println("Defina o mes: ");
        mesdata2 = entrada.nextInt();

        System.out.println("Defina o ano: ");
        anodata2 = entrada.nextInt();

        if (anodata1 < anodata2)
        {
            System.out.println("A data 2 é maior");
        }
        else if (anodata1 > anodata2)
        {
            System.out.println("A data 1 é maior");
        }
        else if (anodata1 == anodata2)
        {
            if (mesdata1 < mesdata2)
            {
                System.out.println("A data 2 é maior");
            }
            else if (mesdata1 > mesdata2)
            {
                System.out.println("A data 1 é maior");
            }
            else if (mesdata1 == mesdata2)
            {
                if (diadata1 < diadata2)
                {
                    System.out.println("A data 2 é maior");
                }
                else if (diadata1 > diadata2)
                {
                    System.out.println("A data 1 é maior");
                }
                else if (diadata1 == diadata2)
                {
                    System.out.println("As datas sao iguais");
                }
            }
        }
    }
}
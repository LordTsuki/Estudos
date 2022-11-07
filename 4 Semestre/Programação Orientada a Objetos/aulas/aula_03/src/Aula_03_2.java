package aulas.aula_03.src;
import java.util.Scanner;

public class Aula_03_2
{
    public static void main(String[] args) throws Exception
    {
        int cod;
        double salario;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira seu codigo: ");
        cod = scan.nextInt();

        System.out.print("Insira seu salario: ");
        salario = scan.nextDouble();
        scan.close();
        switch (cod) {
            case 1:
                salario*=1.5;
                System.out.println("O seu salario e de " + Math.round(salario));
                break;
            
            case 2:
                salario*=1.35;
                System.out.println("O seu salario e de " + Math.round(salario));
                break;

            case 3:
                salario*=1.2;
                System.out.println("O seu salario e de " + Math.round(salario));
                break;

            case 4:
                salario*=1.1;
                System.out.println("O seu salario e de " + Math.round(salario));
                break;

            case 5:
                salario*=1.0;
                System.out.println("O seu salario e de " + Math.round(salario));
                break;

            default:
                break;
        }
    }
}

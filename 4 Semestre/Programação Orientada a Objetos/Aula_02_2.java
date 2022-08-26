import java.util.Scanner;

public class Aula_02_2 
{
    public static void man(String[] args) throws Exception
    {
        String nome;
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        System.out.println("Nome lido = " + nome);
        System.out.println("Idade lida = " + idade);
    }    
}

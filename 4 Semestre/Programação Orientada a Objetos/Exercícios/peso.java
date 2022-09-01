package Exercícios;
import java.util.Scanner;

public class peso {
    public static void main(String[] args) throws Exception
    {
        double peso, pesogordo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu peso ? (em gramas) ");
        peso = entrada.nextDouble();

        pesogordo = peso*0.12;

        System.out.println("O seu peso se engordar 12% será de: " + (pesogordo + peso) + "gramas");

        entrada.close();
    }
    
}

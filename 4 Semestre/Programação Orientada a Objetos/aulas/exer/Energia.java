package aulas.exer;
//Sabe-se que 1 quilowatt de energia custa 1/500 avos do salário mínimo.
//Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residencia
//Calcule e mostre:
//O valor, em reais, de cada quilowatt
// O valor, em reais, a ser pago por essa residencia
// O valor, em reais, a ser pago com desconto de 15%

import java.util.Scanner;
public class Energia
{
    public static void main(String[] args) throws Exception
    {
        double salariominimo, valorquilo, valorpago, valorpagodesconto;
        int quilowatts;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        salariominimo = entrada.nextDouble();

        System.out.println("Digite a quantidade de quilowatts: ");
        quilowatts = entrada.nextInt();

        valorquilo = salariominimo / 500;
        valorpago = quilowatts * valorquilo;
        valorpagodesconto = valorpago - (valorpago * 15/100.0);

        System.out.println("O valor do quilowatt é de: " + (valorquilo));
        System.out.println("O valor da conta é de: " + (valorpago));
        System.out.println("O valor da conta com desconto é de: " + (valorpagodesconto));
    }
}

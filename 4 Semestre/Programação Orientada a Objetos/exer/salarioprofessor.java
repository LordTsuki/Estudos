package aulas.exer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class salarioprofessor {
    public static void main(String[] args) throws Exception
    {
        int NumeroAulas;
        double DescontoINSS, ValorHoraAula, ValorAula, salario, novosalario; 
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da hora aula ? ");
        ValorHoraAula = entrada.nextDouble();

        System.out.println("Quantas aulas foram dadas no mês ? ");
        NumeroAulas = entrada.nextInt();

        entrada.close();

        //Considerando que cada aula tem 50 minutos
            ValorAula = ValorHoraAula*5/6;
            DescontoINSS = 0;
            salario = ValorAula * NumeroAulas;

        if (salario <= 1212)
            DescontoINSS = 0.075;
        else if (salario > 1212 && salario <= 2427.36)
            DescontoINSS = 0.09;
        else if (salario > 2427.36 && salario <= 3641.03)
            DescontoINSS =  0.12;
        else if (salario > 3641.03)
            DescontoINSS = 0.14;

                novosalario = salario * (1-DescontoINSS);
                BigDecimal BD = new BigDecimal(novosalario).setScale(2, RoundingMode.HALF_EVEN);


        System.out.println("O seu salário será de:" + BD.doubleValue());
        System.out.println("O desconto do INSS é de:" + DescontoINSS);
        
    }
}

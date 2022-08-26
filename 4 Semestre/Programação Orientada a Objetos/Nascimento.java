//Construir um programa em Java que leia o ano de nascimento de João e o ano atual, calcule e mostre:
//Quantos anos João tem
//Quantos anos João terá em 2024

import java.util.Scanner;
public class Nascimento 
{
    public static void main(String[] args) throws Exception
    {
        int ano = 2022, anofuturo = 2024;
        int idade;
        boolean aniversario;

        Scanner entrada = new Scanner(System.in);
        {
            System.out.println("Que ano João nasceu?");
            idade = entrada.nextInt();

            System.out.println("O João já fez aniversário?");
            aniversario = entrada.nextBoolean();
            if(aniversario == false)
            {
                ano = ano-1;
                anofuturo = anofuturo-1;
            }
        }

        System.out.println("O João tem " + (ano-idade) + " anos de idade");
        System.out.println("O João terá " + (anofuturo-idade) + " em 2024");
    }
}

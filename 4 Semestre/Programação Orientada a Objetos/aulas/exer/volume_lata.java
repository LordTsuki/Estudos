package aulas.exer;

import java.util.Scanner;

public class volume_lata 
{
    public static void main(String[] args) throws Exception
    {
        float pi = 3.14159f;
        int raio, altura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Fala qual é o raio da lata de óleo meu fi: ");
        altura = entrada.nextInt();
        raio = entrada.nextInt();
        entrada.close();

        System.out.print("O volume da lata de óleo é de: " + (pi*raio*raio*altura));
    }    
}

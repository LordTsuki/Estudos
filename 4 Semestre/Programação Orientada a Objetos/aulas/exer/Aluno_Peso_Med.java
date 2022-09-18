package aulas.exer;

import java.util.Scanner;

public class Aluno_Peso_Med 
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan  = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite o nome:");
        a.setNome(scan.nextLine());

        System.out.println("Digite a altura:");
        a.setAlt(scan.nextFloat());

        System.out.println("Digite o peso:");
        a.setPeso(scan.nextFloat());

        scan.close();

        public void verificaIMC()
        {
            
        }
    }
}

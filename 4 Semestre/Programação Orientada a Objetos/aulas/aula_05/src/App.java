package aulas.aula_05.src;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Aluno a = new Aluno();

        Scanner scan = new Scanner(System.in);
        String nome, endereco, sexo, rg, curso;
        int idade;

        a.imprimir();

        Aluno a2 = new Aluno("Luciano", 48, "AAA", "Masculino", "123", "Computação");
        
        System.out.println("Digite o nome do aluno:");
        nome = scan.nextLine();
        System.out.println("Digite a idade do aluno:");
        idade = scan.nextInt();
        System.out.println("Digite o endereco do aluno:");
        endereco = scan.nextLine();
        System.out.println("Digite o sexo do aluno:");
        sexo = scan.nextLine();
        System.out.println("Digite o RG do aluno:");
        rg = scan.nextLine();
        System.out.println("Digite o curso do aluno:");
        curso = scan.nextLine();
        scan.close();

        a2.imprimir();
    }
}

package aulas.exercicios.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        Aula_04_1 p = new Aula_04_1();

        Scanner scan = new Scanner(System.in);
        
        p.setNome(scan.nextLine());
        p.setIdade(scan.nextInt());

        scan.close();

        System.out.println("Nome de p: " + p.getNome());
        System.out.println("Idade de p: " + p.getIdade());
    }
}

package aulas.exercicios.src;

public class App {
    public static void main(String[] args) throws Exception
    {
        Aula_04_1 p = new Aula_04_1();
        
        p.setNome("Luciano");
        p.setIdade(47);

        System.out.println("Nome de p: " + p.getNome());
        System.out.println("Idade de p: " + p.getIdade());
    }
}

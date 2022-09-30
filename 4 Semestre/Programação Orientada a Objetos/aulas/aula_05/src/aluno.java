package aulas.aula_05.src;

public class aluno 
{
    private String nome, endereco, sexo, rg, curso;
    private int idade;

    public Aluno() {
        nome = " ";
        endereco = " ";
        idade = 0;
        sexo = " ";
        rg = " ";
        curso = " ";
    }

    public Aluno (String nome, String endereco, int idade, String sexo, String rg, String curso){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.sexo = sexo;
        this.rg = rg;
        this.curso = curso;
    }

    public void imprimir(){
        System.out.println("Nome:" + getNome());
        System.out.println("Idade:" + getIdade());
        System.out.println("Endereço:" + getEndereco());
        System.out.println("Sexo:" + getSexo());
        System.out.println("RG:" + getRg());
        System.out.println("Curso:" + getCurso());
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return idade;
    }    
}

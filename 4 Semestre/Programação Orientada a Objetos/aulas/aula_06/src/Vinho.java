public class Vinho{
    private String nome;
    private String tipo;
    private int ano;
    private double preco;

    public Vinho(String nome, String tipo, int ano, double preco){
        this.nome = nome;
        this.tipo = tipo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int calcularIdade(int anoAtual){
        return anoAtual - ano;
    }
}
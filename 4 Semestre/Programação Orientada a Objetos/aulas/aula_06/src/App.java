import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanNum = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        Vinho vinhos[] = new Vinho[3];
        String nome, tipo;
        int ano, anoAtual;
        double preco;
        Vinho vinhoMaisCaro;
        Vinho vinhoMaisVelho;

        for(int i = 0; i < vinhos.length; i++){
            System.out.println("Digite o nome do vinho:");
            nome = scanStr.nextLine();
            System.out.println("Digite o tipo do vinho:");
            tipo = scanStr.nextLine();
            System.out.println("Digite o ano do vinho:");
            ano = scanNum.nextInt();
            System.out.println("Digite o preço do vinho:");
            preco = scanNum.nextDouble();
            System.out.println("Digite o ano atual:");
            anoAtual = scanNum.nextInt();
            scanNum.close();
            scanStr.close();
            vinhos[i] = new Vinho(nome, tipo, ano, preco);
        }

        vinhoMaisCaro = vinhos[0];
        for(int i = 1; i < vinhos.length; i++){
            if(vinhoMaisCaro.getPreco() < vinhos[i].getPreco()){
                vinhoMaisCaro = vinhos[i];
            }
        }
        System.out.println(vinhoMaisCaro.getNome());
        System.out.println(vinhoMaisCaro.getPreco());

        vinhoMaisVelho = vinhos[0];

        for(int i = 1; i < vinhos.length; i++){
            if(vinhoMaisVelho.calcularIdade(anoAtual) < vinhos[i].calcularIdade(anoAtual)){
                vinhoMaisVelho = vinhos[i];
            }
        }
}
}
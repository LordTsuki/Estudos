package aulas.ac1.src;
//Projeto AC1
//Lucas Yukio Alcantara Sonoda    RA:210136
//Gabriel De Carvalho Torres Luna RA:210060
import java.util.Scanner;

public class robo {
    public static void main(String[] args) throws Exception{
        //Definindo o scanner como entrada
        Scanner entrada = new Scanner(System.in);
        
        //Declarando uma array do tipo int como constante, pois o valor nunca mudará
        final int[] linha1 = new int[3];

        //Recebendo os valores de N, C e S em uma array do tipo int
        //N -> Número de Estações
        //C -> Número de Comandos
        //S -> Número da Estação esperada
        System.out.print(">>");
         for(int k=0;k<3;k++) 
            linha1[k] = entrada.nextInt();
        
        //Variaveis do tipo inteiro que recebem os valores de N, C e S
        int nEst, nCom, estEsp, nEsp=0, estAtual=1;;
         nEst = linha1[0];
         nCom = linha1[1];
         estEsp = linha1[2];
       
        //Definindo uma array do tipo int como constante, pois o valor nunca mudará
        final int[] linha2 = new int[nCom];

        //Recebendo os valores dos comandos em uma array do tipo int
        System.out.println("Digite os comandos agora");
        System.out.print(">>");
         for(int h=0;h<nCom;h++) 
            linha2[h] = entrada.nextInt();                        
         entrada.close();

        //Caso a estação esperada seja 1, terá que ser somada inicialmente
        if(estEsp == 1)
            nEsp = 1;
        
        //For utilizado para fazer a soma de vezes que o robô passou na estação esperada, com base na sua movimentação
        for(int i=0;i<nCom;i++){           
           
            if(linha2[i] == 1)       
                estAtual = estAtual + 1;
            if(linha2[i] == -1)
                estAtual = estAtual - 1;
                                              
            if(estAtual>nEst)
                estAtual = 1;
            if(estAtual==0)
                estAtual = nEst;  
            
            if(estAtual == estEsp)
                nEsp = nEsp + 1;
        }
        System.out.println("O robô passou " + nEsp + " vezes pelo ponto mais próximo da área devastada");
    }
}

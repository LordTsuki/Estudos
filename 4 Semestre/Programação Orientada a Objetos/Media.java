//Construir um programa que calcula a média das seguintes notas: 7.5, 4.5 e 9
//Construir um programa para calcular a área de um quadrado de 350m de lado
//Construir um programa para calcular a área de uma circunferencia com raio 5cm (ac=pi*raio^2)
//Construir um programa para imprimir a soma das Strings: "hugo", "gastou 50 reais","ontem"

public class Media
{
    public static void main(String[] args) throws Exception
    {
        String hugo = "hugo ", gastou = "gastou 50 reais", ontem = "ontem";
        float pi = 3.14159f;
        int lado = 350, raio = 5;
        System.out.println("A média das notas: 7.5, 4.5 e 9 é: " + ((7.5 + 4.5 + 9)/3));
        System.out.println("A área de um quadrado de 350 m é: " + (lado*lado));
        System.out.println("A área de circunferencia de raio 5 cm é: " + (pi*raio*raio));
        System.out.println("A área de circunferencia de raio 5 cm é: " + (pi*raio*raio));
        System.out.println(hugo+gastou+ontem);
    }    
}

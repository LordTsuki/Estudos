import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int opEscolhida = escolhaMenu();
        String nome, telefone, endereco, email;
        Contato c;
        Agenda a = new Agenda();

        do{
            switch(opEscolhida){
                case 1: System.out.println("--- Cadastro");
                        System.out.println("Nome");
                        nome = entrada.nextLine();
                        System.out.println("Telefone");
                        telefone = entrada.nextLine();
                        System.out.println("Endereço");
                        endereco = entrada.nextLine();
                        System.out.println("e-mail");
                        email = entrada.nextLine();
                        c = new Contato(nome, telefone, endereco, email);
                        a.inserir(c);
                        break;
                case 2: System.out.println("---Busca");
                        System.out.println("Digito o nome a ser buscado:");
                        nome = entrada.nextLine();
                        c = a.buscar(nome);
                        if(c == null){
                            System.out.println("Contato não encontrado");
                        }
                        else{
                            c.imprimir();
                        }
                        break;
                case 3: System.out.println("---Modificar Contato");
                        System.out.println("Digite o nome do contato");
                        nome = entrada.nextLine();
                        a.modificar(nome);
                        break;
                case 4: System.out.println("---Excluir Contato");
                        System.out.println("Digite o nome do contato");
                        nome = entrada.nextLine();
                        a.excluir(nome);
                        break;
                case 5: System.out.println("---Listagem");
                        a.listarContatos();
                        break;
                case 6: System.out.println("Finalizando programa");
            }
        }while(opEscolhida != 6);
    }

    public static  int escolhaMenu() {
        Scanner entrada = new Scanner(System.in);
        int op; 
        System.out.println("*** Menu ****");
        System.out.println("<1> Cadastrar Contato");
        System.out.println("<2> Buscar Contato");
        System.out.println("<3> Modificar Contato");
        System.out.println("<4> Excluir Contato");
        System.out.println("<5> Listar todos os contatos");
        System.out.println("<6> Sair");
        System.out.println("**************");
      
        do {
            System.out.println("Escolha uma opção");
            op = entrada.nextInt();
        } while (op < 1 || op > 6);

        return op; 
    } 
}

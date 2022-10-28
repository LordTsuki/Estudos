import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList <Contato> contatos;
    
    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void inserir (Contato c) {
        contatos.add(c); 
    }

    public Contato buscar(String nome) {
        
        System.out.println("**** Busca Contato ****");
        for(int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().equals(nome)) {
                return contatos.get(i);
            }      
        }
        return null;
    }

    public boolean excluir(String nome) {
        Contato contatoBuscado; 
        contatoBuscado = buscar(nome);
        System.out.println("**** Exclusão de contato ****");
        if(contatoBuscado == null) {
            return false; 
        } else { 
            contatos.remove(contatoBuscado);
            return true; 
        } 
    }

    public void modificar(String nome) {
        Contato contatoBuscado; 
        contatoBuscado = buscar(nome);
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("**** Modificando Contato ****");
        if(contatoBuscado == null) {
            System.out.println("** Erro Contato não encontrado! **");
        } else {
            System.out.println("Digite novo nome:");
            contatoBuscado.setNome(entrada.nextLine());
            System.out.println("Digite novo endereco: ");
            contatoBuscado.setEndereco(entrada.nextLine());
            System.out.println("Digite novo e-mail:");
            contatoBuscado.setEmail(entrada.nextLine());
            System.out.println("Digite novo telefone:");
            contatoBuscado.setTelefone(entrada.nextLine());
        }
    }

    public void listarContatos() {
       
       System.out.println("**** Listagem dos Contatos ****");
        for(Contato c : contatos) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("E-mail: " + c.getEmail());
            System.out.println("Endereço" + c.getEndereco());
        }
    }
}

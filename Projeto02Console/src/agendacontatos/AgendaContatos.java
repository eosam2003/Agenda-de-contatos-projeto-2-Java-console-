package agendacontatos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContatos {
    public static void main(String[]args) {
    	ArrayList<Contato> contatos= new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    while(true) {
    	System.out.println("Menu:");
    	System.out.println("1.Adicionar contato");
    	System.out.println("2.Mostrar todos os contatos");
    	System.out.println("3.Sair");
    	System.out.print("Escolha uma opção:");
    	int opcao=sc.nextInt();
    if (opcao ==1) {
    	System.out.print("Digite um nome do contato:");
    	String nome=sc.next();
    	System.out.print("Digite o telefone do contato:");
    	String telefone=sc.next();
    	System.out.print("Digite o email do contato:");
    	String email=sc.next();
    	
    	Contato contato = new Contato(nome,telefone,email);
    	contatos.add(contato);
    	System.out.println("Contatdo adicionado com sucesso!");
    }else if(opcao ==2) {
    	System.out.println("Contatos");
    	for(Contato contato: contatos) {
    		System.out.println(contato);
    	}
    }else if(opcao ==3) {
    	System.out.println("Saindo...");
    	break;	
    }else {
    	System.out.println("Opção invalida. Tente novamente");
      }
    sc.close();
    }	
  }
}

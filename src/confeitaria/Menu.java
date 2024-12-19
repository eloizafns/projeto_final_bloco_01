package confeitaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		String produto;
		
		while (true ) {
			
			System.out.println("**********************************");
			System.out.println("                                  ");
			System.out.println("      Confeitaria Doce Memória    ");
			System.out.println("                                  ");
			System.out.println("**********************************");
			System.out.println("1- Adicionar Produto              ");
			System.out.println("2- Listar Produtos                ");
			System.out.println("3- Atualizar                      ");
			System.out.println("4- Apagar Produto                 ");
			System.out.println("5- Sair                           ");
			System.out.println("**********************************");
			System.out.println("Digite a opção desejada:          ");
			
			opcao = leia.nextInt();
			
			if (opcao == 5) {
				System.out.println("\n Confeitaria Doce Memoria - Despertando Doces Lembranças!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Adicionar Produto\n");
				break;
			case 2:
				System.out.println("Listar Produtos\n");
				break;
			case 3:
				System.out.println("Atualizar\n");
				break;
			case 4:
				System.out.println("Apagar Produto");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		}
		
	}
	public static void sobre() {
			System.out.println("\n******************************************");
			System.out.println("Programa Desenvolvido por: Eloiza Fernandes.");
			System.out.println("email: eloizafnsilva@gmail.com");
			System.out.println("********************************************");
	}

}

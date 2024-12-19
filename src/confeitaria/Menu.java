package confeitaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import confeitaria.model.Bolo;
import confeitaria.model.BoloBase;
import confeitaria.model.BoloMoldado;


public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, tipo;
		String formato, bolo;
		float preco, peso;
		final String recheio, sabor;
		String coco, ninho, brigadeiro;
		String chocolate, branco;
		
		Bolo b1 = new Bolo(coco, chocolate, 15, 1, 1);
		
		while (true) {
			
			System.out.println("**********************************");
			System.out.println("                                  ");
			System.out.println("      Confeitaria Doce Memória    ");
			System.out.println("                                  ");
			System.out.println("**********************************");
			System.out.println("1- Cadastrar Produto              ");
			System.out.println("2- Listar Produtos                ");
			System.out.println("3- Atualizar                      ");
			System.out.println("4- Apagar Produto                 ");
			System.out.println("5- Sair                           ");
			System.out.println("**********************************");
			System.out.println("Digite a opção desejada:          ");
					
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 5) {
				System.out.println("\n Confeitaria Doce Memoria - Despertando Doces Lembranças!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Adicionar Produto\n");
				
				System.out.println("Digite o nome do bolo: ");
				bolo = leia.nextLine();
				keyPress();
				break;
			case 2:
				System.out.println("Listar Produtos\n");
				
				keyPress();
				break;
			case 3:
				System.out.println("Atualizar\n");
				
				System.out.println("Digite o número do bolo que deseja atualizar: ");
				numero = leia.nextInt();
				
				System.out.println("");
				keyPress();
				break;
			case 4:
				System.out.println("Apagar Produto\n");
				
				System.out.println("Digite o número do bolo que deseja apagar: ");
				numero = leia.nextInt();
				
				keyPress();
				break;
			default:
				System.out.println("Opção Inválida!");
				keyPress();
				break;
			}
		}
		
	}
	public static void sobre() {
			System.out.println("\n********************************************");
			System.out.println("Programa Desenvolvido por: Eloiza Fernandes.");
			System.out.println("email: eloizafnsilva@gmail.com");
			System.out.println("********************************************");
	}

	public static void keyPress() {

		try {
			System.out.println("\n\n Pressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}
}

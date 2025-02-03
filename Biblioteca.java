package Respostas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	private static List<ItemImpresso> impressos;

	public Biblioteca() {
		Biblioteca.impressos = new ArrayList<>();
	}

	public void adicionarItem(ItemImpresso item) {
		impressos.add(item);
	}

	public double calcularSomaValorItens() {
		double soma = 0;
		for (ItemImpresso item : impressos) {
			soma += item.getValor();
		}
		return soma;
	}

	public double calcularTempoMedioEmprestimo() {
		if (impressos.isEmpty()) {
			return 0;
		}
		double somaTempo = 0;
		for (ItemImpresso item : impressos) {
			somaTempo += item.calcularTempoEmprestimo();
		}
		return somaTempo / impressos.size();
	}

	public void imprimirItens() {
		if (impressos.isEmpty()) {
			System.out.println("O item não está cadastrado.");
		} else {
			System.out.println("Lista de itens disponiveis no cadastro:");
			for (ItemImpresso item : impressos) {
				System.out.println(item);
			}
		}
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		Biblioteca biblioteca = new Biblioteca();

		System.out.println("Olá, bem-vindo ao Sistema Biblioteca!");
		int opcao;
		do {
			System.out.println("\n----- MENU -----");
			System.out.println("1. Adicionar Livro");
			System.out.println("2. Adicionar Mapa");
			System.out.println("3. Listar Itens");
			System.out.println("4. Calcular Soma dos Valores");
			System.out.println("5. Calcular Tempo Médio de Empréstimo");
			System.out.println("6. Sair");
			System.out.print("Escolha uma opção: ");

			opcao = leitor.nextInt();
			leitor.nextLine();

			switch (opcao) {
			case 1:
				  System.out.print("Título: ");
                  String tituloLivro = leitor.nextLine();
                  System.out.print("Valor: ");
                  double valorLivro = leitor.nextDouble();
                  leitor.nextLine();
                  System.out.print("Número de Páginas: ");
                  Integer numeroPaginas = leitor.nextInt();
                  leitor.nextLine();
                  
                  System.out.print("Autor: ");
                  String autorLivroNome = leitor.nextLine();
                  System.out.print("Email do Autor: ");
                  String autorLivroEmail = leitor.nextLine();
                  
                  Autor autorLivro = new Autor(autorLivroNome, autorLivroEmail);
                  
                  
                  System.out.print("Editora: ");
                  String editoraNome = leitor.nextLine();
                  System.out.print("Cidade da Editora: ");
                  String editoraCidade = leitor.nextLine();
                  
                  Editora editora = new Editora(editoraNome, editoraCidade);
                  
                  System.out.print("Tipo do livro (Consulta/Empréstimo): ");
                  String tipoLivro = leitor.nextLine();

                  impressos.add(new Livro(tituloLivro, valorLivro, autorLivro,numeroPaginas, editora, tipoLivro));
                  System.out.println("Livro adicionado com sucesso!");
                  break;

			case 2:
				  System.out.print("Título: ");
                  String tituloMapa = leitor.nextLine();
                  System.out.print("Valor: ");
                  double valorMapa = leitor.nextDouble();
                  leitor.nextLine();
                  System.out.print("Altura: ");
                  double alturaMapa = leitor.nextDouble();
                  leitor.nextLine();
                  System.out.print("Largura: ");
                  double larguraMapa = leitor.nextDouble();
                  leitor.nextLine();
                  
                  System.out.print("Autor: ");
                  String autorMapaNome = leitor.nextLine();
                  System.out.print("Email do Autor: ");
                  String autorMapaEmail = leitor.nextLine();
                  Autor autorMapa = new Autor(autorMapaNome, autorMapaEmail);

                  impressos.add(new Mapa(tituloMapa, valorMapa, autorMapa, larguraMapa, alturaMapa));
                  System.out.println("Mapa adicionado com sucesso!");
                  break;

			case 3:
				  if (impressos.isEmpty()) {
                      System.out.println("Nenhum item cadastrado.");
                  } else {
                      for (ItemImpresso item : impressos) {
                          System.out.println(item);
                      }
                  }
                  break;
                  
			case 4:
				System.out.println("Soma dos valores dos itens: " + biblioteca.calcularSomaValorItens());
				break;

			case 5:
				System.out
						.println("Tempo médio de empréstimo: " + biblioteca.calcularTempoMedioEmprestimo() + " horas");
				break;

			case 6:
				System.out.println("Obrigado, nos vemos na próxima");
				System.out.println("Saindo do sistema...");
				leitor.close();

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 6);
	}
}

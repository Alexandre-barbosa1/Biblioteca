package apllication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Biblioteca;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String titulo = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("BIBLIOTECA: ");
			Biblioteca biblioteca = new Biblioteca();
			System.out.print("deseja adicionar quantos livros?: ");
			int n = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				System.out.print("nome do livro: ");
				String nome = sc.nextLine();
				System.out.print("nome do autor: ");
				String autor = sc.nextLine();
				System.out.println("data de publição: ");
				Date date = sdf.parse(sc.next());
				biblioteca.adicionar(new Livro(nome, autor, date));
				sc.nextLine();
			}
			biblioteca.percorrer();
			System.out.println("deseja remover um livro da biblioteca? sim/nao");
			String r = sc.nextLine();
			if (!(r.equals("nao"))) {
				System.out.println("informe o nome do livro que deseja remover: ");
				titulo = sc.next();
				biblioteca.remover(titulo);
			}
			sc.nextLine();
			System.out.println("deseja emprestar um livro da biblioteca? sim/nao");
			String e = sc.nextLine();
			if (!(e.equals("nao"))) {
				System.out.println("informe o nome do livro que deseja emprestar: ");
				titulo = sc.next();
				biblioteca.emprestar(titulo);
			}

			System.out.println("atualização: ");
			biblioteca.percorrer();
			sc.nextLine();
		} catch (ParseException e) {
			System.out.println("erro " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("erro " + e.getMessage());
		}
		sc.close();

	}

}

package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,yyyy");

	private List<Livro> livros = new ArrayList<>();

	public void adicionar(Livro livro) {
		livros.add(livro);
	}

	public boolean remover(String titulo) {
		for (Livro l : livros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				livros.remove(l);
				System.out.println("livro removido");
				return true;
			}

		}
		System.out.println("livro nao encontrado");
		return false;

	}
	public boolean emprestar(String titulo) {
		for (Livro l : livros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				livros.remove(l);
				System.out.println("livro emprestado");
				return true;
			}

		}
		System.out.println("livro nao encontrado");
		return false;
		
	}

	public void percorrer() {
		for (Livro list : livros) {
			System.out.println(list.getTitulo() + "; " + sdf.format(list.getAnopubli()));
		}
	}

}

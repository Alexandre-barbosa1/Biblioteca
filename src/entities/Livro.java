
package entities;

import java.util.Date;
public class Livro {
	private String titulo;
	private String autor;
	private Date Anopubli;


	public Livro() {

	}

	public Livro(String titulo, String autor, Date anopubli) {
		this.titulo = titulo;
		this.autor = autor;
		this.Anopubli = anopubli;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getAnopubli() {
		return Anopubli;
	}

	public void setAnopubli(Date anopubli) {
		Anopubli = anopubli;
	}


	

}

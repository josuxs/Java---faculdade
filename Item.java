package Respostas;

public abstract class Item {
	private String titulo;
	private Double valor;
	private Autor autor;
	
	public Item(String titulo, Double valor, Autor autor) {
		this.titulo = titulo;
		this.valor = valor;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Item [titulo=" + titulo + ", valor=" + valor + "]";
	}
	
	
}


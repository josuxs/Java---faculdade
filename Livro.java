package Respostas;

public class Livro extends ItemImpresso {

	private Integer numeroPaginas;
	private String tipoLivro;
	private Editora editora;

	public Livro(String titulo, Double valor, Autor autor, Integer numeroPaginas, Editora editora, String tipoLivro) {
		super(titulo, valor, autor);
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.tipoLivro = tipoLivro;
	}
	
	@Override
	public Double calcularTempoEmprestimo() {
		if ("Consulta".equalsIgnoreCase(tipoLivro)) {
			return 8.0;
		} else if ("Empréstimo".equalsIgnoreCase(tipoLivro)) {
			return 56.0;
		}
		return 0.0;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getTipoLivro() {
		return tipoLivro;
	}

	public void setTipoLivro(String tipoLivro) {
		this.tipoLivro = tipoLivro;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return super.toString() + " Livro [numeroPaginas=" + numeroPaginas + ", tipoLivro=" + tipoLivro + ", editora="
				+ editora + "]";
	}
}

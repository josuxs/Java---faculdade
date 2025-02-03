package Respostas;

public class Editora {
	private String nome;
	private String cidade;
	
	public Editora(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Editora [nome=" + nome + ", cidade=" + cidade + "]";
	}
	
	
}

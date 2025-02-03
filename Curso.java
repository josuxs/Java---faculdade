package Respostas;

public class Curso extends Docente{
   
	private String nome;
	private Double cargaHorario;
	private Docente Coordenador;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCargaHoraria() {
		return cargaHorario;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHorario = cargaHoraria;
	}

	public Docente getCoordenador() {
		return Coordenador;
	}

	public void setCoordenador(Docente coordenador) {
		Coordenador = coordenador;
	}

	@Override
	public String toString() {
		return "Curso / nome=" + nome + ", Carga Horária=" + cargaHorario+ ", Coordenador=" + Coordenador;
	}
}

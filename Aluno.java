package Respostas;

public class Aluno extends Pessoa {
	private Integer matricula;
	private Double crg;
	private Docente orientador;
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getCrg() {
		return crg;
	}

	public void setCrg(Double crg) {
		this.crg = crg;
	}

	public Docente getOrientador() {
		return orientador;
	}

	public void setOrientador(Docente orientador) {
		this.orientador = orientador;
	}

	@Override
	public String toString() {
		return "Aluno / matricula=" + matricula + ", crg=" + crg + ", orientador=" + orientador + ", id=" + id
				+ ", nome=" + nome + ", username=" + username + ", password=" + password + ", Data Nascimento="
				+ dataNascimento;
	}

	public Double calcularInventivoQualificacao () {
		return 0.0;
	}

}

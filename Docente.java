package Respostas;

public class Docente extends Funcionario {
	@Override
	public double calcularIncentivoQualificacao() {
		switch (titulo) {
		case DOUTORADO:
			return 6000;
		case MESTRADO:
			return 3500;
		case ESPECIALIZACAO:
			return 1200;
		case GRADUACAO:
			return 0;
		default:
			return 0;
		}
	}

}

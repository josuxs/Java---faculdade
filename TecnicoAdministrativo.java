package Respostas;

public class TecnicoAdministrativo extends Funcionario {
		@Override 
		public double calcularIncentivoQualificacao() {
			switch (titulo) {
				case DOUTORADO:
					return salario * 0.71;
				case MESTRADO: 
					return salario * 0.52; 
				case ESPECIALIZACAO:
					return salario * 0.275;
				case GRADUACAO: 
					return salario * 0.135; 
				default:
					return 0;
			}
		}
}
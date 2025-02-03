package Respostas;

public class Mapa extends ItemImpresso {

	private Double larguraMapa;
	private Double alturaMapa;

	public Mapa(String titulo, Double valor, Autor autor, Double larguraMapa, Double alturaMapa) {
		super(titulo, valor, autor);
		this.larguraMapa = larguraMapa;
		this.alturaMapa = alturaMapa;
	}
	
	@Override
	public Double calcularTempoEmprestimo() {
		return 1.0;
	}
	public Double getLarguraMapa() {
		return larguraMapa;
	}

	public void setLarguraMapa(Double larguraMapa) {
		this.larguraMapa = larguraMapa;
	}

	public Double getAlturaMapa() {
		return alturaMapa;
	}

	public void setAlturaMapa(Double alturaMapa) {
		this.alturaMapa = alturaMapa;
	}

	@Override
	public String toString() {
		return super.toString() + " Mapa [larguraMapa=" + larguraMapa + ", alturaMapa=" + alturaMapa + "]";
	}
}

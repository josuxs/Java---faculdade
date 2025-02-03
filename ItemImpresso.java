package Respostas;

public abstract class ItemImpresso extends Item{
	
	public ItemImpresso(String titulo, Double valor, Autor autor) {
		super(titulo, valor, autor);
	}

	public abstract Double calcularTempoEmprestimo();
}

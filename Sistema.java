package Respostas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Pessoa> pessoas;
	
	public Sistema() {
		this.pessoas = new ArrayList<>();  
	}
	
	public void adicionarPessoa(Pessoa pessoa) {  
        pessoas.add(pessoa);   
    }  
	
	public double calcularMediaIdade() {
	    int somaIdades = 0;  
	    int quantidadePessoas = 0;  

	    for (Pessoa pessoa : pessoas) {  
	        if (pessoa.getDataNascimento() != null) {  
	            somaIdades += LocalDate.now().getYear() - pessoa.getDataNascimento().getYear();  
	            quantidadePessoas++;  
	        }  
	    }  

	    return quantidadePessoas > 0 ? (double) somaIdades / quantidadePessoas : 0.0;   
	}
	
	public double calcularTotalIncentivoQualificacao() {
	    double totalIncentivo = 0.0;

	    for (Pessoa pessoa : pessoas) {
	        if (pessoa instanceof Funcionario) {
	            Funcionario funcionario = (Funcionario) pessoa;
	            totalIncentivo += funcionario.calcularIncentivoQualificacao();  
	        }
	    }
	    return totalIncentivo; 
	}
}
package Respostas;

public abstract class Funcionario extends Pessoa {
    protected Titulacao titulo;
    protected Double salario;
    protected String localTrabalho;

    public abstract double calcularIncentivoQualificacao();

    // Getters e Setters
    public Titulacao getTitulo() { return titulo; }
    public void setTitulo(Titulacao titulo) { this.titulo = titulo; }

    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }

    public String getLocalTrabalho() { return localTrabalho; }
    public void setLocalTrabalho(String localTrabalho) { this.localTrabalho = localTrabalho; }
}

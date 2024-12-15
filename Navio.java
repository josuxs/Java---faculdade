package q1;

public class Navio {
    private String fabricante;
    private Double velocidadeAtual;
    private static int contador = 0;

    public Navio(String novofabricante) {
        this.fabricante = novofabricante;
        this.velocidadeAtual = 0.0;
        contador++;
    }

    public Navio(String novofabricante, Double novaVelocidade) {
        this.fabricante = novofabricante;
        this.velocidadeAtual = novaVelocidade;
        contador++;
    }

    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    
    public void aumentarVelocidade() {
        this.velocidadeAtual += 10.0; 
    }

    public void reduzirVelocidade() {
        if (this.velocidadeAtual >= 10.0) {
            this.velocidadeAtual -= 10.0; 
        } else {
            this.velocidadeAtual = 0.0; 
        }
    }

   
    public static int getContador() {
        return contador;
    }
}
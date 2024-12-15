package q1;

public class TestadorNavio {
    public static void main(String[] args) {
        
        Navio n1 = new Navio("EUA", 0.0);

        
        System.out.println("Fabricante: " + n1.getFabricante());
        System.out.println("Velocidade Atual: " + n1.getVelocidadeAtual());

       
        n1.aumentarVelocidade();
        n1.aumentarVelocidade();

       
        System.out.println("Nova velocidade: " + n1.getVelocidadeAtual());

        
        System.out.println("Número de navios criados: " + Navio.getContador());
    }
}

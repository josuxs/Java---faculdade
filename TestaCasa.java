package q2;

public class TestaCasa {
    public static void main(String[] args) {
       
        Casa c1 = new Casa();
        Casa c2 = new Casa();

       
        Endereco e1 = new Endereco();
        e1.setRua("Folha 18");
        e1.setNumero(123);
        e1.setBairro("Centro");
        e1.setCidade("Parauapebas");
        e1.setEstado("PA");

        Endereco e2 = new Endereco();
        e2.setRua("Folha 17");
        e2.setNumero(456);
        e2.setBairro("Centro");
        e2.setCidade("Parauapebas");
        e2.setEstado("PA");

       
        Pessoa p1 = new Pessoa();
        p1.setNome("Josué");
        p1.setSobrenome("Xavier");
        p1.setEmail("josue.xavier@email.com");

        
        c1.setProprietario(p1);
        c1.setEndereco(e1);
        c1.setCor("Preto");
        c1.setValorVenda(100.0);

        c2.setProprietario(p1);
        c2.setEndereco(e2);
        c2.setCor("Azul");
        c2.setValorVenda(102.0);

        
        System.out.println("Casa 1:");
        System.out.println("Proprietário: " + c1.getProprietario().getNome() + " " + c1.getProprietario().getSobrenome());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Endereço: " + c1.getEndereco().getRua() + ", " + c1.getEndereco().getNumero());
        System.out.println("Valor: R$ " + c1.getValorVenda());

       
        System.out.println("\nCasa 2:");
        System.out.println("Proprietário: " + c2.getProprietario().getNome() + " " + c2.getProprietario().getSobrenome());
        System.out.println("Cor: " + c2.getCor());
        System.out.println("Endereço: " + c2.getEndereco().getRua() + ", " + c2.getEndereco().getNumero());
        System.out.println("Valor: R$ " + c2.getValorVenda());
    }
}

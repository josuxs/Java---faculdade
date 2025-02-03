package Respostas;

import java.time.LocalDate;

public class Universidade {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

    
        Docente docente = new Docente();
        docente.setNome("Josué");
        docente.setSalario(19700.0);
        docente.setTitulo(Titulacao.MESTRADO);
        sistema.adicionarPessoa(docente);

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo();
        tecnico.setNome("Wanessa");
        tecnico.setSalario(7900.0);
        tecnico.setTitulo(Titulacao.ESPECIALIZACAO);
        sistema.adicionarPessoa(tecnico);

        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Carlos Gabriel");
        aluno1.setMatricula(20244458);
        aluno1.setCrg(5.0);
        aluno1.setDataNascimento(LocalDate.of(2000, 2, 9));
        sistema.adicionarPessoa(aluno1);

        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Cecília");
        aluno2.setMatricula(2024935884);
        aluno2.setCrg(7.0);
        aluno2.setDataNascimento(LocalDate.of(2005, 12, 4));
        sistema.adicionarPessoa(aluno2);

   
        System.out.println("Média de Idade: " + sistema.calcularMediaIdade());
        System.out.println("Total Incentivo Qualificação: " + sistema.calcularTotalIncentivoQualificacao());
    }
}

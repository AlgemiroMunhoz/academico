package poo.revisao;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Estudante objEstudante = new Estudante("235FT9874", "Flavio");
        objEstudante.setCurso("Analise e desenvolvimentos de Sistemas");
        objEstudante.setDataNascimento(LocalDate.of(1978, 12, 9));

        Funcionario objFuncionario = new Funcionario("67432234", "José Roberto");
        objFuncionario.setDataNascimento(LocalDate.of(1985, 6, 25));

        Autor objAutor = new Autor(22, "Tecnologia da Informacao");
        objAutor.setNome("Gislaine Cruz");
        objAutor.setDataNascimento(LocalDate.of(1979, 7, 11));

        Livro objLivro = new Livro("Jesus: O maior homem", LocalDate.of(2000, 9, 10));

        Emprestimo novoEmprestimo = new Emprestimo(objLivro, objFuncionario, objEstudante);

        /// imprimindo para exercicios***
        System.out.println(objEstudante);
        System.out.println(objFuncionario);
        System.out.println(objAutor);

    }
}

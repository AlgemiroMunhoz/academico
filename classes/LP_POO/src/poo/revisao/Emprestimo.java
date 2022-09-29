package poo.revisao;
import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Funcionario funcionario;
    private Estudante estudante;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;

    // construtor
    public Emprestimo(Livro _livro, Funcionario _funcionario, Estudante _estudante) {
        this.livro = _livro;
        this.funcionario = _funcionario;
        this.estudante = _estudante;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

}

package poo.exe_herenca.heranca;

import java.time.LocalDate;

public class Emprestimo {

    private Estudante estudante;
    private Funcionario funcionario;
    private Livro livro;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;
    
    public Estudante getEstudante() {
        return estudante;
    }
    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public LocalDate getDtEmprestimo() {
        return dtEmprestimo;
    }
    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }
    public LocalDate getDtDevolucao() {
        return dtDevolucao;
    }
    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }  

}

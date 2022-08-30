// 3. Crie uma classe Emprestimo com os seguintes atributos:
// - Livro livro
// - Usuario usuario
// - Data de devolução
// - Data de Empréstimo

package poo.TrabSistBiblio.heranca;

import java.time.LocalDate;

public class EmprestimoBiblio {
    
    private LivroBiblio livro;
    private UsuarioBiblio usuario;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;
    
    public LivroBiblio getLivro() {
        return livro;
    }
    
    public void setLivro(LivroBiblio livro) {
        this.livro = livro;
    }
    
    public UsuarioBiblio getUsuario() {
        return usuario;
    }
    
    public void setUsuario(UsuarioBiblio usuario) {
        this.usuario = usuario;
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
    
    
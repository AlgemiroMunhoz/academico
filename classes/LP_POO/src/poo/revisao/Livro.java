package poo.revisao;
import java.time.LocalDate;

public class Livro {
    private String titulo;
    private LocalDate anoLancamento;
    private String editora;
    private int npag;
    private String autor;

    //// construtor
    public Livro(String _titulo, LocalDate _anoLancamento) {
        this.titulo = _titulo;
        this.anoLancamento = _anoLancamento;
    }

    //// getters setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

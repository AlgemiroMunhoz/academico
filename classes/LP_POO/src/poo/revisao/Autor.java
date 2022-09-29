package poo.revisao;
import java.time.format.DateTimeFormatter;

public class Autor extends Pessoa {
    // String nome;
    // LocalDate dataNascimento;
    private int qtoLivros;
    private String area;

    public Autor(int _qtoLivros, String _area) {
        this.qtoLivros = _qtoLivros;
        this.area = _area;
    }

    public int getQtoLivros() {
        return qtoLivros;
    }

    public void setQtoLivros(int qtoLivros) {
        this.qtoLivros = qtoLivros;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "\n\n*** CADASTRO DE AUTORES ***" +
                "\nNome:\t\t\t" + this.nome +
                "\nQto Livros:\t\t" + this.qtoLivros +
                "\nArea:\t\t\t" + this.area +
                "\nData Nascimento:\t" + this.dataNascimento.format(f);
    }

}

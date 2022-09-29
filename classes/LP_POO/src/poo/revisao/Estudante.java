package poo.revisao;
import java.time.format.DateTimeFormatter;

public class Estudante extends Pessoa {
    // String nome;
    // LocalDate dataNascimento;
    private String ra;
    private String curso;

    // CONSTRUTOR
    public Estudante(String _ra, String _nome) {
        this.ra = _ra;
        this.nome = _nome;
    }

    // GETTERS AND SETTER
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // METODO PARA RETORNAR OS NOMES
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "*** CADASTRO DE ALUNO ***" +
                "\nNome:\t\t\t" + this.nome +
                "\nRA:\t\t\t" + this.ra +
                "\nCurso:\t\t\t" + this.curso +
                "\nData de Nascimento:\t" + this.dataNascimento.format(f);
    }

}

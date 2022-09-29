package poo.revisao;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    // String nome;
    // LocalDate dataNascimento;
    private String matricula;
    private boolean status;

    public Funcionario(String _matricula, String _nome) {
        this.nome = _nome;
        this.matricula = _matricula;
        this.status = true;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String isStatus() {
        return this.status ? "Ativo" : "Inativo"; /// operador ternario
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return ("\n\n*** CADASTRO DE FUNCIONARIO ***" +
                "\nNome:\t\t\t" + this.nome +
                "\nData de Nascimento:\t" + this.dataNascimento.format(f) +
                "\nMatricula:\t\t" + this.matricula +
                "\nStatus:\t\t\t" + isStatus());
    }

    public static Funcionario lerFuncionario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite a matricula: ");
        String matricule = sc.nextLine();

        Funcionario ojbFuncionario = new Funcionario(matricule, nome);

        return ojbFuncionario;
    }

}

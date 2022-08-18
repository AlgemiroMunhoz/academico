package poo.exe_herenca.heranca;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected int passos;

    // --------Get and setters ------------------------
        
    public Pessoa(String nome2, LocalDate dtNascimento, String endereco2) {
    }

    public Pessoa() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    /**
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void andar(){
        this.passos++;
        System.out.println("andando...");
    }

    public void falar(){
        System.out.println("falando...");
    }
}

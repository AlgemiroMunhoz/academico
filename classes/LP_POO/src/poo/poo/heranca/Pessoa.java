package poo.poo.heranca;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected int passos;

    // --------Get and setters ------------------------
        
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

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

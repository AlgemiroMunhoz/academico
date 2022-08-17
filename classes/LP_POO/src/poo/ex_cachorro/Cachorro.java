package poo.ex_cachorro;
public class Cachorro{
    // model = todos os atributos gatter e setter
    //  ------------------ attributes -------------------------
    private String nome;//String eh uma classe 
    private int idade;
    private String raca;
    private boolean dono;
    private boolean castrado;
    private double peso;

      // ----------------- construtor -------------
    // assinatura e sobre carga de metodos
      //public Cachorro() {}

    public Cachorro(String name){
        System.out.println("Criando o objeto:" + name);
        
    }

    //  ----------------- GETTER E SETTER (metodos)----------------
    public void setNome(String n){
        this.nome = n;
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setRaca(String r) {
        this.raca = r;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public boolean getDono() {
        return this.dono;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean getCasrtado() {
        return this.castrado;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    //  ------------------ metodos -------------------------
    @Override
    public String toString() { //transformar objeto em string
        return ("Nome: " + this.nome + "\n Idade:" + this.idade + "\n Raca:" + this.raca + "\n Dono:" + this.dono + "\n Castrado:" + this.castrado + "\n Peso:" + this.peso);
    }
    
}
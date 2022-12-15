package poo.ProjetoDB;

public class Produto {
    private int id;
    private String nome;
    private String categoria; 
    private double preco; 
    private int estoque;
  
    
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getCategoria() {
      return categoria;
    }
    public void setCategoria(String categoria) {
      this.categoria = categoria;
    }
    public double getPreco() {
      return preco;
    }
    public void setPreco(double preco) {
      this.preco = preco;
    }
    public int getEstoque() {
      return estoque;
    }
    public void setEstoque(int estoque) {
      this.estoque = estoque;
    }
  
    
    
  }
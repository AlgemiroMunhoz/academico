package LP.Project_Alge.src;

public class Carro {
    private int id;
    private String name;
    private LocalDate date_fabricacao; 
    private Double valor;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDate_fabricacao() {
        return date_fabricacao;
    }
    public void setDate_fabricacao(LocalDate date_fabricacao) {
        this.date_fabricacao = date_fabricacao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    
    
    
}

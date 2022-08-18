package poo.ex_cartesiano;

public class Cartesiano {

    //----------atributos --------------------------------
    private double altura;
    private double largura;
    private String cor;
    private double pontoX;
    private double pontoY;

    //----------construtor --------------------------------
    public  Cartesiano(double altura, double largura, String cor, double pontoX, double pontoY) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    //----------Métodos --------
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPontoX() {
        return pontoX;
    }

    public void setPontoX(double pontoX) {
        this.pontoX = pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }

    public void setPontoY(double pontoY) {
        this.pontoY = pontoY;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
 

    
}

package poo.ex_cartesiano;
import java.security.PrivilegedAction;

public class Cartesiano {

    //----------atributos --------------------------------
    private double altura;
    private double largura;
    //private String cor;
    private double pontoX;
    private double pontoY;

    //----------construtor --------------------------------
    public  Cartesiano(double altura, double largura, String cor, double pontoX) {
        this.altura = altura;
        this.largura = largura;
       // this.cor = cor;
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    //----------Métodos --------

    public double getAltura() {
        return this.altura;
    }
    function getLargura() {
        return this.largura;
    }
}

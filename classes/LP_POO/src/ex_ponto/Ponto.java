package ex_ponto;

// import java.util.PrimitiveIterator;

public class Ponto {
    private double x;
    private double y;

    public Ponto(){}

    public Ponto(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getY(){
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Ponto p1, Ponto p2) {
        double d = Math.pow(p1.x, p2.x) + Math.pow(p1.y, p2.y);
        return Math.sqrt(d);
    }

}

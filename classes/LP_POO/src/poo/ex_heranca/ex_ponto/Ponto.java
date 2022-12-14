package poo.ex_ponto;

public class Ponto {
    // ----------Atibrutos--------------------
    // Atibrutos da classe | Considerando atributos do tipo privado.
    private double x;
    private double y;

    // public Ponto(){}

    public Ponto(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    // --------Get and setters ----------
    // Atalho para os Get and Setters é CTRL .

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Ponto p1, Ponto p2) {
        double d = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
        return Math.sqrt(d);

    // public double distance(Ponto p1, Ponto p2) {
    //     double d = Math.pow(p1.x, p2.x) + Math.pow(p1.y, p2.y);
    //     return Math.sqrt(d);
    }
}

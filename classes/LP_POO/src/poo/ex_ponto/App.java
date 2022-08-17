package poo.ex_ponto;

// import ex_ponto.Ponto;

public class App {

    public static void main(String[] args) throws Exception {
        // Ponto p1 = new Ponto(_x:2, _y:7);
        Ponto p1 = new Ponto(2, 7);
        Ponto p2 = new Ponto(2,-1);
        // Ponto p2 = new Ponto(-2, _y:3);

        // double result   = p1.distance(Ponto p1, Ponto p2);
        double result = p1.distance(p1, p2);
    }
}

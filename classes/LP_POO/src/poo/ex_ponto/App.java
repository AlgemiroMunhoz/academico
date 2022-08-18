package poo.ex_ponto;

public class App {

    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto(2,7);
        Ponto p2 = new Ponto(2,-1);

        double result = p1.distance(p1, p2);
        double result = p2.distance(p1, p2);

    }
}

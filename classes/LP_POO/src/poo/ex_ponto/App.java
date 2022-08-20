package poo.ex_ponto;

public class App {

    public static void main(String[] args) throws Exception {
        // Criando o objeto do tipo classes
        
        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(0, 0);

        p1.setX(2);
        p1.setY(7);
        p2.setX(2);
        p2.setY(-1);

        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p2.getX());
        System.out.println(p2.getY());
     
        // double result = p1.distance(p1, p2);
        // double result = p2.distance(p1, p2);

    }
}

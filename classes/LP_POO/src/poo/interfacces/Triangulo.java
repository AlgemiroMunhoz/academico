package poo.interfacces;

public class Triangulo implements FiguraGeometrica {

    @Override
    public double areaTriangulo(double x, double y) {
        // TODO Auto-generated method stub
        double soma = Math.pow(x, y) + Math.pow(x, y);
        return Math.sqrt(soma);
    }

    @Override
    public double raiz(double x, double y) {
        // TODO Auto-generated method stub
        return (x * y) / 2;
    }

    
}

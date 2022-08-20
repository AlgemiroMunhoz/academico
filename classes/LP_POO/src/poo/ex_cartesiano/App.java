package poo.ex_cartesiano;

public class App {

    public static void main(String[] args) throws Exception {
        
        // Create a new instance of the application object and initialize
        Cartesiano cartesiano = new Cartesiano(0, 0, null,0, 0);
        
        //-------- Estanciando o objeto ----------

        cartesiano.setAltura(2);
        cartesiano.setLargura(1);
        cartesiano.setCor(null);
        cartesiano.setPontoX(3);
        cartesiano.setPontoY(4);

        //--------Imprimindo na tela--------------------------------

        System.out.println(cartesiano.getAltura());
        System.out.println(cartesiano.getLargura() + "," + cartesiano.getCor());
        System.out.println(cartesiano.getPontoX());
        System.out.println(cartesiano.getPontoY());  
    }    
}

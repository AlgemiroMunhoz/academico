package poo.poo.heranca;

public class Cao extends AnimalTerrestre {
    public Cao(){
        super(); 
    }
    @Override
        public void emitirSom(){
        System.out.println("O cao" +this.nome + "Auau");
        }
    }
package poo.ex_heranca.heranca;

public class Dono extends Pessoa {
    private AnimalTerrestre animal;
    private int qtoAnimais = 0;


    // -------- Contrutor --------------------------------

    public Dono(){// Chama o construtor da superclasse.
        super();
    }
    
    public int getQtoAnimais(){
        return this.qtoAnimais;
    }

    public void setQtoAnimais(int qtoAnimais){
        this.qtoAnimais = qtoAnimais;
    }

    public void alimentarAnimal (AnimalTerrestre animal) { 
    //Metodos iguais com assinaturas diferentes = a sobrecarga de metodos.
        System.out.println("Estou alimentando o cao chamado: " +animal.getNome());
    }

    public void alimentarAnimal(Cao animal) {
        System.out.println("Estou alimentando o cao chamado: "
        + animal.getNome());
    }
    
    public void alimentarAnimal(Gato animal) {
        System.out.println("Estou alimentando o gato chamado: "
        + animal.getNome());
    }

    @Override
    public void andar(){
        this.passos += 2;
        System.out.println("Estou correndo...");
    }

    public AnimalTerrestre getAnimal() {
        return this.animal;
    }

    public void setAnimal (AnimalTerrestre animal) {
        this.animal = animal;
    }

}

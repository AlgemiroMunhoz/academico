package poo;

import poo.poo.heranca.Cao;
import poo.poo.heranca.Dono;
import poo.poo.heranca.Funcionario;

public class App {
    
    public static void main(String[] args){
        Cao thor = new Cao();
        thor.setNome("thor");
        thor.setIdade(4);
        thor.setRaca("poodle");

        Dono algemiro = new Dono();

        algemiro.setNome("algemiro");
        algemiro.setEndereco("Rua: Egidio Thomé, 622");
        algemiro.setAnimal(thor);

        algemiro.getAnimal().emitirSom();
        algemiro.alimentarAnimal(thor);
        algemiro.andar();

        Funcionario beto = new Funcionario();
        beto.setMatricula(12345678);
        beto.toString();
        
        
    }
}

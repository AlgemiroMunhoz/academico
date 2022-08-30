//Existem basicamente 4 tipos de modificadores de acesso
//Public - aberto para todos
//private - Atributos, metodos e classes
//profected
//package
//metodos - tudo que nos temos dentro das classe
//Nenhum atributo da classe pode ser public. Dever ser encapsulameto
// O sinal de + significa que a classe é público
// o sinal de - significa que a classe é privada e visible na própria classe.
// # Protect 
// N Package 

package poo.ex_cachorro;
public class Aula1{
    //private int j = 0; atributo encapsulado
    public static void main(String[] args) { //metodo
       // int i = 0; var do metodo main
 

        Cachorro doguinho = new Cachorro("doguinho"); //classe; objeto; construtor
        // criando objeto do tipo Cachorro chamado doguinho
        // instanciando atraves do operador new
        // apos o new chamo o construtor da classe

        // ----------------- estansiando objeto ----------------------------
        doguinho.setNome("Rex");
        doguinho.setIdade(7);
        doguinho.setRaca("Caramelo");
        doguinho.setDono(true);
        doguinho.setCastrado(false);
        doguinho.setPeso(7.34);
        // doguinho.idade = 7;
        // doguinho.raca = "Caramelo";
        // doguinho.dono = true;
        // doguinho.castrado = false;
        // doguinho.peso = 7.34;

        System.out.println(doguinho.getNome());
        System.out.println(doguinho.getIdade());
        System.out.println(doguinho.getRaca());
        System.out.println(doguinho.getDono());
        System.out.println(doguinho.getCasrtado());
        System.out.println(doguinho.getPeso());
        System.out.println(doguinho.toString());
        // public static void soma(int a, int b){
            // int i = 2; //var do metodo soma
            // int soma = a+b+i+j;
        // }

        
       // Cachorro toto = new Cachorro("toto");
        //toto.toString();
    
    }
}
//todo atributo do objeto deve ser encapsulado
//sinal "+", public - variable global
//sinal "-", private - atributo
//sinal "#", protected
//sinal "~", package (heranca)
//atributo, metodos e classes podem ser private
//metodos sao funcoes que pertecem a uma classe 
//polimorfismo
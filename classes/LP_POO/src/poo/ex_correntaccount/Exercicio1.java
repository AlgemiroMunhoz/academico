package poo.ex_correntaccount;

public class Exercicio1 {
    
    public static void main(String[] args) {
        //A classe String representa cadeias de caracteres. 
        //Todos os literais de string em programas Java, como "abc", 
        //são implementados como instâncias dessa classe.
        //Strings são constantes; seus valores não podem ser alterados
        //depois de criados. Os buffers de string suportam strings mutáveis. 
        //Como os objetos String são imutáveis, eles podem ser compartilhados.
        //A variavel void nos permite fazer funções que não retornam nada e funções que não têm parâmetros
        // A função main devolve um inteiro para informar o sistema operacional sobre o fim da execução do programa.
        //A função devolve 0 para informar que o programa terminou de maneira normal e devolve um número diferente de 0 para informar que o programa terminou de maneira excepcional.
        //O parâmetro args é um array que recebe dados da command line (linha de comando), ou seja, no momento que executamos a nossa aplicação podemos enviar uma informação por meio dele.
        
        Current_Account pessoajuridica = new Current_Account("pessoajuridica", null, 0);
        //Criando o objeto do tipo classes, chamando pessoajuridica jurica
        //instanciando o objeto do tipo classes, chamando pessoajuridica atraves dos tipo new
        //Apos o new chamar o contrutor de classes
    
        pessoajuridica.setName("Algemiro");
        pessoajuridica.setAccountNumber(null);
        pessoajuridica.setBalance(10);
  
        System.out.println(pessoajuridica.getName());
        System.out.println(pessoajuridica.getAccountNumber());
        System.out.println(pessoajuridica.getBalance());

    }
}
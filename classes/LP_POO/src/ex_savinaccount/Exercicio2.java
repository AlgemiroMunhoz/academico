package ex_savinaccount;

public class Exercicio2 {

    public static void main(String[] args) {

        Savings_Account pessoafisica = new Savings_Account("pessoafisica");
        
        pessoafisica.setName("Algemiro");
        pessoafisica.setAccountNumber("13003214-6");
        pessoafisica.setBalance("20.0");
     
        System.out.println(pessoafisica.getName());
        System.out.println(pessoafisica.getAccountNumber());
        System.out.println(pessoafisica.getBalance());

    }
}

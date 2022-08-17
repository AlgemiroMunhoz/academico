package poo.ex_correntaccount;

//import java.net.http.HttpRequest.BodyPublisher;

public class Current_Account {
    
    // ------------atributos--------------------
    private String name;
    private String accountNumber;
    private double balance;
    //As variáveis do tipo double representam números de ponto flutuante de precisão dupla, onde precisam duas vezes a quantidade de memória das variáveis float fornecendo 15 dígitos, sendo o dobro da precisão de variáveis float.
    //Os valores do tipo double são conhecidos como literais de ponto flutuante

    //----------Contrutor--------------------
    public Current_Account(String name, String accountNumber, double balance){
        this.name = name;
        //This referencia os atributos que vão sempre existir
        this.accountNumber = accountNumber;
        this.balance = balance;    
    }

    // ------------Metodos--------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString(){
        return "Accont [name="+ name +", accountNumber=" + accountNumber +", balance= " + balance +"]";
    }

    public void setAccountNumber() {
    }
}

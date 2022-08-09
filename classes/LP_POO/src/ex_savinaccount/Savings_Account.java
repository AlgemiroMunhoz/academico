package ex_savinaccount;

public class Savings_Account {

    //---------atributes--------------------
    private String name;
    private String accountNumber;
    private String balance;

    //---------contrutor--------------------
    public Savings_Account(String name){
        System.out.println("Criando o objeto: " + name);
    }

    //---------Metodos--------------------
    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(String balance){
        this.balance = balance;
    }

    public String getBalance(){
        return this.balance;
    }

    @Override
    public String toString() { //transformar objeto em string
        return ("Name" + this.name + "\n accountNumber=" + this.accountNumber + " \n balance=" + this.balance);  
    }
    
}


package ex_cont_poup;

public class ContaPoupanca {
    private String nome;
    private double saldo;
    private int n_conta;
    private int n_agencia;
    
    public ContaPoupanca(double saldo_inicial){
        this.saldo = saldo_inicial;
    }  

    // --------Get and setters ------------------------
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public int getN_conta() {
        return this.n_conta;
    }

    public void setN_conta(int n_conta) {
        this.n_conta = n_conta;
    }
    
    public int getN_agencia() {
        return this.n_agencia;
    }

    public void setN_agencia(int n_agencia) {
        this.n_conta = n_agencia;
    }

    public String toString() {
        return "";
    }

    /**
     * 
    *@param valor
    *@return
    */

    public String depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return "Deposito Efetuado!";
        }

        return "Deposito Efetuado! Verifiqueo valor!";
    }

    public String sacar (int valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return "Saque efetuado, retire seu dinheiro!";
        }

        return "Erro ao efetuar o saque, verifique o valor";
    }    
}
//quando digitar o saque saber quantas notas de 5, 10 e 50
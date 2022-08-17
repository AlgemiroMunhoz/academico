package poo.ex_contacorrent;

public class Meubanco {

public static void main(String[] args){
    ContaCorrente conta_algemiro = new ContaCorrente (0,500);
    conta_algemiro.setNome("algemiro");
    conta_algemiro.setN_agencia(1234);
    conta_algemiro.setN_conta(13003214-6);
    
    conta_algemiro.depositar(120);
    conta_algemiro.depositar(75.20);
    
    //System.out.println("Saldo da conta_algemiro:" + conta_algemiro.toString());
    conta_algemiro.sacar(10000);
    
    ContaCorrente conta_samuel = new ContaCorrente(10000,30000);
    conta_samuel.setNome("algemiro");
    conta_samuel.setN_agencia(1234);
    conta_samuel.setN_conta(13003214-6);
    
    conta_samuel.sacar(40000);
    }
}

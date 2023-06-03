package Missao4;

public class Missao4_principal2 
{
    public static void main(String[] args) 
    {
        double Saldo_Atual, Limite_Atual;
        
        // Criando o objeto CC baseado na classe Missao4_Conta_Corrente
        Missao4_Conta_Corrente CC = new Missao4_Conta_Corrente("Magaly", 1250);
        CC.depositar(200.50);
        CC.sacar(50.25);
        Saldo_Atual = CC.getSaldo_CC();
        System.out.println("O saldo atual da conta é: R$  " + Saldo_Atual);
        CC.sacar(50.25);
        Saldo_Atual = CC.getSaldo_CC();
        System.out.println("O saldo atual da conta é: R$  " + Saldo_Atual);
        Limite_Atual = CC.getLimite_CC();
        System.out.println("O limite atual da conta é: R$  " + Limite_Atual);
        CC.setLimite_CC(5000);
        Limite_Atual = CC.getLimite_CC();
        System.out.println("O limite atual da conta é de: R$  " + Limite_Atual);
        CC.sacar(10000);
    }
}
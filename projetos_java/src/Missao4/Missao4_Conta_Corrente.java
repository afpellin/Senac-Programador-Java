package Missao4;

public class Missao4_Conta_Corrente {
    // Lista de atributos
    private String Nome_Cliente;
    private String Nun_CC;
    private double Saldo_CC;
    private double Limite_CC;

    // Método CONSTRUTOR
    public Missao4_Conta_Corrente(String Titular, double Limite) {
        // Atribuindo valores aos atributos
        this.Nome_Cliente = Titular;
        this.Limite_CC = Limite;

        // Aqui deve ser inserido o conteúdo do método CONSTRUTOR
        System.out.println("Uma conta corrente acabou de ser criada para o(a) Sr.(a) " + Titular);
        System.out.println("O valor do limite desta conta foi definido como: " + this.Limite_CC);
    }

    // Métodos
    public void sacar(double valor) {
        if (valor > this.Saldo_CC + this.Limite_CC) {
            System.out.println("O valor do saque excede o valor disponível na conta!");
        } else {
            // Aqui vai o código que realiza o saque na conta corrente
            this.Saldo_CC = this.Saldo_CC - valor;
            System.out.println("Um SAQUE foi realizado no valor de R$ " + valor);
        }
    }

    public void depositar(double valor) {
        // Aqui vai o código que realiza o depósito na conta corrente
        this.Saldo_CC = this.Saldo_CC + valor;
        System.out.println("Um DEPÓSITO foi realizado no valor de R$ " + valor);
    }

    public void setLimite_CC(double Limite_CC) {
        this.Limite_CC = Limite_CC;
        System.out.println("*** Houve alteração de limite para R$ " + Limite_CC);
    }
}
package Missao6;

public class Funcionario {
    private String nome_Func;
    private String CPF_Func;
    private double salario_Func;

    // Métodos getter e setter para os atributos

    public String getNome_Func() {
        return nome_Func;
    }

    public void setNome_Func(String nome_Func) {
        this.nome_Func = nome_Func;
    }

    public String getCPF_Func() {
        return CPF_Func;
    }

    public void setCPF_Func(String CPF_Func) {
        this.CPF_Func = CPF_Func;
    }

    public double getSalario_Func() {
        return salario_Func;
    }

    public void setSalario_Func(double salario_Func) {
        this.salario_Func = salario_Func;
    }
    
    public double BonificacaoAnual() {
        double salario_Com_Bonificacao = this.salario_Func + this.salario_Func * 0.1;
        return salario_Com_Bonificacao;
    }
    
    public double BonificacaoAnual(double salario) {
        double salario_Com_Bonificacao;
        if (salario < 1000)
            salario_Com_Bonificacao = this.salario_Func + this.salario_Func * 0.1 + 100;
        else
            salario_Com_Bonificacao = this.salario_Func + this.salario_Func * 0.1;
        return salario_Com_Bonificacao;
    }
}
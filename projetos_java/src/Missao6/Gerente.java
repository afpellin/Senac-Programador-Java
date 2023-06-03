package Missao6;

public class Gerente extends Funcionario implements ValidaSenha {
    // Atributos exclusivos do gerente
    private int Senha_Ger;
    private String Area_Ger;
    
    @Override
    public boolean valida(int senha) {
        if (this.Senha_Ger ==senha)
        	return true;
        else
        	return false;
    }   

    // Métodos set (SETTERS)
    public void setSenha_Ger(int Senha)
    {
        this.Senha_Ger = Senha;
    }

    public void setArea_Ger(String Area) 
    {
        this.Area_Ger = Area;
    }

    // Métodos get (GETTERS)
    public int getSenha_Ger() 
    {
        return this.Senha_Ger;
    }

    public String getArea_Ger() {
        return this.Area_Ger;
    }

    // Outros métodos
    public boolean validaSenha(int Senha) 
    {
        if(this.Senha_Ger == Senha)
        	return true;
        else
        	return false;
    }
    
    @Override
    public double BonificacaoAnual() {
        double salario_Com_Bonificacao = this.getSalario_Func() + this.getSalario_Func() * 0.15;
        return salario_Com_Bonificacao;
    }
}
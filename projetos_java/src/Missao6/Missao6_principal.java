package Missao6;

public class Missao6_principal {

    public static void main(String[] args) 
    {
    	Funcionario F1 = new Funcionario();
        F1.setNome_Func("Ciclano");
        F1.setCPF_Func("5678");
        F1.setSalario_Func(500.0);
        
    	Gerente G = new Gerente();
		G.setNome_Func("Fulano");
		G.setCPF_Func("445588");
		G.setSalario_Func(1000.0);
		G.setSenha_Ger(888);
		G.setArea_Ger("CONTAB");
		
		double Bonif_F = F1.BonificacaoAnual();
		double Bonif_G = G.BonificacaoAnual();

		// Apresentando os dados no console
		System.out.println("DADOS DO GERENTE:");
		System.out.println("Nome = " + G.getNome_Func());		
		System.out.println("Salário = " + G.getSalario_Func());
		System.out.println("Salário com Bonificação = " + Bonif_G);

		System.out.println("DADOS DO FUNCIONARIO NÃO GERENTE:");
		System.out.println("Nome = " + F1.getNome_Func());		
		System.out.println("Salário = " + F1.getSalario_Func());
		System.out.println("Salário com Bonificação = " + Bonif_F);
    }
}
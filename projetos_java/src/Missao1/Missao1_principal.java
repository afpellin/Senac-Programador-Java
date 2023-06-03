package Missao1;
/*
 * Autor; André Felipe
 * Data: 28/05/2023
 */
public class Missao1_principal 
{
	public static void main(String[] args) 
	{
		//Apresenta o Títula da Missão
		System.out.println("Início da Missão 1");
		System.out.println("Autor; André Felipe");
		System.out.println("Data: 28/05/2023");
		System.out.println("Cálculo da Nota Bimestral");
		//Declara as variáveis		
		int Nota_Trabalho;
		int Nota_Prova;
		int Nota_Bimestre;
		//Atribui valor as variáveis
		Nota_Trabalho = 22;
		Nota_Prova = 58;
		//Realiza a Soma (Passo 3 da Atividade)
		Nota_Bimestre = Nota_Trabalho + Nota_Prova;
		//Apresenta o Resultado da Nota Bimestral no Console (Passo 4 da Atividade)
		System.out.println("A nota bimestral é : " + Nota_Bimestre);
	}

}

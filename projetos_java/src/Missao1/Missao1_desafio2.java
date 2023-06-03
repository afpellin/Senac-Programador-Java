package Missao1;

public class Missao1_desafio2 {

	public static void main(String[] args) {
		System.out.println("MISSÃO 1 - DESAFIO 4 – Cálculo da Média Bimestral");
		System.out.println("ALTERAÇÃO DO DESAFIO 2");
		int Trab1B, Prova1B, Trab2B, Prova2B, Nota1B, Nota2B;
		double Media_Final;
		Trab1B = 15;
		Prova1B = 51;
		Trab2B = 28;
		Prova2B = 63;
		Nota1B = Trab1B + Prova1B;
		Nota2B = Trab2B + Prova2B;
		Media_Final = (double) (Nota1B + Nota2B)/2;
		System.out.println("A média final do aluno é : " + Media_Final);
	}

}

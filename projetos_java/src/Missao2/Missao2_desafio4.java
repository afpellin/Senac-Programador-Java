package Missao2;
/*
 * Autor: André Felipe
 * Data: 29/05/2023
 */
public class Missao2_desafio4 {

	public static void main(String[] args) {
		System.out.println("MISSÃO 2 – DESAFIO 4 – WHILE");
		System.out.println("Mostra os números IMPARES de 11 a 40, inclusive os extremos.");
		int i = 0;
		while (i<=40)
		{
			if (i%2 != 0)
			{
				System.out.println(i);
			}
			i = i + 3;
			}
		System.out.println("MISSÃO 2 – DESAFIO 4 – Concluido");
		}

	}
package Missao3;
/*
 * Autor: André Felipe
 * Data: 30/05/2023
 */
import java.util.Scanner; //Importar a classe Scanner

public class Missao3_Input {

	public static void main(String[] args) { //Início do método principal
		Scanner entrada = new Scanner(System.in); //Criando o objeto entrada baseado na classe Scanner
		
		System.out.print("Digite uma frase: "); //Mostrando a mensagem 1
		String Texto = entrada.nextLine(); //Lendo a frase
		
		System.out.println("Digite um Número Inteiro: "); //Mostrando a mensagem 2
		int N_int = entrada.nextInt(); //Lendo um número inteiro
		
		System.out.println("Digite um Número Real: "); //Mostrando a mensagem 3
		double N_double = entrada.nextDouble(); //Lendo um número com virgula
		
		System.out.println("Digite uma letra ou palavra: "); //Mostrando a mensagem 4
		String Palavra = entrada.next(); //Lendo uma letra ou palavra
		
		//Mostrando resultados
		System.out.println("A frase digitada foi: " + Texto);
		System.out.println("O número Inteiro foi: " + N_int);
		System.out.println("O número Real foi: " + N_double);
		System.out.println("A letra ou palavra digitada foi: " + Palavra);
		
		//Fechando o objeto entrada
		entrada.close();	
		
	} //Fim do método principal

} //Fim da classe

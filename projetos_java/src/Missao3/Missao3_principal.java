package Missao3;
import java.util.Scanner;
public class Missao3_principal {

	public static void main(String[] args) {
		double R_SOMAR, R_SUBTRAIR, R_MULTIPLICAR, R_DIVIDIR;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double num2 = scanner.nextDouble();
		
		System.out.println("Inicio da MISSÃO 3");
		Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();
		
		R_SOMAR = obj_calculadora.SOMAR(num1, num2);
		System.out.println("O resultado da soma é " + R_SOMAR);
		
		R_SUBTRAIR = obj_calculadora.SUBTRAIR(num1, num2);
		System.out.println("O resultado da subtração é " + R_SUBTRAIR);
		
		R_MULTIPLICAR = obj_calculadora.MULTIPLICAR(num1, num2);
		System.out.println("O resultado da multiplicação é " + R_MULTIPLICAR);
		
		R_DIVIDIR = obj_calculadora.DIVIDIR(num1, num2);
		System.out.println("O resultado da divisão é " + R_DIVIDIR);
		
		scanner.close();
	}
}
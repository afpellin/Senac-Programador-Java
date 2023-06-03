package Missao1;

public class Missao1_desafio3 {

    public static void main(String[] args) {
        System.out.println("MISSÃO 1 - DESAFIO 3 - Conversão de Tipos");
        int A, B;
        double R1, R2;
        A = 7;
        B = 6;
        R1 = A + B;
        R2 = (double) (A + B);
        System.out.println("O Resultado sem cast é: " + R1);
        System.out.println("O Resultado com cast é: " + R2);
        System.out.println("DESAFIO 3 CONCLUÍDO!");
    }

}
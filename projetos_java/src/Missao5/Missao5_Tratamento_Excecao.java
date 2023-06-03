package Missao5;

public class Missao5_Tratamento_Excecao {

    public static void main(String[] args) {
        int num = 20;
        double result;
        for (int i = 5; i > -5; i--) {
            try {
                result = num / i;
                System.out.println("O número " + num + " foi dividido por " + i + ".");
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero.");
            }
        }
    }

}
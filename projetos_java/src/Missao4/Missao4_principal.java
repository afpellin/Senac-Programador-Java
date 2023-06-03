package Missao4;
/*
 * Autor: André Felipe
 * Data: 30/05/2023
 */
import java.util.Scanner;

public class Missao4_principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Criação do objeto Scanner para entrada de dados

        String Nome_Autor; // Declara a variável Nome_Autor
        String Data_Codigo; // Declara a variável Data_Codigo
        Nome_Autor = "André Felipe - @afpellin"; // Atribui um valor à variável Nome_Autor
        Data_Codigo = "30/05/2023"; // Atribui um valor à variável Data_Codigo
        String Msg_inicial = "Início da Missão 4!"; // Declara a variável Msg_inicial e atribui um valor a ela
        System.out.println(Msg_inicial); // Mostra o conteúdo da variável Msg_inicial no console

        // Mostra a frase concatenada com os conteúdos das variáveis Nome_Autor e Data_Codigo
        System.out.println("Esse código foi desenvolvido por " + Nome_Autor + " em " + Data_Codigo + ".");
        // OPÇÃO EXTRA
        System.out.println("Repetindo de outra forma");
        String Frase = "Esse código foi desenvolvido por " + Nome_Autor + " em " + Data_Codigo + ".";
        System.out.println(Frase);
        // FIM DA OPÇÃO EXTRA
        System.out.println("--------------");
        System.out.println("Verificando o comprimento da String");
        String Nome = "Java";
        int tamanho = Nome.length();
        System.out.println("O tamanho da variável Nome é " + tamanho);
        System.out.println("--------------");
        System.out.println("Verificando se duas Strings são iguais (maneira 1)");
        String Nome_Cadastrado = "Java";
        String Nome_Digitado;
        System.out.println("Digite seu Nome: ");
        Nome_Digitado = entrada.nextLine();
        if (Nome_Cadastrado.equals(Nome_Digitado))
            System.out.println("Os nomes são iguais!");
        else
            System.out.println("Os nomes são diferentes!");
        System.out.println("--------------");
        System.out.println("Verificando se duas Strings são iguais (maneira 2)");
        String Nome_Cadastrado1 = "Java";
        String Nome_Cadastrado2 = "JAVA";
        if (Nome_Cadastrado1.equalsIgnoreCase(Nome_Cadastrado2))
            System.out.println("Os nomes são iguais!");
        else
            System.out.println("Os nomes são diferentes!");
        System.out.println("--------------");
        System.out.println("Identificando um caractere numa determinada posição");
        Nome = "Java";
        System.out.println("A primeira letra do nome é: " + Nome.charAt(0));
        for (int i = 0; i < Nome.length(); i++) {
            System.out.println(Nome.charAt(i));
        }

        entrada.close(); // Fechar o Scanner após o uso        
    }
}

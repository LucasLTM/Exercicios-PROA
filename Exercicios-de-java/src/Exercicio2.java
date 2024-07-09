import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
    }
}

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade
         do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".*/

        Scanner scanner = new Scanner(System.in);

        String nome;
        byte idade;

        System.out.println("Qual o seu nome?: ");
        nome = scanner.nextLine();

        System.out.println("E qual a sua idade?: ");
        idade = (byte) scanner.nextInt();

        System.out.println("Olá, " + nome + " você tem " + idade + " anos.");
    }
}

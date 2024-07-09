import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma
         de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada
          fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.*/

        Scanner scanner = new Scanner(System.in);

        //Retângulo

        double baseRetangulo;
        double alturaRetangulo;

        System.out.println("Digite a base do Retângulo: ");
        baseRetangulo = scanner.nextDouble();

        System.out.println("Digite a altura do Retângulo: ");
        alturaRetangulo = scanner.nextDouble();

        double resultadoRetangulo = baseRetangulo*alturaRetangulo;

        System.out.println("O valor da área do seu retângulo é: " + resultadoRetangulo);

        //Quadrado

        double ladoQuadrado;

        System.out.println("Digite o lado do seu quadrado: ");
        ladoQuadrado = scanner.nextDouble();

        double resultadoQuadrado = ladoQuadrado*ladoQuadrado;

        System.out.println("O valor da área do seu quadrado é: " + resultadoQuadrado);

        //Losango

        double dMaiorLosango;
        double dMenorLosango;

        System.out.println("Digite a maior diagonal do seu Losango: ");
        dMaiorLosango = scanner.nextDouble();

        System.out.println("Agora digite a menor diagonal do seu Losango: ");
        dMenorLosango = scanner.nextDouble();

        double resultadoLosango = (dMaiorLosango*dMenorLosango)/2;

        System.out.println("O valor da área do seu Losango é: " + resultadoLosango);

        // Trapézio

        double bMaiorTrapezio;
        double bMenorTrapezio;
        double alturaTrapezio;

        System.out.println("Digite o maior base do Trapézio");
        bMaiorTrapezio = scanner.nextDouble();

        System.out.println("Digite o menor base do Trapézio");
        bMenorTrapezio = scanner.nextDouble();

        System.out.println("Digite a altura do Trapézio");
        alturaTrapezio = scanner.nextDouble();

        double resultadoTrapezio = (bMaiorTrapezio*bMenorTrapezio)*alturaTrapezio/2;

        System.out.println("O valor da área do seu Trapézio é: " + resultadoTrapezio);

        //Papalelogramo

        double basePapalelogramo;
        double alturaPapalelogramo;

        System.out.println("Digite a base do Papalelogramo: ");
        basePapalelogramo = scanner.nextDouble();

        System.out.println("Digite a altura do Papalelogramo: ");
        alturaPapalelogramo = scanner.nextDouble();

        double resultadoPapalelogramo = baseRetangulo*alturaPapalelogramo;

        System.out.println("O valor da área do seu Papalelogramo é: " + resultadoPapalelogramo);

        //Triângulo

        double baseTriangulo;
        double alturaTriangulo;

        System.out.println("Digite a base do Triângulo: ");
        baseTriangulo = scanner.nextDouble();

        System.out.println("Digite a altura do Triângulo: ");
        alturaTriangulo = scanner.nextDouble();

        double resultadoTriangulo = (baseTriangulo*alturaTriangulo)/2;

        System.out.println("O valor da área do seu Triângulo é: " + resultadoTriangulo);

        //Círculo

        double piCirculo = 3.1415;
        double raioCirculo;

        System.out.println("Digite o valor do raio do Círculo");
        raioCirculo = scanner.nextDouble();

        double resultadoCirculo = piCirculo*(raioCirculo*raioCirculo);

        System.out.println("O valor da área do Círculo é: " + resultadoCirculo);
    }
}
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou
         neutro.*/

        Scanner scanner = new Scanner(System.in);

        double numeroDecimal;

        System.out.println("Por favor, digite algum número: ");
        numeroDecimal = scanner.nextDouble();

        if (numeroDecimal>0){
            System.out.println("O número que você escolheu é positivo");
        } else if (numeroDecimal<0) {
            System.out.println("O número que você escolheu é negativo");
        } else {
            System.out.println("O número que você escolheu é neutro");
        }
    }
}
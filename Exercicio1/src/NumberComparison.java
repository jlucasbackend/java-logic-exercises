import java.util.Scanner;

public class NumberComparison {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero = 0;
        int segundoNumero = 0;

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números escolhidos são iguais");
        } else {
            System.out.println("Os números escolhidos sao diferentes");
        }

        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("Os numeros sao iguais, não tem maior");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }

    }
}

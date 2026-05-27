import java.util.Scanner;

public class PositiveOrNegativeChecker {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        int numeroDigitado = 0;

        System.out.println("Digite um numero: ");
        numeroDigitado = leitor.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("O numero digitado é positivo");
        } else {
            System.out.println("O numero digitado é negativo");
        }
    }
}
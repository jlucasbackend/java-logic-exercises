import java.util.Scanner;

public class PasswordGuessGame {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int senha = 1234;
        int tentativas = 0;
        int numeroDigitado = 0;

        System.out.println("----- Descubra a senha -----");

        while (tentativas < 5) {
            System.out.println("Digite qual é a senha:");
            numeroDigitado = scanner.nextInt();
            tentativas++;

            if (numeroDigitado == senha) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.println("Sinto mt, vc errou!");
            }
        }
    }

}

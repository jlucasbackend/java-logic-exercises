import java.util.Scanner;

public class MinMaxNumberFinder {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado;
        int maiorNumero = 0;
        int menorNumero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numeroDigitado = scanner.nextInt();

            if (i == 0) {
                maiorNumero = numeroDigitado;
                menorNumero = numeroDigitado;
            }
            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }
            if (numeroDigitado < menorNumero){
                menorNumero = numeroDigitado;
            }

            System.out.println("Maior número: " + maiorNumero);
            System.out.println("Menor número: " + menorNumero);
        }
    }
}

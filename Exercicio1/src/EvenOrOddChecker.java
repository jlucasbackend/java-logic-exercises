import java.util.Scanner;

public class EvenOrOddChecker {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = 0;

        System.out.println("Digite um número: ");
        numeroEscolhido = scanner.nextInt();

        if (numeroEscolhido % 2 == 0 ) {
            System.out.println("Seu numero é par");
        } else {
            System.out.println("Seu numero é impar");
        }
    }
}

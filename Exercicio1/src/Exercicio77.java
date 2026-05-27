import java.util.Scanner;

public class Exercicio77 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String senha = "4321";
        int tentativas = 0;
        String palpite;

        System.out.println("----- Descubra a senha -----");

        while (tentativas < 5) {
            System.out.println("Acerte a senha: ");
            palpite = scanner.nextLine();
            tentativas++;

            if (palpite.equals(senha)) {
                System.out.println("Você Acertou!");
                break;
            } else {
                System.out.println("Você Errou! Tente outra vez: ");
            }

        }
    }
}

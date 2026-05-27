import java.util.Scanner;

public class DigitCounter {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantidadeDigitos = 0;

        System.out.println("Digite um número:");
        numero = scanner.nextInt();

        // enquanto o número for maior que 0
        while (numero > 0) {

            // remove o último dígito
            numero = numero / 10;

            // conta quantas vezes isso aconteceu
            quantidadeDigitos++;
        }

        System.out.println("Quantidade de dígitos: " + quantidadeDigitos);

    }
}

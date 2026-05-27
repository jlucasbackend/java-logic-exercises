import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;


        System.out.println("Digite o número para o calculo");
        numero = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "x" + i + "= " + (numero * i));
        }

    }
}

import java.util.Scanner;

public class AreaCalculatorMenu {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int numero = 0;

        System.out.println("-----Escolha o calculo:-----");

        while (escolha != 3) {
            System.out.println("1: para calcular a área do quadrado");
            System.out.println("2: para calcular a área do círculo");
            System.out.println("3: para sair");
            System.out.println("-------------------------------");
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("Você escolheu a opção 1");
                System.out.println("Digite o numero para o calculo: ");
                double lado = scanner.nextDouble();
                double areaDoQuadrado = lado * lado;
                System.out.println("Area do quadrado é: " + areaDoQuadrado);
                break;
            } else if (escolha == 2) {
                System.out.println("Você escolheu a opção 2");
                System.out.println("Digite o numero para o calculo: ");
                double raio = scanner.nextDouble();
                double areaDoCirculo = 3.14 * (raio * raio);
                System.out.println("A area do raio é: " + areaDoCirculo);
                break;
            } else if (escolha == 3) {
                System.out.println("Você saiu do programa");
                break;
            } else {
                System.out.println("Opção invalida");
            }
        }

    }
}

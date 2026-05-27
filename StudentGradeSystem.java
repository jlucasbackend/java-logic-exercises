import java.util.Scanner;

public class StudentGradeSystem {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double media = 0.0;

        System.out.println("----- Sistemas de notas -----");


        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();


        media = (nota1 + nota2 + nota3) /3;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado! Parabéns");
        } else if (media > 5 && media < 7) {
            System.out.println("Você está na recuperação!");
        } else {
            System.out.println("Sinto mt! Você foi reprovado");
        }
    }
}

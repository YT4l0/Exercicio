import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numeroA = obterIntValido(scanner);

        System.out.println("Digite o segundo número inteiro:");
        int numeroB = obterIntValido(scanner);

        int soma = numeroA + numeroB;
        System.out.println("A soma dos números é: " + soma);
    }

    public static int obterIntValido(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.next();
                int numero = Integer.parseInt(input);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor informado não é um número inteiro válido. Tente novamente:");
            }
        }
    }
}

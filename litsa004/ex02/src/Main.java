import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            n1 = scanner.nextInt();

            if (n1 > maior) {
                maior = n1;
            }
            if (n1 < menor) {
                menor = n1;
            }
        }

        System.out.println("O maior número é " + maior + " e o menor é " + menor);

        scanner.close();
    }
}

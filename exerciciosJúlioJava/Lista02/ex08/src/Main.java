import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1;
        double resto;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n1 = scanner.nextInt();
        resto = n1 % 2;
        if (resto == 0) {
            System.out.println("O número " + n1 + " é par!");
        }

        else {
            System.out.println("O número" + n1 + " é ímpar!");
        }

        scanner.close();
    }
}
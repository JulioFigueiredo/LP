import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        for (int i = n1; i > 1; i--) {
            int resto = n1 % 1;
            if (resto > 0) {
                System.out.println("O número não é primo");
                break;
            }
            else {
                System.out.println("O número é primo");
                break;
            }
        }

    }
}
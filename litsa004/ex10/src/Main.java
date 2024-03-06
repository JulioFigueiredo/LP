import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números da sequência Fibonacci você deseja? ");
        int n = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.print("Sequência de Fibonacci: ");
        System.out.print(primeiro + " " + segundo + " ");

        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
    }
}

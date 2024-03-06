import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n1 = scanner.nextInt();

        for (int i = 0; i <11; i++) {
            System.out.println(n1 * i);

        }

        scanner.close();
    }
}
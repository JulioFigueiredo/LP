import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        n2 = scanner.nextDouble();

        if (n1 > n2) {
            System.out.println(" O número " + n1 + "é maior que " + n2);
        }

        else {
            System.out.println(" O número " + n2 + " é maior que " + n1);
        }

        scanner.close();
    }
}
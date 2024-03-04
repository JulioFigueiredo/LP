import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2, n3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite um número: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite um número: ");
        n3 = scanner.nextDouble();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
        }

        if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
        }

        if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        }

        if (n2 > n1 && n2 > n3 && n1 < n3) {
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);
        }

        if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
        }

        if (n3 > n1 && n3 > n2 && n1 < n2) {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }

        scanner.close();
    }
}
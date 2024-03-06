import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        int n2 = scanner.nextInt();
        int i = n2;
        if (n1 > n2) {
            for (; i < n1; i++) {
                System.out.println(i);
            }
        }
        else {
            for (; i > n1; i--) {
                System.out.println(i);
            }
        }

    }
}
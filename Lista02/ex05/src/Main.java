import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2, med;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextDouble();
        med = (n1 + n2) / 2;

        if (med >= 8.5) {
            System.out.println(" Você é A ");
        } else if (med >= 7 && med < 8.5) {
            System.out.println("Você é B");
        } else if (med >= 5 && med < 7) {
            System.out.println("Você é C");
        } else {
            System.out.println("Você é D");
        }

        scanner.close();
    }
}
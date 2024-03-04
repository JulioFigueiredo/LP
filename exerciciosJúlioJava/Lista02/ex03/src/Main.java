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

        if (med >= 50) {
            System.out.println(" Aprovado! ");
        }

        else {
            System.out.println("Reprovado! ");
        }

        scanner.close();
    }
}
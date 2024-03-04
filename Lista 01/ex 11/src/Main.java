import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tempcel, tempfa;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        tempcel = scanner.nextDouble();
        tempfa = (tempcel * 9/5) + 32;
        System.out.println("O valor em Fahreinheit é: " + tempfa);

        scanner.close();
    }
}
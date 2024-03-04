import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente 'a':");
        double a = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'b':");
        double b = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'c':");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As soluções da equação " + a + "x^2 + " + b + "x + " + c + " = 0 são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A única solução da equação " + a + "x^2 + " + b + "x + " + c + " = 0 é:");
            System.out.println("x = " + x);
        } else {
            System.out.println("A equação não possui solução real.");
        }

        scanner.close();
    }
}

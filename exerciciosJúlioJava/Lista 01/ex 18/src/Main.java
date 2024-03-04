import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente 'a':");
        double a = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'b':");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação é indeterminada. Qualquer valor de x é solução.");
            } else {
                System.out.println("A equação é impossível. Não existe solução.");
            }
        } else {
            double x = -b / a;
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é:");
            System.out.println("x = " + x);
        }

        scanner.close();
    }
}

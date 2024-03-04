import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double base, alt, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida da base: ");
        base = scanner.nextDouble();
        System.out.println("Digite a medida da altura: ");
        alt = scanner.nextDouble();

        resultado = (base * alt) / 2;

        System.out.println("A área do triangulo retângulo é: " + resultado);





        scanner.close();
    }
}
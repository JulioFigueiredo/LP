import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double raio, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo: ");
        raio = scanner.nextDouble();

        resultado = (raio * raio) * 3.14;

        System.out.println("A área do círculo é: " + resultado);





        scanner.close();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double raio, alt, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida do raio: ");
        raio = scanner.nextDouble();
        System.out.println("Digite a medida da altura: ");
        alt = scanner.nextDouble();

        resultado = (3.14 * (raio * raio) * alt);

        System.out.println("A área do cilindro é: " + resultado);





        scanner.close();
    }
}
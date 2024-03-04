import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double velkm, velms;

        Scanner scanner = new Scanner(System.in);
        /* System.out.println("Digite uma velocidade em km/h: ");
        velkm = scanner.nextInt();
        velms = velkm / 3.6;

        System.out.println("A velocidade que você digitou em m/s é: " + velms);

         */

        System.out.println("Digite uma velocidade em m/s: ");
        velms = scanner.nextDouble();
        velkm = velms * 3.6;

        System.out.println("A velocidade que você digitou em km/h é: " + velkm);

        scanner.close();
    }
}
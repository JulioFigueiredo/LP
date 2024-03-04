import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double medkm, medmi;
        Scanner scanner = new Scanner(System.in);
        /* System.out.println("Digite uma medida em km: ");
        medkm = scanner.nextDouble();
        medmi = medkm / 1.6;
        System.out.println("O valor que você passou em km, em milha é: " + medmi); */



        System.out.println("Digite uma medida em milhas: ");
        medmi = scanner.nextDouble();
        medkm = medmi * 1.6;
        System.out.println("O valor que você passou em milha, em km é: " + medkm);

        scanner.close();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double medmm, medpol;
        Scanner scanner = new Scanner(System.in);
        /* System.out.println("Digite uma medida em mm: ");
        medmm = scanner.nextDouble();
        medpol = medmm / 25.4;
        System.out.println("O valor que você passou em mm, em polegadas é: " + medpol); */

        System.out.println("Digite uma medida em polegadas: ");
        medpol = scanner.nextDouble();
        medmm = medpol * 25.4;
        System.out.println("O valor que você passou em polegadas, em mm é: " + medmm);

        scanner.close();


    }
}
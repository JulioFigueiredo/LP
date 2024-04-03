import java.util.Scanner;
public class Main {
    public static int funcaopot(int n1, int pot) {
        if (n1 <= 0) {
            System.out.println("O número deve ser maior que 0");
            return 0;
        }

        if (pot == 0) {
            System.out.println("Qualquer número elevado a zero é igual a 1");
            return 0;
        }

        int aux = n1;
        for (int i = 1; i < pot; i++) {
            aux *= n1;
        }
        return aux;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o quanto ele será elevado: ");
        int pot = scanner.nextInt();
        int resultado = funcaopot(n1, pot);
        System.out.println("O número " + n1 + " elevado a " + pot + " é: " + resultado);
    }
}
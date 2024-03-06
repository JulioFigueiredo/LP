import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        int n2 = n1 - 1;
        int fatorial = 1;
        for (int i = n2; i > 1; i--) {
            fatorial = n1 *= i;



        }
        System.out.println("O número escolhido em fatorial é: " + fatorial);
    }
}
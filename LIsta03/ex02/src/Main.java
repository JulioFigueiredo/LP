import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2, soma, sub, mul, div;
        int op;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n1 = scanner.nextInt();
        System.out.print("Digite mais um número: ");
        n2 = scanner.nextInt();
        System.out.println("Escolha uma opção: 1. Soma 2. Subtração 3. Multiplicação 4. Divisão ");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                soma = n1 + n2;
                System.out.println("A soma entre " + n1 + " e " + n2 + " é " + soma);
                break;
            case 2:
                sub = n1 - n2;
                System.out.println("A subtração entre " + n1 + " e " + n2 + " é " + sub);
                break;
            case 3:
                mul = n1 * n2;
                System.out.println("A multiplição entre " + n1 + " e " + n2 + " é " + mul);
                break;
            case 4:
                div = n1 / n2;
                System.out.println("A divisão entre " + n1 + " e " + n2 + " é " + div);
                break;
            default:
                System.out.println("opção inválida! ");
                break;
        }






        scanner.close();
    }
}
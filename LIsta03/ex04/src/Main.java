import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double valor, deb, pix, par4, par5;
        int op, par;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        valor = scanner.nextDouble();
        System.out.println("Escolha uma opção: 1. Débito 2. Pix 3. Crédito ");
        op = scanner.nextInt();
        deb = valor * 0.95;
        pix = valor * 0.9;
        par4 = valor * 1.02;
        par5 = valor * 1.05;


        switch (op) {
            case 1:
                System.out.println("O valor com desconto de 5% é: " + deb);

                break;
            case 2:
                System.out.println("O valor com desconto de 10% é: " + pix);
                break;
            case 3:
                System.out.println("Quantas vezes será feito o parcelamento: ");
                par = scanner.nextInt();
                if (par <= 4) {
                    System.out.println("O valor com juros de 2% será: " + par4);
                }
                else {
                    System.out.println("O valor com juros de 5% será: " + par5);
                }

                break;

            default:
                System.out.println("opção inválida! ");
                break;
        }






        scanner.close();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double valor, trocoexp, trocolon, trococap, trococho;
        int op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: 1. Café expresso R$ 0,50  2. Café longo R$ 1,00   3. Capuccino R$ 2,50  4. Chocolate R$ 2,00 ");
        op = scanner.nextInt();
        System.out.println("Insira o dinheiro em reais: ");
        valor = scanner.nextDouble();


        switch (op) {
            case 1:
                System.out.println("Bebida selecionada: Café expresso ");
                trocoexp = valor - 0.5;
                System.out.println("Seu troco é de: R$ " + trocoexp);

                break;
            case 2:
                System.out.println("Bebida selecionada: Café longo ");
                trocolon = valor - 1;
                System.out.println("Seu troco é de R$ " + trocolon);

                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino ");
                trococap = valor - 2.5;
                System.out.println("Seu troco é de R$ " + trococap);

                break;

            case 4:
                System.out.println("Bebida selecionada: Chocolate ");
                trococho = valor -2;
                System.out.println("Seu troco é de R$ " + trococho);

            default:
                System.out.println("opção inválida! ");
                break;
        }






        scanner.close();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma opção entre 5 e 9: ");
        n1 = scanner.nextDouble();


        if (n1 >= 5 && n1 <= 9) {
            System.out.println("Você escolheu a opção " + n1);
        }

        else {
            System.out.println("Você escolheu um número fora do range estabelecido! ");
        }

        scanner.close();
    }
}
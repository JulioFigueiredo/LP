import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float nota1, nota2, med;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota (tem peso 1): ");
        nota1 = scanner.nextFloat();
        System.out.println("Digite sua segunda nota (tem peso 2): ");
        nota2 = scanner.nextFloat();
        med = (nota1 + (nota2 * 2)) / 3;
        System.out.println("A média entre as duas notas é: " + med);



        scanner.close();
    }
}
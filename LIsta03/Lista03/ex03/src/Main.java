import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double areacir, percir, raio, base, alt, areatri, pertri, hip, compret, larret, arearet, perret;
        int op;
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: 1. Círculo 2. Triângulo Retângulo 3. Retângulo ");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o raio: ");
                raio = scanner.nextDouble();
                areacir = pi * (raio * raio);
                percir = 2 * pi * raio;
                System.out.println("A área do círculo é: " + areacir + " e seu perímetro é: " + percir);

                break;
            case 2:
                System.out.println("Digite a medida da base: ");
                base = scanner.nextDouble();
                System.out.println("Digite a medida da altura: ");
                alt = scanner.nextDouble();
                System.out.println("Digite a medida da hipotenusa: ");
                hip = scanner.nextDouble();
                areatri = (base * alt) / 2;
                pertri = base + alt + hip;
                System.out.println("O perímetro do triângulo é: " + pertri + " A área é: " + areatri);

                break;
            case 3:
                System.out.println("Digite a medida do comprimento: ");
                compret = scanner.nextDouble();
                System.out.println("Digite a largura: ");
                larret = scanner.nextDouble();
                arearet = compret * larret;
                perret = (compret*2) + (larret*2);
                System.out.println("O perímetro do retângulo é: " + perret + " A área é: " + arearet);

                break;

            default:
                System.out.println("opção inválida! ");
                break;
        }






        scanner.close();
    }
}
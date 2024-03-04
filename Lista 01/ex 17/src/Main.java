import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double velocidadeInicial, aceleracao, tempo, velocidadeFinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Velocidade inicial: ");
        velocidadeInicial = scanner.nextDouble();
        System.out.println("Digite a aceleração: ");
        aceleracao = scanner.nextDouble();
        System.out.println("Digite o Tempo: ");
        tempo = scanner.nextDouble();

        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);


        System.out.println("A velocidade final é: " + velocidadeFinal);





        scanner.close();
    }
}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        int dobro = numeroInteiro * 2;
        int quadrado = numeroInteiro * numeroInteiro;
        int sobre5 = numeroInteiro / 5;
        System.out.println("Você inseriu o número: " + numeroInteiro);
        System.out.println("O dobro dele é: " + dobro);
        System.out.println("Seu número elevado ao quadrado é: " + quadrado);
        System.out.println("A quinta parte deste número é: " + sobre5);
        scanner.close();
    }
}

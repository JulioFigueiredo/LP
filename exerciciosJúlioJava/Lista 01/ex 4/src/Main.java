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
        System.out.println("Por favor, insira sua primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Por favor, insira sua primeira nota: ");
        int nota2 = scanner.nextInt();
        int media = (nota1 + nota2) / 2;
        System.out.println("A média entre as notas é: " + media);
    }
}

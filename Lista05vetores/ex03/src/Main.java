import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;
        int posicao = 0;
        int [] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (n1 == numeros[i]){
                encontrado = true;
                posicao = i;
                break;
            }

        }
        if (encontrado) {
            System.out.println(n1 + " foi encontrado na posição " + posicao);
        }

        else {
            System.out.println("Valor não encontrado! ");
        }







    }
}
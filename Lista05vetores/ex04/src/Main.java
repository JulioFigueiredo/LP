
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int [10];
        int maior = 0;
        int menor = 0;
        int posmaior = 0;
        int posmenor = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor [i] = scanner.nextInt();
            menor = vetor [0];


            if (vetor [i] > menor) {
                maior = vetor [i];

            }
            else {
                menor = vetor[i];


            }


        }
        for (int j = 0; j < vetor.length; j++){
            if (vetor [j] == maior) {
                posmaior = j;
            }
            if (vetor [j] == menor) {
                posmenor = j;
            }
        }
        System.out.println("Maior valor: " + maior + " Na posição: " + posmaior);
        System.out.println("Menor valor: " + menor + " Na posição: " + posmenor);
    }
}
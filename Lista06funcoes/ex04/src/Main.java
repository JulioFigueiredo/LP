import java.util.Scanner;
public class Main {
    public static int funcaopalin(String s1) {
        char inverso = 0;
        char aux = 0;
        for (int j = 0; j < s1.length(); j++) {
            aux = s1.charAt(j);
        }
        for (int i = s1.length() -1; i >= 0; i--) {
            inverso = s1.charAt(i);
            System.out.print(inverso);

        }
        if (aux != inverso) {
            System.out.println(" A String não é um palíndromo! ");
        }

        else {
            System.out.println(" A String é um palíndromo! ");
        }

        return inverso;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String s1 = scanner.nextLine();
        int resultado = funcaopalin(s1);
        System.out.println(resultado);
    }
}
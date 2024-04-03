import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um numero: ");
            n = scanner.nextInt();
        }
        while (n<=0);

        System.out.println("Digite um numero para ser elevado a ele: ");
        int elev = scanner.nextInt();

        System.out.println("O número " + n + " elevado a " + elev + " é");
        System.out.println(elev(n, elev));
    }

    static int elev(int n, int elev) {
        if (elev==1)
            return n;
        return n*elev(n,elev-1);
    }

}
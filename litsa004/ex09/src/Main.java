import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;
        while (jogarNovamente) {
            int i = 1;
            boolean continuar = true;
            while (i < 11 && continuar) {
                System.out.println("Tabuada do " + i);
                for (int j = 1; j < 11; j++) {
                    System.out.print(i + " * " + j + " = ");
                    int resp = scanner.nextInt();
                    int result = i * j;
                    boolean teste = result == resp;



                    if (teste) {
                        System.out.println("Parabéns");
                    } else {
                        System.out.println("Errado! A resposta correta é: " + result);
                        System.out.println("Deseja jogar novamente? [s/n]");
                        String jogar_dnv = scanner.next();
                        if (jogar_dnv.equalsIgnoreCase("n")) {
                            continuar = false;
                            break;
                        }
                    }

                    if (i == 10 && j == 10) {
                        System.out.println("Última pergunta! ");
                        if (teste == true) {
                            System.out.println("Parabéns, tudo certo! Deseja jogar novamente? [s/n]");
                            String jogarNovamenteInput = scanner.next();
                            if (jogarNovamenteInput.equalsIgnoreCase("s")) {
                                jogarNovamente = false;
                            }
                        }

                    }

                }
                i++;



            }
        }
    } }

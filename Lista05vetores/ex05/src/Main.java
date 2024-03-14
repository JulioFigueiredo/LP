import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] inverso = new int [vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            inverso[i] = vetor  [(vetor.length -i) -1];


        }
        System.out.println("vetor original: " + Arrays.toString(vetor) );
        System.out.println("vetor inverso: " + Arrays.toString(inverso));
    }
}
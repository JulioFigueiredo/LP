import java.util.Arrays;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vetor Original: " + numeros[i]);


            if (i % 2 == 0) {
                numeros[i] += 2;
            }
            else {
                numeros[i] *= 2;
            }

            System.out.println("vetor modificado: " + numeros[i]);


        }
    }
}
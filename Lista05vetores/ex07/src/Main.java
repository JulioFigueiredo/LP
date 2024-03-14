public class Main {
    public static void main(String[] args) {
        int maiorsomalinha = 0;
        int linhamaior = 0;
        int maiorsomacoluna = 0;
        int colunamaior = 0;
        int[][] matriz = {{0, 1, 2, 3, 4}
                , {5, 6, 7, 8, 9}
                , {10, 11, 12, 13, 14}
                , {15, 16, 17, 18, 19}
                , {20, 21, 22, 23, 24}};
        // calculando a soma de linhas
        for (int i = 0; i < matriz.length; i++) { // length quantidade de linhas
            int somaLinha = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorsomalinha) {
                maiorsomalinha = somaLinha;
                linhamaior = i;

            }

        }
        // soma das colunas
        for (int j = 0; j < matriz.length; j++) { // length quantidade de linhas
            int somaColunas = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColunas += matriz[i][j];
            }
            if (somaColunas > maiorsomacoluna) {
                maiorsomacoluna = somaColunas;
                colunamaior = j;

            }




        }
        System.out.println("A maior soma entre linhas é de: " + maiorsomalinha + " e a posição desta linha é: " + linhamaior);
        System.out.println("A maior soma entre colunas é de " + maiorsomacoluna + " e a posição desta coluna é: " + colunamaior);
}}

public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {{1, 2, 1},
                {3, 2, 2},
                {1,1, 3}};
        System.out.println();
        det(matriz);
        System.out.println();
    }

    static int det (int [][]m) {
        int cont = 0;
        for (int i = 0; i < m.length-1; i++) { // 0 a 12 sao 13
            cont = i;
            for (int j = 0; j < m.length-1; j++) {
                System.out.println(j + " - " + cont);
                cont++;
                if (cont>m.length-1) {
                    cont = 0;
                }

            }

        }




        return 0;
    }
}
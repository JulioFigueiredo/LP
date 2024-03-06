public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            System.out.println("Tabuada do: " + i);
            for (int j = 1; j < 11; j++) {
                System.out.println(i * j);
            }


            i++;
        }
    }
}
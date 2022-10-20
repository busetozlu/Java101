public class AsalSayiBulanProgram {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int test = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    test = 1;
                    break;
                }
            }if (test == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
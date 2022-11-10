import java.util.Arrays;

public class DiziElemanlariFrekans {
    static boolean ignore(int[] arr, int value, int c) {
        for (int i = 0; i < c; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
        return true;
    }

    static int equalCount(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }
        return count;
    }
    public static void main(String[]args){
        int [] arry={10,20,20,10,10,20,5,20};
        System.out.println("Dizi : "+ Arrays.toString(arry));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < arry.length; i++) {
            if (ignore(arry, arry[i], i)) {
                System.out.println(arry[i] + " sayısı " + equalCount(arry, arry[i]) + " kez tekrar edildi.");
            }
        }
    }
}

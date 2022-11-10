import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlariSiralama {
    public static void main (String[]args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n=input.nextInt();
        int el=1;
        int [] number=new int[n];
        for (int i=0; i<number.length; i++){
            System.out.print( el +". Elemanı : ");
            el+=1;
            number[i]=input.nextInt();
        }
        Arrays.sort(number);
        System.out.println("Sıralama : "+Arrays.toString(number));
    }
}

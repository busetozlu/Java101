import java.util.Scanner;
public class UsHesabiMetot {
    static int power(int a,int b){
        int result=1;
        for (int i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        while (true){
            System.out.print("Taban değeri giriniz:");
            int a=inp.nextInt();
            System.out.print("Üs değeri giriniz:");
            int b=inp.nextInt();
            System.out.println("Sonuç:"+power(a,b));
        }
    }
}

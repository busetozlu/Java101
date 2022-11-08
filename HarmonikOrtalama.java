import java.util.Scanner;
public class HarmonikOrtalama {
    public static void main(String[]args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Dizideki eleman sayısını giriniz:");
        n=input.nextInt();
        int [] dizi=new int[n];
        double sum=0.0;
        double harmonik=0.0;
        double toplam=0.0;
        for (int i=0; i<dizi.length; i++){
            sum+=dizi[i]+1;
            toplam+=1/sum;
            //System.out.println(toplam);
        }
        harmonik=(n/toplam);
        System.out.println("Harmonik ortalama= "+harmonik);
    }
    }



import java.util.Arrays;
import java.util.Scanner;
public class MatrisTranspozunuBulma {
    public static void main(String[]args){
        Scanner inp= new Scanner(System.in);
        int row,col;
        System.out.print("Matrisin satır sayısı : ");
        row=inp.nextInt();
        System.out.print("Matrisin sütun sayısı : ");
        col=inp.nextInt();
        int [][] arr=new int[row][col];
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print((i+1)+".Satır " + (j+1)+".Sütunu: " + " giriniz :");
                arr[i][j]=inp.nextInt();
                }
            }
        System.out.println("Matris : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpoz : ");
        for (int i=0; i<col; i++){
            for (int j=0; j<row; j++){
                System.out.print(" "+arr[j][i]);
            }
            System.out.println();
        }
    }
}


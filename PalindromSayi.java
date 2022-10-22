public class PalindromSayi {
    static boolean isPalindrom (int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
            if (temp==reverseNumber){
                return true;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println(isPalindrom(4));
    }

}


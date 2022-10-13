import java.util.Scanner;
public class BurcBulma {
    public static void main(String[]args) {
        int month, day;
        String burc="";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz:");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz:");
        day = input.nextInt();
        if (month <= 12) {
            if (month == 1) {
                if (day >= 1 && day <= 21) {
                    burc = "Oğlak";
                } else if (day >= 22 && day <= 31) {
                    burc="Kova";
                } else {
                    isError=true;
                }
            } else if (month == 2) {
                if (day >= 1 && day <= 19) {
                    burc="Kova";
                } else if (day >= 20 && day <= 31) {
                    burc="Balık";
                } else {
                    isError=true;
                }

            } else if (month == 3) {
                if (day >= 1 && day <= 20) {
                    burc="Balık";
                } else if (day >= 21 && day <= 31) {
                    burc="Koç";
                } else {
                    isError=true;
                }

            }
            else if (month == 4) {
                if (day >= 1 && day <= 21) {
                    burc="Koç";
                } else if (day >= 21 && day <= 31) {
                    burc="Boğa";
                } else {
                    isError=true;
                }

            }
            else if (month == 5) {
                if (day >= 1 && day <= 21) {
                    burc="Boğa";
                } else if (day >= 21 && day <= 31) {
                    burc="İkizler";
                } else {
                    isError=true;
                }

            }
            else if (month == 6) {
                if (day >= 1 && day <= 22) {
                    burc = "İkizler";
                } else if (day >= 23 && day <= 31) {
                    burc = "Yengeç";
                } else {
                    isError = true;
                }
            }
            else if (month == 7) {
                if (day >= 1 && day <= 22) {
                    burc="Yengeç";
                } else if (day >= 23 && day <= 31) {
                    burc="Aslan";
                } else {
                    isError=true;
                }

            }
            else if (month == 8) {
                if (day >= 1 && day <= 22) {
                    burc="Aslan";
                } else if (day >= 23 && day <= 31) {
                    burc="Başak";
                } else {
                    isError=true;
                }

            }
            else if (month == 9) {
                if (day >= 1 && day <= 22) {
                    burc="Başak";
                } else if (day >= 23 && day <= 31) {
                    burc="Terazi";
                } else {
                    isError=true;
                }

            }
            else if (month == 10) {
                if (day >= 1 && day <= 22) {
                    burc="Terazi";
                } else if (day >= 23 && day <= 31) {
                    burc="Akrep";
                } else {
                    isError=true;
                }

            }
            else if (month == 11) {
                if (day >= 1 && day <= 21) {
                    burc="Akrep";
                } else if (day >= 22 && day <= 31) {
                    burc="Yay";
                } else {
                    isError=true;
                }

            }
            else if (month == 12) {
                if (day >= 1 && day <= 21) {
                    burc="Yay";
                } else if (day >= 22 && day <= 31) {
                    burc="Oğlak";
                } else {
                    isError=true;
                }

            }

        } else if(month>=13) {
            isError=true;
        }
        if (isError){

            System.out.println("Hatalı işlem yaptınız, lütfen tekrar deneyin...");
        } else
        {
            System.out.print("Burcunuz:"+burc);
        }


    }
}
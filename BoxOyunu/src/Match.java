public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    public void run(){
        int first=0;
        boolean fistRate = f1.isStarting();
        if(isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("===========YENİ ROUND============");
                if(fistRate && first == 0){
                    System.out.println(f1.name+" ilk yumruğu attı.");
                    f2.health = f1.hit(f2);
                    first=1;
                    if (isWin()){
                        break;
                    }
                }
                if(!fistRate && first == 0){
                    System.out.println(f2.name+" ilk yumruğu attı.");
                    f1.health = f2.hit(f1);
                    first=1;
                    if (isWin()){
                        break;
                    }
                }
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
                }
            } else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }
    boolean isCheck(){
        return(this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);

    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" Kazandı");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" Kazandı");
            return true;
        }
        return false;
    }
    public void printScore(){
        System.out.println(this.f1.name+" Sağlık :"+this.f1.health);
        System.out.println(this.f2.name+" Sağlık :"+this.f2.health);
    }


}

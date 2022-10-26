public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount;
    double bonusAmount;
    double workTime;
    double salaryIncrease;
    double totalSalary;
    double baseSalary;
    int currentYear=2021;

    Employee(String name, double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.baseSalary=salary;
    }
    double tax(){
        if(this.salary<1000){
            taxAmount=0;
            return 0;
        }else {
            taxAmount=(this.salary*0.03);
            salary-=taxAmount;
            return taxAmount;
        }
    }
    double bonus(){
        if(this.workHours>40){
            bonusAmount=(this.workHours-40)*30;
            salary+=bonusAmount;
            return bonusAmount;
        }else {
            return 0;
        }
    }
    double raiseSalary(){
        workTime=currentYear-this.hireYear;
        if (workTime>20) {
            salaryIncrease=baseSalary*0.15;
            totalSalary=salary+salaryIncrease;
            return salaryIncrease;
        }else if (workTime>9 && workTime<20) {
            salaryIncrease = baseSalary * 0.10;
            totalSalary = salary + salaryIncrease;
            return salaryIncrease;
        }else if (workTime<10){
            salaryIncrease=baseSalary*0.05;
            totalSalary=salary+salaryIncrease;
            return salaryIncrease;
        } else {
            return 0;
        }
    }
    public String toString(){
        return "Adı : "+this.name+"\n"
                +"Maaşı : "+this.salary+"\n"
                +"Çalışma Saati : "+this.workHours+"\n"
                +"Başlangıç Yılı : "+this.hireYear+"\n"
                +"Vergi : "+ tax()+"\n"
                +"Bonus : "+ bonus()+"\n"
                +"Maaş Artışı : "+ raiseSalary()+"\n"
                +"Vergi ve Bonuslar ile birlikte maaş : "+this.salary+"\n"
                +"Toplam Maaş : "+this.totalSalary;
    }
}

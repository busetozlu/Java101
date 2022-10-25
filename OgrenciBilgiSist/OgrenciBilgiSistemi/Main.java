public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","0555","TRH");
        Teacher t2=new Teacher("Graham Bell","0554","FZK");
        Teacher t3=new Teacher("Külyutmaz","0534","BIO");

        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","1020","FZK");
        fizik.addTeacher(t2);
        Course biyoloji=new Course("Bİyoloji","103","BIO");
        biyoloji.addTeacher(t3);

        Student s1=new Student("Buse Tozlu","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(10,50,30,50,80,90);
        s1.isPass();
        Student s2=new Student("Levent Tozlu","444","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(40,90,10,90,80,70);
        s2.isPass();
    }
}
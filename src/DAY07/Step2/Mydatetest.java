package DAY07.Step2;

public class Mydatetest {
    public static void main(String[] args) {
        Mydate date1 = new Mydate(30,2,2000);
        System.out.println(date1.isValid());
        Mydate date2 = new Mydate(2,10,2006);
        System.out.println(date2.isValid());
    }
}

package DAY14.Step5;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("태백산맥 1");
        shelfQueue.enQueue("태백산맥 2");
        shelfQueue.enQueue("태백산맥 3");

        System.out.println(shelfQueue.deQueQue());
        System.out.println(shelfQueue.deQueQue());
        System.out.println(shelfQueue.deQueQue());
    } //me
}

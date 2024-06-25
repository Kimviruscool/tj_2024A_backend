package DAY14.Step5;

public class BookShelf extends Shelf implements Queue{
    @Override //재정의
    public void enQueue(String title) {
        shelf.add(title); //suepr 부모의 리스트에 타이틀을 넣어줌
    }

    @Override
    public String deQueQue() {
        return shelf.remove(0); //suepr에 shelf에 remove
    }

    @Override
    public int getSize() {
        return getCount(); //super에 shelf에 getcount
    }
}

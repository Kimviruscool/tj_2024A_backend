package day08.my.Step1;

public class Book {
    private String bookName;
    private String author;
    
    //생성자
    public Book(){}

    //this 멤버변수 매개변수를 구분지을때 사용 this.bookName (멤버변수)
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    //Method
    //getter & setter
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //책 정보를 출력해주는 메서드 
    //일반 함수
    public void showBookInfo(){
        System.out.println(bookName + "," + author);
    }
}

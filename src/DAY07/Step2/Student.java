package DAY07.Step2;

public class Student {
    //

    //default(생략) 같은 패키지/폴더 내 클래스끼리 공개
    //멤버변수 /필드

    //getter and setter get : 호출 , set : 저장하다
     //private 선언된 멤버변수/필드가 외부로부터 접근하기 위해 필요한 함수
    int studentID;
    private String studentName;
    int grade;
    String address;
    //생성자 X
    
    
    //메소드

    //우클릭 > 생성 > gett 및 setter 생성
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

package DAY09.STEP2;

public class Student2 {
    //1. 클래스변수/정적변수
    private static int serialNum = 1000;
    //2. 멤버변수/필드
    public String studentName;
    public int studentID;

    //생성자
    public Student2(){
        serialNum++;
        this.studentID = serialNum;

    }

    //메소드


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        int i = 10;
//        studentName = "이지원"; //스태틱 함수 내에서는 멤버변수 사용불가 (static이 먼저라서)
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }

}

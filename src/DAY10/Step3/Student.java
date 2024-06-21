package DAY10.Step3;

import java.util.ArrayList;

public class Student {
    //멤버변수/필드 생성
    int studentID; //정수 학생아이디 생성
    String studentName; //문자열 학생이름 생성
    ArrayList<Subject> subjectList; //배열만드는타입에 Subject타입을대입 subjectList 변수명으로 지정

    //생성자
    public Student(int studentID, String studentName) { //공개형 학생객체 (필수입력 학생아이디 , 학생이름)
        this.studentID = studentID; //객체의 멤버변수의 학생아이디에 객체의 지역변수 학생아이디 대입
        this.studentName = studentName; //객체의 멤버변수의 학생이름에 객체의 지역변수 학생이름 대입
        subjectList = new ArrayList<Subject>(); //변수명에 객체 생성한걸 대입
    }

    //한명의 학생이 여러 과목을 수강할수있기때문에 분류해놈
    public void addSubject(String name, int score) {
        Subject subject = new Subject(); //Subject 클래스와 연결된 객체생성 //객체가 완성될때 같이만들어지게하려고 저자가 이렇게짬
        subject.setName(name); //subjcet객체 안의 Name 지정
        subject.setScorePoint(score);//subjcet객체 안의 score지정
        subjectList.add(subject);//subject객체에 값을 subjectlist객체에 대입
    }

    //메소드
    public void showStudentInfo(){ //공개형 반환하지않음 변수이름
        int total = 0; //정수 변수이름 대입 0 : 값 초기화
        for(Subject s : subjectList){ //반복문 Subject타입 반복변수s : 몇번 도는지 코드상 알수없음 처음 인덱스부터 존재하는 인덱스까지
            total += s.getScorePoint(); //total이라는 변수에 s.(subject타입)안에있는.얻은점수 누적 대입
            System.out.println("학생" + studentName + "의" + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
        }
        System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}

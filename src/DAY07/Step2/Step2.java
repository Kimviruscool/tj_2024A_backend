package DAY07.Step2;

public class Step2 {
    public static void main(String[] args) {
        Student studentlee = new Student();
//        studentlee.studentName = "이상원"; //
        studentlee.setStudentName("이상원"); //비공개라서 private

        studentlee.grade = 3;

        System.out.println(studentlee.getStudentName());
    }
}

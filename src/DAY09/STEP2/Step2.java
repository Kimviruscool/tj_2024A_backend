package DAY09.STEP2;

public class Step2 {
    public static void main(String[] args) { //ms

        //학생[1]
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        studentLee.serialNum++;

        //학생[2]
        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(studentLee.serialNum);
        System.out.println(studentSon.serialNum);

        //=================================================
        Student1 studentlee = new Student1();
        studentlee.setStudentName("이지원");
        System.out.println(studentlee.serialNum);
        System.out.println(studentlee.studentName + "학번 : " + studentlee.studentID);

        Student1 studentKon = new Student1();
        studentKon.setStudentName("손수경");
        System.out.println(studentKon.serialNum);
        System.out.println(studentKon.studentName + "학번 : " + studentKon.studentID);

        //===============================================================================
        System.out.println(Student2.getSerialNum());




    } //me
}

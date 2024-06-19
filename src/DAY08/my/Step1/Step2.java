package DAY08.Step1;

import java.util.Arrays;

public class Step2 {
    public static void main(String[] args) {

        int[] array1 = new int[3];
        array1[0] = 30;
        //array1[1] = "유재석"; //타입이 다르므로 오류
        array1[1] = 'A'; //아스키코드 참조 자동 타입 변환
        array1[2] = (int)3.14; //강제 타입 변환
        // array1[3] = 'B'; // 존재하지 않는 인덱스 오류 발생

        System.out.println(Arrays.toString(array1));

        //[2]
        Book[] Library = new Book[5];
        for(int i = 0; i<Library.length; i++){
            System.out.println(Library[i]); //객체라서 null출력
            //Null값에 접근할수 없음 (도트/접근) 사용불가능
//             System.out.println(Library[i].showBookInfo());
        }

        Library[0] = new Book("책이름1", "저자1");
        Library[1] = new Book("책이름2", "저자2");
        Library[2] = new Book("책이름3", "저자3");
        Library[3] = new Book("책이름4", "저자4");
        Library[4] = new Book("책이름5", "저자5");

        for (int i = 0 ; i < Library.length; i++){
            System.out.println(Library[i]);
            //
            Library[i].showBookInfo();
        }

        //배열 항목 요소 값 초기화 비우기
        //배열 변수명[인덱스] = 각 타입의 초기값
        //-한번 할당된 배열의 길이는 다시 할당 되기전까지 고정길이

        //배열 항목/요소 순회
        //for(int i = 0 ; i < 배열변수명.length; i++){}


    }

    public static class 축구 {

        private int age;
        private int number;

        private String name;
        private String position;
        private String location;


        축구(){}

        축구(int number){
            this.number=number;
        }

        축구(int number, String name){
            this.number=number;
            this.name = name;
        }

        축구(int number, String name, int age){
            this.name=name;
        }

        축구(int number, String name, int age, String position){
            this.position=position;
        }

        축구(int number, String name, int age, String position, String location){
            this.location=location;
        }
        //getter and setter

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}

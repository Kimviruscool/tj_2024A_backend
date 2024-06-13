package DAY06.Step3;

public class Step31 {
    public static void main(String[] args) {
        광물 s1 = new 광물();

        광물 s2 = new 광물();

        s1.name = "돌멩이";
        s1.weight = 1.5;
        s1.height = 3.1;
        s1.color = "검정";

        System.out.println(s1.name);
        System.out.println(s1.weight + "KG입니다");
        System.out.println(s1.height + "CM입니다.");
        System.out.println(s1.color + "색 입니다.");
        s1.굴리기();
        s1.던지기();
        s1.쪼개기();

        s2.name = "금";
        s2.weight = 6.8;
        s2.height = 30;
        s2.color = "금";

        System.out.println(s2.name);
        System.out.println(s2.weight + "KG입니다");
        System.out.println(s2.height + "CM입니다.");
        System.out.println(s2.color + "색 입니다.");
        s2.굴리기();
        s2.던지기();
        s2.쪼개기();
    }
}

package DAY14.Step5;

import java.util.ArrayList;

public class Shelf {
    //1. 멤버변수
    //ArrayList<타입> 리스트변수명 vs 타입[] 배열변수명
    //add() : 리스트에 요소를 추가하는 함수
    //size() : 리스트내 요소들의 총 개수 (length)
    //remove(인덱스) : 리스트에 해당 인덱스 요소를 삭제하는 함수
    
    protected ArrayList<String> shelf;

    //2. 생성자
    //this ? : 매개변수와 멤버변수를 구분짓는 방법
    public Shelf(){
        shelf = new ArrayList<String>();
    }

    //3. 메소드
    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}

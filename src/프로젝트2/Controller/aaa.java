package 프로젝트2.Controller;

import java.util.Random;

public class aaa {


    public void 공격(  캐릭터 공격자 , 몬스터 피해자  ){
        피해자.hp -= new Random().nextInt( 공격자.de );
    }
    public void 피해 ( 몬스터 공격자 , 캐릭터 피해자 ) {
        피해자.hp -= new Random().nextInt( 10 );
    }
}

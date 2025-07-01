package chap1_7.inherit.player;

public class Hunter extends Player {


    int concentrate; // 집중게이지

    Hunter(String nickName){
        super(nickName,80);
        this.concentrate = 100;
    }

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("# 집중: " +this.concentrate);
    }

    void multiArrow(){
        System.out.printf("%s님이 멀티애로우를 시전합니다.",this.nickName);
    }



}

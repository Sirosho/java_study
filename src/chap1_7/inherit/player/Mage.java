package chap1_7.inherit.player;

public class Mage extends Player {


    int mana; // 마나게이지


    Mage(String nickName){
        super(nickName,50);
        this.mana = 100;
    }

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("# 마나: " +this.mana);
    }

    void fireBall(){
        System.out.printf("%s님이 파이어볼을 시전합니다.",this.nickName);
    }


}

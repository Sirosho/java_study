package chap1_7.inherit.player;

public class Mage extends Player {


    int mana; // 마나게이지


    Mage(String nickName) {
        super(nickName, 50);
        this.mana = 100;
    }

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("# 마나: " + this.mana);
    }

    void fireBall(Player target) {
        /*
         *   파이어볼을 맞은 플레이어의 직업이 전사면 50의 데미지를 입혀라
         *   마법사면 60의 데미지
         *   사냥꾼이면 40의 데미지를 입혀주세요.
         *
         *   만약 전사가 파이어볼을 맞으면 해당 전사는 돌진(dash)를 시전해야 합니다.
         * */

        if(this == target){
            System.out.println("자기 자신에게 시전할 수 없습니다.");
            return;
        }

        if (target instanceof Warrior) {
            target.hp -= 50;
            System.out.printf("%s님이 %s님에게 파이어볼을 시전합니다.\n", this.nickName, target.nickName);
            ((Warrior) target).dash(this);
        } else if (target instanceof Hunter) {
            target.hp -= 40;
            System.out.printf("%s님이 %s님에게 파이어볼을 시전합니다.\n", this.nickName, target.nickName);
        } else if (target instanceof Mage) {
            target.hp -= 60;
            System.out.printf("%s님이 %s님에게 파이어볼을 시전합니다.\n", this.nickName, target.nickName);
        }
        if (target.hp <= 0) {
            target.death();
        } else {
            System.out.printf(" %s 남은체력: %d \n", target.nickName, target.hp);
        }

    }


}

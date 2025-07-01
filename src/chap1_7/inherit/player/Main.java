package chap1_7.inherit.player;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("충격왕쇼킹");
        Hunter hunter = new Hunter("스티븐호킹");

        // 상속은 부모의 값을 가져오는것이 아니고
        // 부모의 객체를 생성한 뒤 자식 객체가 부모객체를 참조하는것
        warrior.showStatus();
        warrior.attack();

        mage.showStatus();
        mage.attack();

        hunter.showStatus();
        hunter.attack();

    }
}

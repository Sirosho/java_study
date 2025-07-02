package chap1_7.inherit.player;

public class Main {
    public static void main(String[] args) {
        Player warrior = new Warrior("주차왕파킹");
        Player mage = new Mage("충격왕쇼킹");
        Player hunter = new Hunter("스티븐호킹");
        Player mage2 = new Mage("간달프");

        // 상속은 부모의 값을 가져오는것이 아니고
        // 부모의 객체를 생성한 뒤 자식 객체가 부모객체를 참조하는것
        warrior.showStatus();
        warrior.attack();

        mage.showStatus();
        mage.attack();

        hunter.showStatus();
        hunter.attack();

        System.out.println("========================");

        ((Mage)mage).fireBall(warrior);

        ((Mage)mage).fireBall(hunter);

        ((Mage)mage).fireBall(mage2);

    }
}

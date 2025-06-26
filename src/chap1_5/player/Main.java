package chap1_5.player;

public class Main {
    public static void main(String[] args) {

        // heap 영역에 this 가 객체안에 같이 저장되어 객체자신의 주소를 갖고있음

        Player shocking = new Player("충격왕쇼킹");
        Player insulting = new Player("욕설왕퍼킹");


        System.out.println("shocking = " + shocking);
        System.out.println("insulting = " + insulting);

        shocking.attack(insulting);
        shocking.attack(insulting);
        shocking.attack(insulting);
        shocking.attack(insulting);
        shocking.attack(shocking);

    }
}

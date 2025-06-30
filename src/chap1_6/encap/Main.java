package chap1_6.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 1. 시동 걸기 위해서 먼저 엔진오일 분사
        // 2. 시동버튼 누르고 -> 시동걸기 ->  실린더 작동

        myCar.pressButton();

        // 정보가 은닉되어있지 않으면 마음대로 Main에서 데이터 접근이 가능
        // 기어 변속
        myCar.setMode("D");
        System.out.println("현재 모드: " + myCar.getMode());
    }
}

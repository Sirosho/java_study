package chap1_10.inter;

// 추상적
// 추상 클래스는 상속을 받아야하는데 다중상속이 불가능하여 여러 경우의 객체를 생성하기 불가능
// 인터페이스는 다중 상속이 가능하여 여러경우의 객체를 생성하기에 용이함
public interface Pet { //abstract class 를 생략가능

    // 애완동물의 필수 기능

    // 노는기능
    void handle(); // 데이터형만 적어주면 끝

    // 예방접종 기능
    boolean inject();

    // 난폭한 행동을 하는 기능
    void violent();

}

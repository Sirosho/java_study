package chap1_7.inherit.player;


/*
*                         Object(모든 객체의 부모)
*                           |
*                        Player
*                      /    |    \
*                 Warrior Mage Hunter
*                   /   \   /
*            Berserker   Warmage(기본적으로 이렇게 다중상속은 안됨 다른 기능을 쓰면 가능)
*
*
*
*
* */
// 부모로부터 기능과 속성을 물려받는 자식 클래스 (sub class)
// 상속은 IS A 관계 - 사자는 동물이다.   학생은 인간이다.
public class Warrior extends Player {

    int rage; // 분노게이지

    Warrior(String nickName){
        super(nickName,100);// 부모의 생성자 호출
                // 적어주지 않아도 기본생성자처럼 extends를 하면 디폴트로 숨어있음
                // 부모 객체의 기본생성자가 없어지고 파라미터 생성자가 되면 이렇게 에러가 남

        this.rage = 0;
    }

    // 오버라이딩: 부모가 물려준 메서드 내부를 고쳐 쓰는 것
    // 규칙: 1. 부모의 시그니처(이름, 리턴 데이터 타입, 파라미터)와 동일해야 함
    //       2. 접근제어자는 more public ex) 부모가 public이면 자식도 public이어야 함
            // 부모가 default면 자식도 default가 될 수 있음 아무튼 부모의 범위가 더 넓어야함
    // 상속이 많아지면 불안정해지므로 복잡해질수록 객체를 직접 넣어서 값을 쓰는 것(컴포지션)이 좋다



    @Override // 오버라이딩 룰을 위반했는지 체크
    void showStatus(){
        super.showStatus(); // 부모의 showStatus() 호출
        System.out.println("# 분노: " +this.rage);// 자식 클래스의 속성만 사용 가능

    }


    void dash(){
        System.out.printf("%s님이 돌진합니다.",this.nickName);
    }

}

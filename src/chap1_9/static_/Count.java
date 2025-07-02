package chap1_9.static_;

public class Count {
    /*
    *
    *   접근 제한자 (access modifier) - 클래스, 필드, 메서드, 생성자에 사용가능
    *   사용 제한자 (usage modifier)
    *   static - 필드, 메서드, 내부클래스 (일반 클래스 x)
    *   final - 클래스, 필드, 메서드
    *   abstract - 클래스, 메서드
    *
    * */

    // static - 정적, 공유됨, 객체가 필요없음
    // 공유될 데이터들은 static을 붙이는 것이 메모리 효율에 더 좋다

    // 객체나 배열은 heap 영역에 생성되어 주소를 담은 변수를 Stack에 저장하지만
    // static 변수는 data 영역이라는 새로운 영역에 저장되어 따로 참조가 됨
    // stack heap data 이렇게 세 영역이 있음
    public static int x; // 정적 필드       - 공유필드
    public int y;       // 인스턴스 필드    - 객체에 묶인 필드
    // 정적 메서드 : 모든 객체가 공유하는 기능, 객체생성없이 호출가능

    public static void m1(){
        System.out.println("static method call!!");
        // static은 static 끼리만 접근가능
        // static 메서드 내부에서는 this를 알수없음 사용불가
//        System.out.println(this);
        // 인스턴스 필드에도 접근 불가능
        // 파라미터로 매개변수를 넣어주거나 메서드 내부에서 객체생성하여 접근하는것은 가능
//        this.y = 100;
        // staic 필드에만 접근가능
        x = 100;
    }
    // 인스턴스 메서드: 객체별로 따로따로 행동하는 기능, 호출시 객체 생성이 필수
    public void m2(){

        System.out.println("instance method call!!");


        // 인스턴스 메서드는 정적 메서드나 필드를 호출 가능
        m1();
        x= 100;

    }


}

package chap2_2.lang;

public class WrapperExample {

    private int n; // 기본값 : 0
    private Integer i; // 기본값 : null


    public static void main(String[] args) {

        // 자바는 객체지향 언어이다.
        // 그러나 자바는 객체가 아닌 기본타입이 있다.
        // 기본 타입 -> 객체 : Wrapper 를 만듦
        // Byte,Short,Integer,Long,Float,Double,Boolean,Character

        Integer x1 = new Integer(10);
        // 이렇게쓰면 메서드를 넣을수도 있음

        // boxing: 그냥 기본타입처럼 써도 객체로 처리해주겠다.

        Integer x2 = 20;
        System.out.println(x1 + x2);

        // 현실은 보통 int를 씀..

        foo(x1);
    }

    static void foo(int a){ // 여기에 Integer 타입이 들어가도 알아서 언박싱해줌

    }

}

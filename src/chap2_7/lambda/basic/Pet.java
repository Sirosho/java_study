package chap2_7.lambda.basic;


// 함수형 인터페이스 - 람다를 사용할 수 있는지 체크
@FunctionalInterface
public interface Pet {


    // 이 인터페이스는 추상메서드가 딱 1개
    // 이 인터페이스는 람다를 사용할 수 있음
    // 람다는 하나뿐인 추상메서드만 구현하고, 인터페이스에 있는 기타메서드들은 그냥
    // 함께 따라오는 기능이다.
    // 다른것들은 있어도 상관이 없다 추상메서드만 하나면 가능
    void eat();
//    void sleep();

//    static void foo(){} static이나 default는 오버라이딩을 강요하지 않아서 있어도 상관없다
//    default void foo(){}

}

package chap1_8.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 50;
        child.p1 = 20;
        child.parentMethod();

        Parent parent = new Parent();
        parent.p1 = 99;
        parent.parentMethod();

        System.out.println("==============");


        // Upcasting


        /*
            타입을 업캐스팅하는 것은 자식타입의 객체를 부모타입으로
            사용하는 것을 말하며 이것은 자동으로 처리된다.

            그러나 업캐스팅이 되면 자식의 원래의 속성과 기능을
            사용할 수 없는 문제가 생김.

            따라서 자식이 원래 기능을 사용하려면 수동으로 다운캐스팅해야 함.
         */
        Parent castingChild = new Child();

        castingChild.parentMethod();

        // 다운캐스팅
        // 타입캐스팅보다 메서드 캐스팅이 우선순위가 높아서 괄호로 묶어주고 메서드 캐스팅을 해야함
        ((Child)castingChild).childMethod();

        // 연산자 우선순위 ( (), .(참조), 단항, 2항, 3항, 대입 )

        // 1 ~ 45 사이의 랜덤정수
//        int random = Math.floor(Math.random() * 45) + 1; js에서 했던 방식
        int random = (int)(Math.random() * 45) + 1;
                        //소수점 끊기를 int로 함
    }
}

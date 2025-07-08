package chap2_7.lambda.basic;



public class Main {

    public static void order(Pet pet){// 어떤 객체가 들어오냐에 따라서 eat()가 다르게 동작하게 됨
        System.out.println("주인님의 명령입니다!");
        //콜백함수 처리
        pet.eat();
        System.out.println("꺼어어어억!");
    }

    public static void main(String[] args) {
        // 인터페이스의 추상 메서드가 하나뿐인경우
        // 람다를 사용하여 익명 클래스를 간소화가 가능
        Pet dog = () -> {System.out.println("강아지는 사료를 먹어요~");};

       order(() -> {System.out.println("호랑이는 생고기를 먹어요 크앙");}); //파라미터도 어차피 Pet이라 생략

        System.out.println("==========================");

        order(()-> {
            System.out.println("하하호호");
            System.out.println("하하호호");

        });


    }
}

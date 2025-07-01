package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {


        Tesla t1 = new Tesla(); //타입이 car가 아니어도 자식객체라서 업캐스팅되어 배열에 들어감
        Car t2 = new Tesla();
        Car t3 = new Tesla();


        Car s2 = new Sonata();
        Car s1 = new Sonata();


        Car m1 = new Mustang();
        Car m2 = new Mustang();
        Car m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, m1, m2, m3};

        for (Car car : cars) {
            car.accelerate(); //자식들의 메서드가 다를 수 있으므로 기본적으로는 불가능
                                // 공통된 메서드가 있고 이렇게 호출하고싶으면
                                // 부모(Car) 에서 저 메서드이름을 만들고 자식들이 @Override 하면 사용가능
         }


    }
}

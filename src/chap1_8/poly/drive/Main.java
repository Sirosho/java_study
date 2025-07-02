package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {


        Tesla t1 = new Tesla(); //타입이 car가 아니어도 자식객체라서 업캐스팅되어 배열에 들어감
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();


        Sonata s2 = new Sonata();
        Sonata s1 = new Sonata();


        Mustang m1 = new Mustang();
        Mustang m2 = new Mustang();
        Mustang m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, m1, m2, m3};

        for (Car car : cars) {
            car.accelerate(); //자식들의 메서드가 다를 수 있으므로 기본적으로는 불가능
                                // 공통된 메서드가 있고 이렇게 호출하고싶으면
                                // 부모(Car) 에서 저 메서드이름을 만들고 자식들이 @Override 하면 사용가능
         }


        System.out.println("=====================");

        Driver heartping = new Driver("하츄핑");

        heartping.drive(t1);

        System.out.println("=====================");


        CarShop carShop = new CarShop();

        Car car1 = carShop.exportCar(6000);

        System.out.println("car1 = " + car1);
        car1.accelerate();

        Car car2 = carShop.exportCar(2000); // return null
        System.out.println("car2 = " + car2);
        if(car2 !=null)car2.accelerate(); // return이 null인데 메서드호출을 하면 에러가 나서 이렇게 널체크를 해줘야함


        System.out.println("============================");

        Sonata car3 =(Sonata)carShop.exportCar(3000); // 출력 형태를 알고있을 경우 이렇게 다운캐스팅을 걸어서 가져오기도 한다.
        car3.accelerate();
        car3.joinHyundaiMembership(); // Sonata 클래스에만 있는 매서드



    }
}

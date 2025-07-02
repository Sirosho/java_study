package chap1_8.poly.drive;

public class CarShop {

    // 돈을 주면 자동차를 출고해주는 기능

    public Car exportCar(int money){ // 이렇게 리턴타입에서도 부모타입을 적용해서 사용가능
        if(money == 6000){
            return new Tesla();
            //테슬라 출고
        }else if(money == 5000){
            return new Mustang();
            //머스탱 출고
        }else if(money == 3000){
            return new Sonata();
            // 소나타 출고
        }else{
            // 출고 안함
            return null;
        }

    }
}

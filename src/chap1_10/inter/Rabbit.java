package chap1_10.inter;

public class Rabbit extends Animal implements Pet, Wild {// 인터페이스를 상속받을때는 extends 가 아닌 implements 를 사용

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }


    @Override
    public void violent() {

    }
}

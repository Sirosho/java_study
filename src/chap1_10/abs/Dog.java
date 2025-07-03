package chap1_10.abs;

public class Dog implements Pet {
    @Override
    public void feed(){
        System.out.println("강아지는 사료를 냠냠냠");
    }
    @Override
    public void sleep(){
        System.out.println("강아지 쿨쿨쿨");
    }

}

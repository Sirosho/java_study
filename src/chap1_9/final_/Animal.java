package chap1_9.final_;

class Cat extends Animal{

}

// final class 하면: 상속 금지
public class Animal {

    // final 메서드: 오버라이딩 금지
    public final void eat(){
        System.out.println("밥을 얌냠냠~");
    }

}

//package chap1_7.protected_.pac2;
//
//import chap1_7.protected_.pac1.A;
//
//public class D extends A {
//
//    // protected는 다른 패키지에 접근을 허용하지 않음
//    // 상속관계가 있다면 부분적으로 생성자 내부 접근을 허용함
//    D(){
//        super.f1 = 10; //protected 접근 가능
//        super.f2 = 20; //default 접근 불가
//        super.m1(); //protected 접근 가능
//        super.m2(); //default 접근 불가
//        this.m2(); // 이건 super를 가리키는가
//
//    }
//
//    void test(){
//        A a = new A();
//        a.f1 = 10;
//        a.f2 = 20;
//        a.m1();//
//        a.m2();
//        new A();
//        new A(10);
//        new A("ㅇㅁㄴㅇㄴㅁ");
//    };
//
//}

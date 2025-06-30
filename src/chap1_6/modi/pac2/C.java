package chap1_6.modi.pac2;


import chap1_6.modi.pac1.A;

// A 클래스와 다른 패키지
public class C {

    C(){
        A a = new A();// public 가능
//        A b = new A(200);// default
//        A c = new A(2.1);// private

        a.f1 =10; // public 가능
//        a.f2 =20;// default 불가능
//        a.f3 =30;// private 불가능

        a.m1();// public 가능
//        a.m2();// default 불가능
//        a.m3();// private 불가능

//        new B();// B 클래스가 디폴트라 다른패키지는 불가능
    }
}

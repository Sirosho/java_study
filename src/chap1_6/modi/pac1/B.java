package chap1_6.modi.pac1;


// A클래스와 같은 패키지
// 클래스에는 제한자를 2개만 붙일 수 있음 public, default
class B {

   public B(){
        A a = new A();
        A b = new A(100); //default 생성자 호출
//        A c = new A(1.5);// A클래스의 private 생성자 호출 불가능

        a.f1 =10;
        a.f2 =20;
//        a.f3 =30; 프라이빗

    }
}

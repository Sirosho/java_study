package chap1_8.poly;

// 한 파일에 클래스를 여러개 만들기가 가능, 하지만 앞에 default만 가능함 public private를 붙이려면 파일명과 같아야함
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

/*
        Object
          |
          A
        /   \
       B    C
       |    |
       D    E

 */

public class Basic {

/*
*
*       다형성 : 객체가 다양한 형태(type)를 가질 수 있는 성질
*               - 자식 객체는 상속관계에 있는 타입을 사용할 수 있음
* */
public static void main(String[] args) {
    A x1 = new A();
    A x2 = new B();
    A x3 = new C();
    A x4 = new D();
    A x5 = new E();

}


}
